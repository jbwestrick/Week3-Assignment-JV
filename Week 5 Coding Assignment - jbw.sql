select * from employees where birth_date < '1965-01-01';

select * from employees where hire_date > '1991-01-01' and gender = 'F';

select first_name, last_name from employees where last_name like 'F%' limit 50;

INSERT INTO employees VALUES ('100', '2000-02-04', 'Grumpy', 'Smurf', 'M', '2015-04-15') , ('101', '1950-09-15', 'Sleepy', 'Dog', 'F', '2020-04-03') , ('102', '1940-12-01', 'Cranky', 'Luna', 'F', '2021-11-01');
select * from employees;

UPDATE employees set first_name = 'Bob' where emp_no = '10023'; 
select * from employees where emp_no = '10023';
 
UPDATE employees SET hire_date = '2002-01-01' WHERE first_name like 'P%' or last_name like 'P%';
select * from employees where first_name like 'P%' or last_name like 'P%';
 
 select * from  employees where emp_no < '10000';
 DELETE FROM employees where emp_no < '10000';
 
  select * from  employees where emp_no in ('10048', '10099', '10234','20089');
  DELETE FROM  employees where emp_no in ('10048', '10099', '10234','20089');