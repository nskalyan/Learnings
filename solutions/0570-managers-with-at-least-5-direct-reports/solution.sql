# Write your MySQL query statement below

--  select name from  employee where id= any(select managerid from employee e group by managerId having count(*)>=5) ;

SELECT m.name
FROM employee e
JOIN employee m ON e.managerId = m.id
group by m.id
having count(*)>=5;

