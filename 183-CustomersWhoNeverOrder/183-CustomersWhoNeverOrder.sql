-- Last updated: 1/9/2026, 12:42:37 pm
# Write your MySQL query statement below
SELECT NAME AS Customers FROM Customers c left join Orders o on c.id=o.customerId where o.customerId is NULL; 