drop database if exists DxcNew;

create database dxcnew;

use DxcNew;

drop table if exists Employ;

Create Table Employ
(
    Empno Int Primary Key,
    Name varchar(30),
    Gender Enum('MALE','FEMALE'),
    Dept varchar(30),
    Desig varchar(30),
    Basic Numeric(9,2)
);

Insert Into Employ(Empno, Name, gender,Dept,Desig,Basic)
values(1,'Anusha','FEMALE','Java','Programmer',84233),
(2,'Jagan Mohan','MALE','Dotnet','Manager',89322),
(3,'Jayanth','MALE','Java','Expert',83234),
(4,'Jyothi','FEMALE','Dotnet','Expert',87244),
(5,'Kanchana','FEMALE','Java','Programmer',88322);