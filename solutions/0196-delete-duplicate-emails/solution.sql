# Write your MySQL query statement below

  delete from person where id not in(
    SELECT * FROM (
        SELECT MIN(id)
        FROM Person
        GROUP BY email
    ) as keep_id
  )
