-- Last updated: 1/9/2026, 12:42:42 pm
# Write your MySQL query statement below
SELECT P.firstName,P.lastName,A.city,A.state FROM Person P LEFT JOIN Address A ON P.PERSONID=A.PERSONID;