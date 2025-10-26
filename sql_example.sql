-- SQL example: simple analytics query
SELECT species, COUNT(*) AS count
FROM iris_table
GROUP BY species
ORDER BY count DESC;
