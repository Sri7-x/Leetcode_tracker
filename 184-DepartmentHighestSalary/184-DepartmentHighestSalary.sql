-- Last updated: 1/9/2026, 12:42:36 pm
# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.salary as Salary from Employee e join department d on e.departmentId=d.id where e.salary= (select max(salary)from employee where departmentId=e.departmentId); 