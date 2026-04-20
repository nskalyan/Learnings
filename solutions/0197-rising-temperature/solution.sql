# Write your MySQL query statement below

select id from weather w1 where w1.temperature > (select w2.temperature from weather  w2 where w2.recordDate=Date_sub(w1.recordDate,Interval 1 day))
