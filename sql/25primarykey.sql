-- PRIMARY KEY(추키,기본기,pk)
USE mydb1;
CREATE TABLE my_table27(
    id INT PRIMARY KEY ,
    name VARCHAR(20)
);
CREATE TABLE my_table28(
    id INT,
    name VARCHAR(10),
    PRIMARY KEY (id)
);
CREATE TABLE my_table29(
    name VARCHAR(10),
    birth DATE,
    PRIMARY KEY (name,birth)
);
CREATE TABLE my_table30 (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(10)
);
INSERT INTO my_table30(name)
VALUE ('son');
INSERT INTO my_table30(name)
    VALUE ('lee');
INSERT INTO my_table30(name)
    VALUE ('kim');
INSERT INTO my_table30(name)
    VALUE ('son');

SELECT * FROM my_table30;
