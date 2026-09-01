-- Last updated: 1/9/2026, 12:41:57 pm
# Write your MySQL query statement below
Select e.name  ,b.bonus from Employee e left join bonus b on e.empId =b.empId where b.bonus<1000 or b.bonus is NULL;