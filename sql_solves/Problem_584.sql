/* Write your PL/SQL query statement below */

SELECT name FROM Customer WHERE NVL(referee_id, 0) <> 2;