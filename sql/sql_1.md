sql 문제 풀이
==============

첫번째 문제.
---------------
"SELECT concat(NAME, 
              CASE WHEN occupation = "Doctor" THEN "(D)" 
              WHEN occupation = "Professor" THEN "(P)" 
              WHEN occupation = "Singer" THEN "(S)" 
              WHEN occupation = "Actor" THEN "(A)" END )
FROM OCCUPATIONS ORDER BY NAME; 

SELECT "There are a total of ", 
COUNT(OCCUPATION), 
concat(LOWER(OCCUPATION),"s.") 
FROM OCCUPATIONS 
GROUP BY OCCUPATION 
ORDER BY COUNT(OCCUPATION) ASC, 
OCCUPATION ASC"

[해커링크 sql_문제1] (https://www.hackerrank.com/challenges/the-pads/problem)

두번째 문제.
------------
 ####미완.

"select *
    from 
    (
        SELECT 
        CASE WHEN Occupation = 'Doctor' THEN name END AS Doctor , 
        CASE WHEN Occupation = 'Professor' THEN name END AS Professor , 
        CASE WHEN Occupation = 'Singer' THEN name END AS Singer , 
        CASE WHEN Occupation = 'Actor' THEN name END AS Actor , 
        RANK() OVER (PARTITION BY Occupation order by name) AS rank_
        FROM 
        Occupations 
    ) 
    group by rank_
    order by rank_;"

[해커링크 sql_문제2] (https://www.hackerrank.com/challenges/occupations/problem)




