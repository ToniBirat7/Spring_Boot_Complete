package com.birat.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIClass {

    @GetMapping("api")
    public  String sayHello(){
        return  "Hello";
    }
}
