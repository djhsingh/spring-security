create table users(username varchar(50) not null primary key,password varchar(500) not null,enabled boolean not null);
create table authorities (username varchar(50) not null,authority varchar(50) not null,constraint fk_authorities_users foreign key(username) references users(username));
create unique index ix_auth_username on authorities (username,authority);



create table customer(id int auto_increment not null primary key, email varchar(50) not null,pwd varchar(500) not null
,role varchar(500) not null);