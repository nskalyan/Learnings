# Write your MySQL query statement below
select d.name as Department,e1.name as Employee,e1.salary as Salary from employee e1 left join department d on e1.departmentId=d.id where (e1.departmentId,e1.salary) in (select e.departmentId,max(e.salary) from employee e group by e.departmentId) 
