package com.springstart.shubham.testController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld(){
        return "Spring Boot Init";
    }

    @GetMapping(value = "/test")
    public String helloWorlds(){
        return "Spring Boot Initsadasd";
    }
}
