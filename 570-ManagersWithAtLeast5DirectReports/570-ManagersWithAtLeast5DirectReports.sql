-- Last updated: 1/9/2026, 12:41:59 pm
# Write your MySQL query statement below
select name from employee where id in(select managerId from Employee group by managerId having count(*)>=5);