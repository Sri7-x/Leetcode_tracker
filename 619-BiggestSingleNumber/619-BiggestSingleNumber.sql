-- Last updated: 1/9/2026, 12:41:47 pm
# Write your MySQL query statement below
select max(num) num from MyNumbers where num in(select num from mynumbers group by num having count(*)=1)