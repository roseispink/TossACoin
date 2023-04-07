package com.mycompany;

import com.mycompany.model.user.User;
import com.mycompany.model.user.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MainController {

    @GetMapping("/test")
    String getTest(){
        return "Hello";
    }


}
