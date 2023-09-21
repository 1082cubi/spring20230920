package com.example.spring20230920.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("main2")

public class Controller03 {

    // /main/sub1?address=seoul
    @RequestMapping("sub1")
    public void method1(WebRequest request) {
        System.out.println("Controller03.method1");
        String address = request.getParameter("address");
        String juso = request.getParameter("juso");
        String aaa = request.getParameter("aaa");
        System.out.println("juso = " + juso);
        System.out.println("address = " + address);
        System.out.println("aaa = " + aaa);
    }

    //main2/sub2?name=son&address=london
    @RequestMapping("sub2")
    public void method2(WebRequest request) {
        String name = request.getParameter("name");
        String address = request.getParameter("address");

        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    // /mein/sub3?name = 손흥민
    @RequestMapping("sub3")
    public void method3(@RequestParam("name") String name) {
        System.out.println("name = " + name);
    }

    @RequestMapping("sub4")
    public void method4(@RequestParam("name") String name, @RequestParam("address") String dddress) {
        System.out.println("name = " + name);
        System.out.println("dddress = " + dddress);
    }

    // /main2/sub5?email=abc@gmail.com&gender=남자&number=010-9999-1111
    @RequestMapping("sub5")
    public void method5(@RequestParam("gender") String gender, @RequestParam("number") String phone) {
        System.out.println("gerder = " + gender);
        System.out.println("phone = " + phone);
    }

    @RequestMapping("sub6")
    public void method6(@RequestParam("name") String name,
                        @RequestParam("age") String age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        Integer a = Integer.valueOf(age);
    }

    // /main2/sub7name=손/age=30    Integer로 했기 때문에 age = 삽십은 안된다
    @RequestMapping("sub7")
    public void method7(@RequestParam("name") String name,
                        @RequestParam("age") Integer age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    // /main2/sub8?address=seoul&married=false&age=66
    @RequestMapping("sub8")
    public void method8(@RequestParam("address") String adderess,
                        @RequestParam("married") Boolean married,
                        @RequestParam("age") Integer age) {
        System.out.println("adderess = " + adderess);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
    }

    // /main/sub?name=Son
    @RequestMapping("sub9")
    public void method9(@RequestParam("neme") String name) {
        System.out.println("name = " + name);

    }
    // /main2/sub10?address=seoul&age=30
    // /main2/sub10?address=jeju

    @RequestMapping("sub10")
    public void method10(@RequestParam("address") String address,
                         @RequestParam(value = "age", required = false) Integer age) {
        System.out.println("address = " + address);
        System.out.println("age = " + age);
    }
            //main/sub11
    @RequestMapping("sub11")
    public void method11(@RequestParam(value = "age", defaultValue = "age") Integer age) {
        System.out.println("age = " + age);
    }
}
