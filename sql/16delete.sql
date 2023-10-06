-- DELETE FROM tableName WHETE 조건
-- !! WHERE 절 꼭 작성!!--

SELECT *
FROM employees
WHERE LastName = '손';
DELETE FROM employees WHERE LastName = '손';

-- 지우기 전 같은 where 절로 지울 레코드인지 확인!!!

SELECT *
FROM employees
WHERE FirstName = '김';
DELETE FROM employees WHERE FirstName = '김';

SELECT * FROM employees ORDER BY EmployeeID DESC;

-- 예) 직원 테이블에 오늘 입력한 레코드들 지우기
 SELECT * FROM employees
          WHERE LastName = '이';
DELETE FROM employees WHERE LastName = '이';
-- 예) 상품테이블에 오늘 입력한 레코드들 지우기
SELECT * FROM products;
DELETE FROM products WHERE ProductName ='돈까스';
