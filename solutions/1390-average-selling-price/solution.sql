# Write your MySQL query statement below

select p.product_id,
coalesce(round(sum(case when u.purchase_date between p.start_date and p.end_date then p.price * u.units else 0 end)/nullif(  sum(case when u.purchase_date between p.start_date and p.end_date then u.units else 0 end) ,0) ,2),0) as average_price from prices as p left join unitssold as u on p.product_id=u.product_id group by p.product_id;
