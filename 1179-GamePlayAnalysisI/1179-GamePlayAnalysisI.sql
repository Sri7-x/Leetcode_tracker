-- Last updated: 1/9/2026, 12:41:25 pm
# Write your MySQL query statement below
select player_id,Min(event_date) as first_login from Activity group by player_id;