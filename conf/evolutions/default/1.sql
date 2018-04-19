# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table author (
  id                            bigint auto_increment not null,
  fname                         varchar(255),
  lname                         varchar(255),
  constraint pk_author primary key (id)
);

create table basket (
  id                            bigint auto_increment not null,
  customer_email                varchar(255),
  constraint uq_basket_customer_email unique (customer_email),
  constraint pk_basket primary key (id)
);

create table book (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  author_id                     bigint,
  description                   varchar(255),
  publisher_id                  bigint,
  stock                         integer not null,
  price                         double not null,
  constraint pk_book primary key (id)
);

create table book_wishlist (
  book_id                       bigint not null,
  wishlist_id                   bigint not null,
  constraint pk_book_wishlist primary key (book_id,wishlist_id)
);

create table genre (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_genre primary key (id)
);

create table genre_book (
  genre_id                      bigint not null,
  book_id                       bigint not null,
  constraint pk_genre_book primary key (genre_id,book_id)
);

create table order_item (
  id                            bigint auto_increment not null,
  order_id                      bigint,
  basket_id                     bigint,
  book_id                       bigint,
  quantity                      integer not null,
  price                         double not null,
  constraint pk_order_item primary key (id)
);

create table user (
  role                          varchar(31) not null,
  email                         varchar(255) not null,
  name                          varchar(255),
  password                      varchar(255),
  department                    varchar(255),
  street1                       varchar(255),
  street2                       varchar(255),
  town                          varchar(255),
  post_code                     varchar(255),
  credit_card                   varchar(255),
  constraint pk_user primary key (email)
);

create table publisher (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  address                       varchar(255),
  country                       varchar(255),
  constraint pk_publisher primary key (id)
);

create table shop_order (
  id                            bigint auto_increment not null,
  order_date                    timestamp,
  customer_email                varchar(255),
  constraint pk_shop_order primary key (id)
);

create table wishlist (
  id                            bigint auto_increment not null,
  customer_email                varchar(255),
  constraint uq_wishlist_customer_email unique (customer_email),
  constraint pk_wishlist primary key (id)
);

alter table basket add constraint fk_basket_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;

alter table book add constraint fk_book_author_id foreign key (author_id) references author (id) on delete restrict on update restrict;
create index ix_book_author_id on book (author_id);

alter table book add constraint fk_book_publisher_id foreign key (publisher_id) references publisher (id) on delete restrict on update restrict;
create index ix_book_publisher_id on book (publisher_id);

alter table book_wishlist add constraint fk_book_wishlist_book foreign key (book_id) references book (id) on delete restrict on update restrict;
create index ix_book_wishlist_book on book_wishlist (book_id);

alter table book_wishlist add constraint fk_book_wishlist_wishlist foreign key (wishlist_id) references wishlist (id) on delete restrict on update restrict;
create index ix_book_wishlist_wishlist on book_wishlist (wishlist_id);

alter table genre_book add constraint fk_genre_book_genre foreign key (genre_id) references genre (id) on delete restrict on update restrict;
create index ix_genre_book_genre on genre_book (genre_id);

alter table genre_book add constraint fk_genre_book_book foreign key (book_id) references book (id) on delete restrict on update restrict;
create index ix_genre_book_book on genre_book (book_id);

alter table order_item add constraint fk_order_item_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_item_order_id on order_item (order_id);

alter table order_item add constraint fk_order_item_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_item_basket_id on order_item (basket_id);

alter table order_item add constraint fk_order_item_book_id foreign key (book_id) references book (id) on delete restrict on update restrict;
create index ix_order_item_book_id on order_item (book_id);

alter table shop_order add constraint fk_shop_order_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;
create index ix_shop_order_customer_email on shop_order (customer_email);

alter table wishlist add constraint fk_wishlist_customer_email foreign key (customer_email) references user (email) on delete restrict on update restrict;


# --- !Downs

alter table basket drop constraint if exists fk_basket_customer_email;

alter table book drop constraint if exists fk_book_author_id;
drop index if exists ix_book_author_id;

alter table book drop constraint if exists fk_book_publisher_id;
drop index if exists ix_book_publisher_id;

alter table book_wishlist drop constraint if exists fk_book_wishlist_book;
drop index if exists ix_book_wishlist_book;

alter table book_wishlist drop constraint if exists fk_book_wishlist_wishlist;
drop index if exists ix_book_wishlist_wishlist;

alter table genre_book drop constraint if exists fk_genre_book_genre;
drop index if exists ix_genre_book_genre;

alter table genre_book drop constraint if exists fk_genre_book_book;
drop index if exists ix_genre_book_book;

alter table order_item drop constraint if exists fk_order_item_order_id;
drop index if exists ix_order_item_order_id;

alter table order_item drop constraint if exists fk_order_item_basket_id;
drop index if exists ix_order_item_basket_id;

alter table order_item drop constraint if exists fk_order_item_book_id;
drop index if exists ix_order_item_book_id;

alter table shop_order drop constraint if exists fk_shop_order_customer_email;
drop index if exists ix_shop_order_customer_email;

alter table wishlist drop constraint if exists fk_wishlist_customer_email;

drop table if exists author;

drop table if exists basket;

drop table if exists book;

drop table if exists book_wishlist;

drop table if exists genre;

drop table if exists genre_book;

drop table if exists order_item;

drop table if exists user;

drop table if exists publisher;

drop table if exists shop_order;

drop table if exists wishlist;

