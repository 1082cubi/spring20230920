SELECT * FROM products;
SELECT * FROM products WHERE ProductID =1;

UPDATE products
SET ProductName = '차이즈',
    Unit = '10 박스',
    Price = 36.00
WHERE ProductID =1;

UPDATE products
SET ProductName = '두부김치'; -- where 꼭 쓸것!!


-- 예) 1번 고객의 이름 수정하기
SELECT * FROM customers;
SELECT * FROM customers WHERE CustomerName = 1;
UPDATE customers
SET customerName = '네이마르'
    WHERE CustomerName =1;

-- 예) 5번 직원이 notes 변경하기
SELECT * FROM employees WHERE employeeID;
UPDATE employees
SET Employees.Notes = '안녕'
where EmployeeId =5;
-- 예) 1번 공급자의 전화번호, 주소 변경하기
SELECT * FROM suppliers WHERE supplierid= 1;
UPDATE suppliers
SET suppliers.Phone = '1234'
WHERE supplierId = 1;

SELECT * FROM products
WHERE CategoryID =1;
UPDATE products
SET Price = Price * 2
WHERE CategoryID = 1;

SELECT * FROM employees;
