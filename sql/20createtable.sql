USE mydb1;

-- 테이블 만들기

CREATE TABLE 테이블명(
    컬럼명 컬럼타입,
    컬럼명 컬럼타입
);

-- 테이블명, 컬럼명 작성 관습
-- lower_snake_case(*)
-- UPPER_SNAKE_ CASE

CREATE TABLE my_table1(
    col_name1 varchar(100),
    col_name2 varchar(100),
    col_name3 varchar(100)
);
SELECT * FROM my_table1;
INSERT INTO my_table1(col_name1, col_name2, col_name3)
value ('민재','흥민','강인');

-- 예) my_table 만들기, 컬럼은 4개, 모든 컬럼 타입 varchar(10)
CREATE TABLE my_table2(
    soccer varchar(10),
    soccer1 varchar(10),
    soccer2 varchar(10),
    soccer3 varchar(10)
);
SELECT * FROM my_table2;

INSERT INTO my_table2(soccer, soccer1, soccer2, soccer3)
value ('네이마르','메시','한의혁','다니엘');


