-- 비상과쿼리 : 외부쿼리의 컬럼이 내부쿼리에 사용되지 않을 때



-- 상관쿼리 : 외부쿼리의 컬럼이 내부쿼리에 사용될 때
-- 각 공급자가 있는 나라의 고객 수는?
USE w3schools;
SELECT * FROM suppliers;

SELECT COUNT(*) FROM customers
                WHERE Country = (SELECT Country FROM suppliers WHERE SupplierID = 1);
SELECT COUNT(*) FROM customers
WHERE Country = (SELECT Country FROM suppliers WHERE SupplierID = 2);
SELECT COUNT(*) FROM customers
WHERE Country = (SELECT Country FROM suppliers WHERE SupplierID = 3);



SELECT
    s.supplierID,
    (SELECT Count(*) FROM customers WHERE customers.Country =s.Country)
from suppliers s;

-- 예) 각 지원 보다 나이가 많은 직원이 수(lastName, NumberofEmp

SELECT  * FROM employees e;


