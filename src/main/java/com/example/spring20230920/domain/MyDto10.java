package com.example.spring20230920.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class MyDto10 {
    private String name;
    private Integer id;
    private List<String> foods;
    private List<String> cars;
}
