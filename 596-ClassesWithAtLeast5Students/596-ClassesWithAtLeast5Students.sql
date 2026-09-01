-- Last updated: 1/9/2026, 12:41:49 pm
# Write your MySQL query statement below
select class from Courses group by class having  count(*)>=5;