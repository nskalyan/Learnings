# Write your MySQL query statement below

select name as Customers from (select o.id as Order_id,c.name ,o.customerId as cid from Customers as c LEFT JOIN Orders as o on c.id=o.customerId) as d where d.cid is null;
