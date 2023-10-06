-- INSERT INTO tableName (columnName1, columnName2, ...)
-- VALUES (value1, value2, ...)

INSERT INTO employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes)
    VALUE (10, '손', '흥민', '2000-01-01', '사진10', 'epl 득점왕');


INSERT INTO employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes)
    VALUE (11, '이', '강인', '2000-02-02', '사진11', '드리블 잘함');

-- 모든 컬럼에 값 넣을 때 컬럼명 나열 생략 가능
INSERT INTO employees
    VALUE (12, '김', '민재', '2000-03-03', '사진12', '수비 잘함');

-- 특정 컬럼에만 값을 넣을 때 컬럼명 나열 생략하면 안됨
INSERT INTO employees (EmployeeID, LastName, FirstName)
    VALUE (13, '박', '지성'); -- 나열된 컬러명과 값의 순서,갯수가 같아야함

INSERT INTO employees (EmployeeID, FirstName, LastName)
    VALUE (14, '차', '범근');

INSERT INTO employees (EmployeeID, FirstName, LastName)
    VALUE (15, '김', '두식');

INSERT INTO employees (EmployeeID, FirstName, LastName)
    VALUE (16, '김');

SELECT * FROM employees ORDER BY EmployeeID DESC;

-- 값의 타입에 따라 넣는 방법이 다름
INSERT INTO employees (EmployeeID)
    value (15);
INSERT into employees(EmployeeID)
value ('16'); -- 되긴 됨 --
INSERT INTO employees (LastName)
VALUE ('son');
INSERT INTO employees(LastName)
value ('10000'); -- 따음표 사용 권장
INSERT INTO employees(LastName)
value (10000);
INSERT INTO employees (BirthDate)
value ('2000-01-01');
SELECT * FROM employees order by EmployeeID DESC;
INSERT INTO products(price)
VALUE (20.10);
INSERT INTO products(price)
VALUE ('30.33'); -- 되긴 됨..

INSERT INTO products(productid, productname, supplierid, categoryid, unit, price)
    VALUE(80,'soccer',1,1,'1모',30.33);
INSERT INTO products(productname, supplierid, categoryid, unit, price)
VALUE ('김치',2,2,'1 포기',50.55);
INSERT INTO products(ProductID,productname, supplierid, categoryid, unit, price)
    VALUE (82,'김치',2,2,'1 포기',50.55);
INSERT INTO products
VALUE (83,'김치',2,2,'1포기');
SELECT * FROM products ORDER BY ProductID DESC;


SELECT * FROM suppliers ORDER BY SupplierID DESC;

SELECT * FROM suppliers ORDER BY
                            1 DESC;
SELECT * FROM employees ORDER BY EmployeeID DESC;

