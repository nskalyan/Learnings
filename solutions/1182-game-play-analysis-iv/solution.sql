# Write your MySQL query statement below
select Round(count(Distinct player_id)/(select count(distinct player_id) from Activity),2) as fraction from activity where (player_id,event_date) in (
    select player_id,Date_add(min(event_date),Interval 1 day) from activity group by player_id
)
