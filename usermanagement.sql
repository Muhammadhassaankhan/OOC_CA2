delete usermanagementsystem;
show databases;
drop database usermanagementsystem;
show databases;
create database usermanagementsystem;
create database usermanagementsystem;
show databases;
use usermanagementsystem;
create table Admin_login(username varchar(50), password varchar(50));
insert into Admin_login values('CCT' , 'Dublin');
select * from Admin_login;
create table userinfo(fname varchar(50) not null, lname varchar(50) not null, date_of_birth varchar(30) not null,email varchar(100) not null unique,  username varchar(50) not null unique, password varchar(100) not null);
select * from Admin_login;
select * from userinfo;
alter table userinfo add unique (email,username);
select * from userinfo;
alter table userinfo modify date_of_birth varchar(30) not null;
select * from userinfo;
alter table userinfo add unique(username);
select * from userinfo;
alter table userinfo add constraint unique (email);
select * from usermanagementsystem;
select * from userinfo;
use usermanagementsystem;
select * from userinfo;
DROP TABLE userinfo;
use usermanagementsystem;
drop table userinfo;
select * from userinfo;
create table userinfo(fname varchar(50) not null, lname varchar(50) not null, date_of_birth varchar(30) not null,email varchar(100) not null unique,  username varchar(50) not null unique, password varchar(100) not null);
select * from userinfo;
drop table userinfo;
select * from userinfo;
create table userinfo(fname varchar(50) not null, lname varchar(50) not null, date_of_birth varchar(30) not null,email varchar(100) unique,  username varchar(50) unique, password varchar(100) not null);
select * from userinfo;
