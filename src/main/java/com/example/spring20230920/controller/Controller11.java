package com.example.spring20230920.controller;

import com.example.spring20230920.domain.MyDto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main11")
public class Controller11 {
    @RequestMapping("sub1")
    public void method1() {

    }

    @RequestMapping("sub2")
    public void method2() {

    }

    @RequestMapping("sub3")
    public void method3() {
    }

    @RequestMapping({"sub4", "sub5", "sub6"})
    public void method4() {
    }

    @RequestMapping("sub7")
    public void method5(@RequestParam(value = "test", defaultValue = "false") Boolean test, Model model) {


        if (test) {
            List<MyDto9> list = new ArrayList<>();
            list.add(new MyDto9("우유", "성", "이름", "지역", "number"));
            list.add(new MyDto9("31L", "son", "km", "football", "010"));
            list.add(new MyDto9("32L", "lee", "ki", "paris", "011"));
            list.add(new MyDto9("33L", "김", "두식", "서울", "02"));
            list.add(new MyDto9("34L", "김", "봉석", "부산", "03"));
            list.add(new MyDto9("35L", "장", "희수", "제주", "50"));

            model.addAttribute("people", list);
        }
    }
}
