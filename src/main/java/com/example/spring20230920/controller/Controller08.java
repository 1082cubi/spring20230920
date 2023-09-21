package com.example.spring20230920.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main8")
public class Controller08 {
    @RequestMapping("sub1")
    public void method1(Model model) {
        model.addAttribute("attr1", "soccer1");
        model.addAttribute("attr2", "soccer2");
        // forward to /WEB-INF/jsp/main8/sub1.jsp
    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        model.addAttribute("propone","여보 나 씩씩하게 하구 있어😊");
        model.addAttribute("propone1","우리 루루도 씩씩하게 잘 크쟈❤😍");
    }
}
