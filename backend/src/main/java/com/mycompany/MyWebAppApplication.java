package com.mycompany;

import com.mycompany.model.user.CustomerOAuth2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class MyWebAppApplication {

    @GetMapping("/user")
    public Principal welcome(Principal principal){
        System.out.println("username: "+principal.getName());
        return principal;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyWebAppApplication.class, args);
    }

}
