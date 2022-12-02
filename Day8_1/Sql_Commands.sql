-- Change to 'dxc' database 

use dxc;

-- display all tables from dxc database 

show tables;

-- display info about Emp table

desc Emp;

-- Display info. about Dept table 

desc Dept;

-- Display all records from Emp table 

select * from Emp;

-- Display all records from Dept table 

select * from Dept;

-- Display Empno, Ename, job, sal from Emp table 

select Empno, Ename, job, sal
from Emp;

desc dept;

-- Display deptno, dname, loc from Dept table 

select Deptno, Dname, loc from Dept;

-- Where clause : Used to dispaly filtered records from the table 

-- Display all records from Emp whose sal > 2000;

select * from Emp
where sal > 2000;

-- Display all records from Emp whose job is 'MANAGER'

select * from Emp where job='Manager';

-- Display info for whom ename is 'king'

select * from Emp where ename='KING';

-- Between...AND : Used to display records from start to end range

select * from Emp 
where sal between 1000 and 2500;

select * from Emp 
where sal NOT between 1000 and 2500;

-- In clause : Used to display records for multiple values of particular column

select * from emp where job in('CLERK','MANAGER','PRESIDENT');

select * from emp where job NOT in('CLERK','MANAGER','PRESIDENT');

-- LIKE Operator : Used to display data w.r.t. Wild cards

-- Display all records whose name start with 'S' 

select * from Emp where ename like 'S%';

-- Display all records whose name ends with 'S'

select * from Emp where ename like '%s';

-- Order BY : used to display data w.r.t. Specific field(s) in 
-- ascending or descending order

select Empno, ename, job, sal,mgr from emp 
order by sal;

select Empno, ename, job, sal,mgr from emp 
order by ename;

select Empno, ename, job, sal,mgr from emp 
order by ename desc;

select Empno, ename, job, sal,mgr from emp 
order by Job,Ename;

select Empno, ename, job, sal,mgr from emp 
order by Job,Ename desc;

