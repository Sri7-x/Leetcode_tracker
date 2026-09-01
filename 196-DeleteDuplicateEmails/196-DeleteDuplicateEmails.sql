-- Last updated: 1/9/2026, 12:42:34 pm
# Write your MySQL query statement below
delete p1 from person p1,person p2 
where p1.email=p2.email and p1.id>p2.id;