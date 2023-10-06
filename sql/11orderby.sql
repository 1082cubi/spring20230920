SELECT *
FROM employees
ORDER BY BirthDate;
SELECT *
FROM employees
ORDER BY 4;
SELECT EmployeeID, LastName, BirthDate
FROM employees
ORDER BY 3;
SELECT *
FROM products;
SELECT *
FROM products
ORDER BY CategoryID, Price; -- ORDER BY 로 지정해주면 순서대로 지정을 해줄 수가 있다
                            -- DESC = 밑에서부터 즉 내림차순 ASC = 오름차순부터 (생략가능하다)

SELECT *
FROM products
ORDER BY CategoryID ASC; -- 오름차순(생략가능)
SELECT *
FROM products
ORDER BY CategoryID DESC; -- 내림차순
SELECT *
FROM products
ORDER BY CategoryID DESC, Price;
SELECT *
FROM products
ORDER BY CategoryID DESC, Price DESC;

-- 예) 고객을 국가명 오름차순으로 조회
SELECT *
FROM customers
ORDER BY Country;
-- 예) 가격이 비싼 상품이 먼저 조회되도록 코드 작성
SELECT *
FROM products
ORDER BY Price DESC;
-- 예) 가장 어린 직원이 먼저 조회되도록 코드 작성
SELECT *
FROM employees
ORDER BY BirthDate;

