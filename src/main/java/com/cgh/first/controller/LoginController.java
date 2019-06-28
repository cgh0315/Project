package com.cgh.first.controller;

import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value = "/usr/login")
    public String login(@RequestParam String username, @RequestParam String password, Map<String,String> map, HttpSession session){

        if (username.equals("admin") && password.equals("123")){
            session.setAttribute("username",username);
            return "redirect:/main.html";
        }else {
            map.put("msg","错误");
            return "login";
        }

    }
}
