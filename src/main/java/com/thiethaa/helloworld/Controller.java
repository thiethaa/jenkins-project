package com.thiethaa.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {

    @GetMapping("/{name}")
    public String greeting(@PathVariable("name") String name){
        String msg = " this is a message";
        return "Hello "+name+" Welcome Back!!! "+ msg;
    }
    
     @GetMapping("/test")
    public String testAPI(@PathVariable("name") String name){
        String msg = " this is a message";
        return "Hello "+name+" Welcome Back!!! "+ msg;
    }
}
