package com.example.spring20230920.controller;

import com.example.spring20230920.domain.MyDto7;
import com.example.spring20230920.domain.MyDto8;
import com.example.spring20230920.domain.MyDto9;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Controller
@RequestMapping("main9")

public class Controller09 {
    @RequestMapping("sub1")
    public void nethod1(Model model) {
        model.addAttribute("attr1", "son");
        model.addAttribute("attr2", "300");
        model.addAttribute("attr3", "true");
        model.addAttribute("attr4", "3.14");

        //모델속성이 배열일 경우
        model.addAttribute("attr5", new String[]{"lee", "kim"});

        String[] myArr1 = {"korea", "seoul", "jeju"};
        model.addAttribute("yourArr6", myArr1);

    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        String[] myname = {"내이름은", "한", "의", "혁"};
        String[] you = {"1082cubi", "한메일"};
        var her = new String[]{"일산"};
        model.addAttribute("myName", myname);
        model.addAttribute("yourEmail", you);
        model.addAttribute("herAddress", her);
    }

    @RequestMapping("sub3")
    public void method3(Model model) {
        model.addAttribute("names", List.of("두식", "봉석", "희수"));
        model.addAttribute("list1", List.of("호날두", "메시"));
        model.addAttribute("mapList", List.of("37", "35", "35"));
        model.addAttribute("cities", new String[]{"발롱도르", "월드컵우승", "챔스언스리그우승", "엘클라시코"});

    }

    @RequestMapping("sub4")
    public void method4(Model model) {
        Map map1 = Map.of("son", 7, "lee", 19, "kim", 30);
        model.addAttribute("myMap", map1);

        var map2 = Map.of("seoul", 1, "busan", 2);
        model.addAttribute("cityMap", map2);

        var map3 = Map.of("red", 10, "blue", 7, "black", 0);
        model.addAttribute("color", map3);

        var map4 = Map.of(
                "name", "두식",
                "my name", "봉석",
                "your-name", "희수");

        model.addAttribute("attre", map4);
    }

    @RequestMapping("sub5")
    public void method5(Model model) {
        var map1 = Map.of("phone1", "iphone", "phone2", "galaxy");
        var map2 = Map.of("korea", "seoul", "us", "ny");
        var map3 = Map.of("1st", "hamburger", "2nd", "pizza");

        model.addAttribute("korea", "us");
        model.addAttribute("phones", map1);
        model.addAttribute("caps", map2);
        model.addAttribute("foods", map3);
    }

    @RequestMapping("sub6")
    public void method6(Model model) {
        model.addAttribute("attr1", new Object());
        model.addAttribute("attr2", new Scanner(System.in));
        model.addAttribute("attr3", new MyDto7());
    }

    @RequestMapping("sub7")
    public void method7(Model model) {
        MyDto8 o1 = new MyDto8();
        o1.setFood("pizza");
        o1.setComputer("intel");
        o1.setBirthDate("2020-01-01");

        model.addAttribute("attr4", new MyDto8());
    }

    @RequestMapping("sub8")
    public void method8(Model model) {
        MyDto9 o2 = new MyDto9();
        o2.setId("cubi");
        o2.setFirstName("c");
        o2.setLastName("i");
        o2.setClassName("cubi1082");
        o2.setPhoneNumber("010");
        model.addAttribute("student",o2);


    }
}
