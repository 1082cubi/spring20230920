SELECT * FROM  customers;
SELECT * FROM customers WHERE Country = 'Gremany';
SELECT CustomerName,Country FROM customers WHERE  Country = 'Germany';
SELECT CustomerName,Country FROM customers WHERE NOT Country = 'Germany';

-- 예) 1번 카테고리에 속하지 않는 상품들 조회
SELECT * FROM products WHERE NOT CategoryID=1;
-- 예) japan 에 있지 않는 공급자들 조회
SELECT * FROM suppliers WHERE not Country = 'japan';
