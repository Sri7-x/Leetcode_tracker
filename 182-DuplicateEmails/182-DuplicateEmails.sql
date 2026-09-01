-- Last updated: 1/9/2026, 12:42:39 pm
# Write your MySQL query statement below
SELECT EMAIL FROM PERSON GROUP BY EMAIL HAVING COUNT(EMAIL)>1;
