-- LIMIT
SELECT * FROM customers;
SELECT * FROM customers
LIMIT 3;
SELECT * FROM employees
LIMIT 2;

SELECT * FROM employees
ORDER BY BirthDate
LIMIT 2;

SELECT * FROM products
ORDER BY  Price DESC
LIMIT 10;

-- 예) 가장 어린 3명 직원 조회
SELECT * FROM employees
ORDER BY BirthDate
LIMIT 3;
-- 예) 2번 카테고리에서 가장 저렴한 상품 조회
SELECT * FROM products
WHERE CategoryID =2
ORDER BY Price
LIMIT 2;


SELECT ProductName,Price FROM products
ORDER BY Price
LIMIT 3;

SELECT ProductName,Price FROM products
ORDER BY Price
LIMIT 1, 3;
SELECT ProductName,Price FROM products
ORDER BY Price
LIMIT 2, 3;
SELECT ProductName,Price FROM products
ORDER BY Price
LIMIT 3, 3;

-- 페이지 나누기

SELECT CustomerID,CustomerName FROM customers
ORDER BY CustomerID; -- 91 row
SELECT CustomerID,CustomerName FROM customers
ORDER BY CustomerID
LIMIT 0,10;-- 1페이지 10개
SELECT CustomerID,CustomerName FROM customers
ORDER BY CustomerID
LIMIT 10,10; -- 2페이지 10개
SELECT CustomerID,CustomerName FROM customers
ORDER BY CustomerID
LIMIT 20,10; -- 3페이지 10개
SELECT CustomerID,CustomerName FROM customers
ORDER BY CustomerID
LIMIT 90,10; -- 마지막 페이지 10개

-- 예) 공급자 (suppliers)를 한 페이지에 5개씩 공급자번호 순으로 보여줄 때
             -- 3번째 페이지 조회 코드 작성
SELECT SupplierID FROM suppliers
ORDER BY SupplierID
LIMIT 2,5;

SELECT customerId id,
       customerName name
FROM customers
ORDER BY id
<<<<<<< HEAD
LIMIT 0, 5;
=======
LIMIT 0, 5
>>>>>>> origin/master

SELECT COUNT(*) FROM customers

-- 한페이지가 n개의 레코드(row)보여주면
-- m번째 페이지 조회
-- LIMIT(m-1)*n, n

