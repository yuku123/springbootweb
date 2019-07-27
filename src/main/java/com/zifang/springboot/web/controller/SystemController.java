package com.zifang.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SystemController {

    @GetMapping(value = {"/", "/index"})
    public String index(Model model) {
        return "index";
    }

    @GetMapping(value = {"/main"})
    public String main(@RequestParam(value = "username") String username,
                       @RequestParam(value = "password") String password) {
        if(username.equals("admin")&&password.equals("admin")){
            return "main";
        }else{
            return "error";
        }
    }


}
