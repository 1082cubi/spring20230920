package com.example.spring20230920.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MyDao10 {

    @Select("""
    SELECT CustomerName
    FROM customers
    WHERE CustomerId=#{id}
    """)
    String selectByCustomerId(Integer id);
}
