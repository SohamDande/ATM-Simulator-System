create database bankmanagementsystem;

use bankmanagementsystem;

create table signup 
(formno varchar(20),  
name varchar(20),
father_name varchar(20),
dob varchar(20),
gender varchar(20),
email varchar(40),
marital_status varchar(20),
address varchar(50),
city varchar(20),
pincode varchar(20),
country varchar(25));
select * from signup;


create table signuptwo 
(formno varchar(20),  
religion varchar(20),
nationality varchar(30),
income varchar(20),
education varchar(20),
occupation varchar(40),
passport varchar(20),
emirate varchar(20),
seniorcitizen varchar(20),
existingaccount varchar(20));
select * from signuptwo;


create table signupthree 
(formno varchar(20),  
accountType varchar(40),
cardnumber varchar(30),
pin varchar(20),
facility varchar(100));
select * from signupthree;


create table login
(formno varchar(20),  
cardnumber varchar(40),
pin varchar(20));
select * from login;

drop table bank;

create table bank
(pin varchar(20),  
date varchar(50),
type varchar(20),
amount varchar(20));
select * from bank;

show tables;

UPDATE bank SET amount = REPLACE(amount, ' AED', '');