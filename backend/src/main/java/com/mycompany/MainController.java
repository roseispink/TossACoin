package com.mycompany;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    @GetMapping("/test")
    String getTest(){
        return "Hello";
    }


}
