select * from employees
select * from departments;

-- sql oracle hello world
select 'hello world' from dual;
-- menampilkan tanggal sekarang
select current_date from dual;
-- operasi matematika 
select 1 + 1 hasil from dual;
select 2 + 2 * 10 from dual;
-- upper lower
SELECT UPPER('HAloWodrld') from dual;
SELECT LOWER('HAloWodrld') FROM DUAL;

-- SELECT COLOMN and ALIAS NAME
select 
  emp.first_name || '-' || emp.last_name AS full_name,
  emp.first_name nama_depan, 
  emp.last_name as nama_belakang,
  emp.salary "Gaji",
  emp.salary * 2 bonus
from hr.employees emp;

-- where conditional
select * 
  from employees 
  where 
  upper(first_name) = upper('alAna') OR 1 = 1 
  and employee_id = 100;
  
-- in condition
SELECT * FROM employees
where employee_id = 100 OR employee_id = 104 OR employee_id = 105;

SELECT * FROM employees
where employee_id in (100, 104, 105);

-- like condition 
select * from employees where first_name like '%a'
select * from employees where first_name like 'A%'
select * from employees where first_name like '%a%'
