-- Last updated: 1/9/2026, 12:41:54 pm
# Write your MySQL query statement below
select customer_number from Orders group by customer_number order by count(*) DESC limit 1;