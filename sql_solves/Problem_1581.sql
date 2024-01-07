SELECT customer_id, COUNT(*) "count_no_trans"
FROM Visits V
WHERE V.visit_id NOT IN (SELECT visit_id FROM Transactions)
GROUP BY customer_id
ORDER by customer_id