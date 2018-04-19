# --- Sample dataset
 
# --- !Ups
 
delete from book;
delete from genre;
delete from author;
delete from publisher;

insert into genre (id, name) values (1, 'Fiction');
insert into genre (id, name) values (2, 'Non-Fiction');
insert into genre (id, name) values (3, 'Sci-Fi');
insert into genre (id, name) values (4, 'Comics and Graphic Novels');
insert into genre (id, name) values (5, 'Kids');
insert into genre (id, name) values (6, 'Teens');
insert into genre (id, name) values (7, 'Education and Learning');
insert into genre (id, name) values (8, 'Craft and Hobby');
insert into genre (id, name) values (9, 'Entertainment');
insert into genre (id, name) values (10, 'Crime');
insert into genre (id, name) values (11, 'Humor');
insert into genre (id, name) values (12, 'Poetry and Drama');
insert into genre (id, name) values (13, 'Reference');
insert into genre (id, name) values (14, 'Romance');
insert into genre (id, name) values (15, 'Bestseller');
insert into genre (id, name) values (16, 'New Releases');
insert into genre (id, name) values (17, 'Sale');
insert into genre (id, name) values (18, 'Horror');
insert into genre (id, name) values (19, 'Thriller');
insert into genre (id, name) values (20, 'Fantasy');

insert into author (id, fname, lname) values (1, 'Graham', 'Parke');
insert into author (id, fname, lname) values (2, 'Terry', 'Pratchett');
insert into author (id, fname, lname) values (3, 'Graham', 'McNeill');
insert into author (id, fname, lname) values (4, 'Mark', 'Hamill');
insert into author (id, fname, lname) values (5, 'Angela', 'Rope');
insert into author (id, fname, lname) values (6, 'Jay', 'Asher');
insert into author (id, fname, lname) values (7, 'Roddy', 'Dohyl');
insert into author (id, fname, lname) values (8, 'Brian K.', 'Vaughan');
insert into author (id, fname, lname) values (9, 'Johnson','White');
insert into author (id, fname, lname) values (10, 'Marjorie', 'Green');
insert into author (id, fname, lname) values (11, 'Cheryl', 'Carson');
insert into author (id, fname, lname) values (12, 'Michael','OLeary');
insert into author (id, fname, lname) values (13, 'Meander','Smith');
insert into author (id, fname, lname) values (14, 'Ernest', 'Cline');

insert into publisher (id,name,address,country) values (1, 'Cornerstone', 'aa', 'aabb');
insert into publisher (id,name,address,country) values (2, 'Dummies', 'cc', 'dd');
insert into publisher (id,name,address,country) values (3, 'Image', 'ff', 'dd');
insert into publisher (id,name,address,country) values (4, 'Game Workshops', 'ddd', 'dddd');
insert into publisher (id,name,address,country) values (5, 'Penguin Books', 'ddd', 'ddfdd');
insert into publisher (id,name,address,country) values (6, 'Outskirts Press', 'ddd', 'ddfdd');

insert into book (id,title,author_id,description,publisher_id,stock,price) values ( 1,'No Hope For Gomez', 1,'Its the age-old tale: Boy meets girl. Boy stalks girl.Girl already has a stalker.Boy becomes her stalker-stalker. ', 6 ,10, 8.99 );
insert into book (id,title,author_id,description,publisher_id,stock,price) values ( 2,'A Slip of the Keyboard',2,'Terry Pratchett telling you his experience of writing',2,10,9.00 );
insert into book (id,title,author_id,description,publisher_id,stock,price) values ( 3,'Ready Player One', 14, 'Dusotopian Society', 1, 8, 4.50 );
insert into book (id,title,author_id,description,publisher_id,stock,price) values ( 4,'Saga',8, 'Star Wars Meets Romeo and Juilet', 3, 15, 9.99 );
insert into book (id,title,author_id,description,publisher_id,stock,price) values ( 5,'The BFG', 7,'Big Friendly Giant', 5, 7 , 5.99 );
insert into book (id,title,author_id,description,publisher_id,stock,price) values ( 6,'13 Reasons Why',6,'Hannah Baker commited suicide but left behind 13 reasons on cassette tapes of why she choose to do this', 5, 20,8.00);
insert into book (id,title,author_id,description,publisher_id,stock,price) values ( 7,'Student Life for Dummies', 13, 'How to survive the student years',2, 3,25.00 );
insert into book (id,title,author_id,description,publisher_id,stock,price) values ( 8,'Embroidory and Knitting', 5, 'Learn how to make crafty bits for all occassions',5, 5,10.00 );
insert into book (id,title,author_id,description,publisher_id,stock,price) values ( 9,'Star Wars Companion Guide',4, 'Help build your character', 4, 4, 22.00);
insert into book (id,title,author_id,description,publisher_id,stock,price) values ( 10,'I Know Who You Are',11,'What would you do if you spent your time on the run', 5,5,5.99 );

insert into genre_book (genre_id,book_id) values (1,1);
insert into genre_book (genre_id,book_id) values (2,2);
insert into genre_book (genre_id,book_id) values (3,3);
insert into genre_book (genre_id,book_id) values (4,4);
insert into genre_book (genre_id,book_id) values (5,5);
insert into genre_book (genre_id,book_id) values (6,6);
insert into genre_book (genre_id,book_id) values (7,7);
insert into genre_book (genre_id,book_id) values (8,8);  
insert into genre_book (genre_id,book_id) values (9,9);
insert into genre_book (genre_id,book_id) values (10,10);
 
