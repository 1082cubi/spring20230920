package com.example.spring20230920.controller;

import com.example.spring20230920.domain.MyDto12;
import com.example.spring20230920.domain.MyDto11;
import com.example.spring20230920.domain.MyDto13;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("main13")
public class Controller13 {
    @RequestMapping({"sub1", "sub2", "sub4", "sub7", "sub9", "sub11", "sub13"})
    public void method1() {
    }

    @RequestMapping("sub3")
    public void method3(
            String param1,
            Integer param2,
            String param3,
            LocalDate param4, //날짜
            LocalDateTime param5,  //날짜 시간
            String param6,
            @RequestParam(value = "param8", required = false) String[] param8
//        @RequestParam("param1")String param1,
//        @RequestParam("param2")Integer param2,
//        @RequestParam("param3")String param3,
//        @RequestParam("param4") LocalDate param4,
//        @RequestParam("param5") LocalDateTime
            // 이렇게 쓸 수 있는 걸 저렇게 줄일 수 있다
    ) {
        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
        System.out.println("param3 = " + param3);
        System.out.println("param4 = " + param4);
        System.out.println("param6 = " + param6);

        for (int i = 0; i < param8.length; i++) {
            System.out.println("param8 = " + param8[i]);
        }
        Arrays.stream(param8).forEach(System.out::println);
    }

    @RequestMapping("sub5")
    public void method5(String userId,
                        String userEmail,
                        LocalDate birthDate,
                        @RequestParam(value = "hobby", required = false) String[] hobby
    ) {
        System.out.println("userId = " + userId);
        System.out.println("userEmail = " + userEmail);
        System.out.println("birthDate = " + birthDate);
        Arrays.stream(hobby).forEach(System.out::println);
    }

    @RequestMapping("sub6")
    public void method6(MyDto11 user) {
        System.out.println("user = " + user);
    }

    @RequestMapping("sub8")
    public void method8(MyDto12 info) {
        System.out.println("info = " + info);
    }

    @RequestMapping("sub10")
    public void method10(@RequestParam("title") String title,
                         @RequestParam("contentBody") String contentBody) {
        System.out.println("title = " + title);
        System.out.println("contentBody = " + contentBody);
    }

    @RequestMapping("sub12")
    public void method12(MyDto13 o) {

    }

    @RequestMapping("sub14")
    public void method13(String hobby,
                         @RequestParam(value = "food", required = false) List<String> food
                         ) {
        System.out.println("hobby = " + hobby);
        System.out.println("food = " + food);
    }
}
