package com.example.spring20230920.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Data
@Controller
@RequestMapping("main15")
public class Controller15 {

    @GetMapping("sub1")
    public void method1() {

    }

    @GetMapping("sub2")
    public void method2(HttpServletRequest request, HttpSession session) {

        System.out.println("request = " + request.getRemoteHost());
        System.out.println("session = " + session.getId());
        System.out.println();

    }

    @GetMapping("sub3")
    public void method3(
            @RequestParam(value = "name", defaultValue = "") String name,
            HttpSession session,
            HttpServletRequest request) {
        if (!name.isBlank()) {
            session.setAttribute("username", name);
        }
        Object username = session.getAttribute("username");
        if (username != null) {
            System.out.println();
            System.out.println("username = " + username
            );
        }
    }

    @GetMapping("sub4")
    public void method4() {

    }

    @PostMapping("sub5")
    public void method5(String name, HttpSession session) {
        session.setAttribute("username", name);
    }

    @GetMapping("sub6")
    public void method6() {

    }

    @GetMapping("sub7")
    public void method7() {

    }

    @PostMapping("sub8")
    public void method8(@RequestParam(value = "foods", required = false) String[] foods, HttpSession session) {
        System.out.println("foods = " + foods);
        session.setAttribute("food", foods);

    }

    @GetMapping("sub9")
    public void method9() {

    }
    //post요청 /main15/sub8
    //request parameter foods를
    //session 에 attribute로 넣고
    //sub8.jsp 로 포워드하는 메소드 만들기

    //get 요청/main15/sub9
    //sub9.jsp로 포워드하는 메소드 만들기
    //단.sub8.jsp와 sub9.jsp에서는 sub7에서 선택한 음식들을 보여주기
    @GetMapping("sub10")
    public void method10(Model model, HttpSession session) {
        model.addAttribute("modelAttr1", "탕후루");
        session.setAttribute("sessionAttr1", "마라탕");
    }

    @GetMapping("sub11")
    public void method11(Model model, HttpSession session) {
        model.addAttribute("items", List.of("두식", "봉석"));
        session.setAttribute("items", List.of("피자", "햄버거", "돈까스"));

        model.addAttribute("attr1", "송편");
        session.setAttribute("attr1", "윷놀이");
//    sub11.jsp에서 두식, 봉석 출력
//    피자,햄버거 ,돈까스 출력
    }




}
