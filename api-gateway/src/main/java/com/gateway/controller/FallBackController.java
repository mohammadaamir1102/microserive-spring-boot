package com.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userServiceFallBack")
    public String userFallBackMethod(){
        return "user service down.. \n" +
                "please try again later....";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentFallBackMethod(){
        return "department service down.. \n" +
                "please try again later....";
    }
}
