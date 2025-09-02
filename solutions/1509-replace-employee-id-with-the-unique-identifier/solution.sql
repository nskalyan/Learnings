# Write your MySQL query statement below

select epu.unique_id,ep.name from Employees ep left join EmployeeUNI epu on epu.id=ep.id;
