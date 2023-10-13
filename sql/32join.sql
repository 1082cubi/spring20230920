USE w3schools;
SELECT *
FROM employees e1 JOIN employees e2;

SELECT e1.LastName,e1.BirthDate, e2.LastName,e2.BirthDate
FROM employees e1 JOIN employees e2
WHERE e1.BirthDate < e2.BirthDate
AND e2.LastName = 'leverling';

-- 예) 'Ipoh Coffee' 보다 비싼 상품명 조회

SELECT o2.ProductName
FROM products o1 JOIN products o2
WHERE o1.Price < o2.Price
AND o1.ProductName = 'Ipoh Coffee';

