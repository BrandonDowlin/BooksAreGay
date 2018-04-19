# --- !Ups
delete from user;

insert into user (email,name,password,role) values ( 'admin@books.com', 'Rachel Admin', 'password', 'admin' );

insert into user (email,name,password,role) values ( 'manager@books.com', 'Rachel Manager', 'password', 'manager' );

insert into user (email,name,password,role) values ( 'customer@books.com', 'Charlie Customer', 'password', 'customer' );
