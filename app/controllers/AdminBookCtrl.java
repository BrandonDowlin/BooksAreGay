package controllers;

import controllers.security.*;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


import models.users.*;
import models.books.*;
import views.html.bookAdmin.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;


@Security.Authenticated(Secured.class)
@With(CheckIfAdmin.class)

public class AdminBookCtrl extends Controller {

    private FormFactory formFactory;
    private Environment e;
    
    @Inject
    public AdminBookCtrl(FormFactory f,Environment env) 
    {
        this.formFactory = f;
        this.e = env;
    }
        // Get a user - if logged in email will be set in the session
    private User getCurrentUser() 
    {
		User u = User.getLoggedIn(session().get("email"));
		return u;
	}
    public Result index() 
    {
        return redirect(controllers.routes.BookCtrl.listBooks(0, ""));
    }

    @Transactional
    public Result addBook() 
    {
        Form<Book> addBookForm = formFactory.form(Book.class);
        return ok(addBook.render(addBookForm, getCurrentUser()));
    }
    @Transactional
    public Result addBookSubmit() 
    {
        Book newBook;
        String saveImageMsg;
        Form<Book> newBookForm = formFactory.form(Book.class).bindFromRequest();

        if (newBookForm.hasErrors()) 
        {
            flash("failure", "Form error");
            return badRequest(addBook.render(newBookForm, 
            getCurrentUser()));
        }
        else
        {
            newBook = newBookForm.get();
            newBook.save();
            for (Long gen : newBook.getGenSelect()) 
            {
                newBook.getGenres().add(Genre.find.byId(gen));
            }
                newBook.update();
        }
        MultipartFormData data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");

        saveImageMsg = saveFile(newBook.getId(), image);

        flash("success", "Book " + newBook.getTitle() + " has been created/updated " + saveImageMsg);

        return redirect(controllers.routes.BookCtrl.index());
    }
    
   
    @Transactional
    public Result deleteBook(Long id) 
    {
        Book.find.ref(id).delete();

        flash("success", "Book has been deleted");
        
        return redirect(routes.BookCtrl.index());
    }


    @Transactional
    public Result updateBook(Long id)
    {
        Book b;
        Form<Book> bookForm;

        try 
        {
            b = Book.find.byId(id);
            bookForm = formFactory.form(Book.class).fill(b);
        } 
        catch (Exception ex) {
            return badRequest("error");
        }
        return ok(updateBook.render(id, bookForm,getCurrentUser()));
    }

    @Transactional
    public Result updateBookSubmit(Long id) 
    {
        String saveImageMsg;
        Form<Book> updateBookForm = formFactory.form(Book.class).bindFromRequest();
        if (updateBookForm.hasErrors())
        {
            return badRequest(updateBook.render(id,updateBookForm, getCurrentUser()));
        }
        else
        {
            Book b = updateBookForm.get();
            b.setId(id);                    
            
            List<Genre> newGens = new ArrayList<Genre>();
            for (Long gen : b.getGenSelect())
            {
                newGens.add(Genre.find.byId(gen));
            }

            b.setGenres(newGens);
            b.update();
        
            MultipartFormData data = request().body().asMultipartFormData();
            FilePart<File> image = data.getFile("upload");
        
            saveImageMsg = saveFile(b.getId(), image);
        
            flash("success", "Book " + b.getTitle() + " has been created/updated " + saveImageMsg);
                    
            return redirect(controllers.routes.BookCtrl.index());
            }
        }

            

    public String saveFile(Long id, FilePart<File> uploaded) 
    {
        if (uploaded != null)
        {
            String mimeType = uploaded.getContentType(); 
            if (mimeType.startsWith("image/")) 
            {
                String fileName = uploaded.getFilename();                
                
                File file = uploaded.getFile();
                
                IMOperation op = new IMOperation();
                
                op.addImage(file.getAbsolutePath());
                
                op.resize(300, 200);
                
                op.addImage("public/images/bookImages/" + id + ".jpg");
                
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.resize(100);
                thumb.addImage("public/images/bookImages/thumbnails/" + id + ".jpg");
                File dir = new File("public/images/bookImages/thumbnails/");
                if (!dir.exists())
                {
                    dir.mkdirs();
                }
                
                ConvertCmd cmd = new ConvertCmd();
                try
                {
                    cmd.run(op);
                    cmd.run(thumb);
                }
                catch(Exception e) 
                {
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "/ no file";
    }
    public String saveFileOld(Long id, FilePart<File> uploaded)
    {
        String mimeType = uploaded.getContentType(); 
        if (uploaded != null) 
        {
            if (mimeType.startsWith("image/")) 
            {
                String fileName = uploaded.getFilename();      
                String extension = "";
                int i = fileName.lastIndexOf('.');
                if (i >= 0) {
                    extension = fileName.substring(i+1);
                }
                
                File file = uploaded.getFile();
                
                File dir = new File("public/images/bookImages");
                if (!dir.exists()) 
                {
                    dir.mkdirs();
                }
                
                if(file.renameTo(new File("public/images/bookImages/", id + "." + extension))) {
                    return "/ file uploaded";
                } else {
                    return "/ file upload failed";
                }
            }
        }
        return "/ no file";
    }

    
}