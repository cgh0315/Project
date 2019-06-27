package com.cgh.first.controller;

import com.cgh.first.bean.Person;
import com.cgh.first.bean.PersonValue;
import com.cgh.first.bean.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@Controller
public class HelloController {

    @Autowired
    Person person;

    @Autowired
    PersonValue personValue;

    @Autowired
    Property propertySrc;

    @RequestMapping("/hello")
    @ResponseBody
    public String SayHello(){
        return "hello".toUpperCase();
    }

    @RequestMapping({"/index.html"})
    public String index(){
        return "login";
    }

    @RequestMapping("/object")
    @ResponseBody
    public String ShowPro(){
        return person.toString();
    }

    @RequestMapping("/objectValue")
    @ResponseBody
    public String ShowProValue(){
        return personValue.toString();
    }

    @RequestMapping("/propertySrc")
    @ResponseBody
    public String ShowProperty(){
        return propertySrc.toString();
    }

    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
