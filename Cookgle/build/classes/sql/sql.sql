create table Products(
   pid varchar2(8) primary key,
   pname varchar2(50),
   category varchar2(50),
   price varchar2(20),
   img varchar2(100),
   userid varchar2(100)
);

CREATE SEQUENCE pid START WITH 1 INCREMENT BY 1;

create table users(
id varchar2(30) constraint PK_ID primary key,
password varchar2(50) not null,
name varchar2(20) not null,
role varchar2(10) default 'user'
);