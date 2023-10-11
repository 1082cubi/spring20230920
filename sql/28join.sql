USE w3schools;
SELECT *
FROM products;
SELECT *
FROM categories;

-- chais 상품의 카테고리명은?
SELECT CategoryID
FROM products
WHERE ProductName = 'chais';
SELECT CategoryName
FROM categories
WHERE CategoryID = 1;

-- JOIN : 두개의 테이블 결합
SELECT *
FROM categories,
     products; -- 두개 똑같다.
SELECT * -- 두개 똑같다.
FROM categories
         JOIN products;

SELECT COUNT(*)
FROM categories; -- 8
SELECT COUNT(*)
FROM products;
-- 77


--
CREATE TABLE table_a
(
    product_id   INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(20),
    category_id  INT
);
CREATE TABLE table_b
(
    category_id   INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(20)
);
INSERT INTO table_b (category_name)
VALUES ('음료수'),
       ('반찬');
INSERT INTO table_a(product_name, category_id)
    value ('콜라', 1),
    ('사이다', 1),
    ('제육', 2),
    ('돈까스', 2),
    ('두부', 2);

SELECT *
FROM table_a
         JOIN table_b;

-- 두 테이블 결합하면
-- 조회된 레코드 수는 A테이블 row * B테이블 row
--        컬럼 수는 A테이블 열 + B테이블 열

SELECT *
FROM table_a
         JOIN table_b
WHERE table_a.product_name = '콜라'
  AND table_a.category_id = table_b.category_id;
-- 컬렴이 하나의 테이블에만 있을 때 테이블명 생략 가능
-- 같은 컬럼명이 여러테이블에 있다면 테이블 명 작성

SELECT *
FROM table_a
         JOIN table_b
              ON table_a.category_id = table_b.category_id -- join 조건
                  AND product_name = '콜라';

SELECT ProductName, ProductID, CategoryName
FROM products
         JOIN categories
              ON Products.CategoryID = categories.CategoryID
WHERE ProductName = 'chais';

SELECT ProductName, ProductID, CategoryName
FROM products p
         JOIN categories c
              ON p.CategoryID = c.CategoryID
WHERE ProductName = 'chais';


-- 예) chais 상품의 공급자명, 전화번호
DESC products;
DESC suppliers;
SELECT SupplierName, Phone
FROM products p
         JOIN suppliers s
              ON p.SupplierID = s.SupplierID
WHERE ProductName = 'chais';
-- 예) 1996년 7월 4일 에 주문한 고객명 (customers, orders)
SELECT CustomerName,OrderDate,EmployeeID
FROM customers AS c
         JOIN orders AS o
              ON c.CustomerID = o.CustomerID
WHERE o.OrderDate = '1996-07-04';
-- 예) 1996년 7월 4일 에 주문을 담당한 직원명 (employees, orders)
SELECT e.LastName, e.FirstName
FROM employees e
         JOIN orders o
              ON e.EmployeeID = o.EmployeeID
WHERE o.OrderDate = '1996-07-08';

SELECT *
FROM orders
WHERE OrderDate = '1996-07-08';

SELECT COUNT(*)
FROM products; -- 77
SELECT COUNT(*)
FROM suppliers; -- 29
SELECT COUNT(*)
FROM categories; -- 8
SELECT 77 * 29 * 8;

-- 3개 테이블 조회
SELECT COUNT(*)
FROM products,
     suppliers,
     categories;

SELECT p.ProductName, s.SupplierName, s.Phone, c.CategoryName
FROM products p
         JOIN suppliers s
              ON p.SupplierID = s.SupplierID
         JOIN categories c
              ON p.CategoryID = c.CategoryID
WHERE p.ProductName = 'chais';

-- 예 ) 'Chang' 상품의 공급자명, 카테고리명 조회
SELECT SupplierName, CategoryName, ProductName
FROM products p
         JOIN suppliers s
              ON p.SupplierID = s.SupplierID
         JOIN categories c
              ON p.CategoryID = c.CategoryID
WHERE ProductName = 'Chang';
-- 예) 1996년 7월 9일에 주문한 고객명과, 처리한 직원명
SELECT CustomerName, e.FirstName, OrderDate
FROM orders o
         JOIN customers c
              ON o.CustomerID = c.CustomerID
         JOIN employees e
              ON o.EmployeeID = e.EmployeeID
WHERE OrderDate = '1996-07-09';
-- 예 )  1996년 7월 9일에 주문한 상품명 (orders, orderDetails, products)
SELECT OrderDate, ProductName
FROM orders o
         JOIN orderdetails od
              ON o.OrderID = od.OrderID
         JOIN products p
              ON od.ProductID = p.ProductID
WHERE OrderDate = '1996-07-09';


-- 예 ) 'Chang' 상품이 주문된 날짜들
SELECT ProductName, OrderDate, c.CustomerID, p.ProductID,
CONCAT(e.FirstName,' ',
    e.LastName) fullName
FROM products p
         JOIN orderdetails od
              ON p.ProductID = od.ProductID
         Join orders o ON od.OrderID = o.OrderID
         JOIN customers c
              ON o.CustomerID = c.CustomerID
         JOIN employees e
              ON o.EmployeeID = e.EmployeeID
WHERE ProductName = 'Chang';

