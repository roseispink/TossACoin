package com.mycompany;

import com.mycompany.model.user.User;
import com.mycompany.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    List<User> getUsers(){
        return userRepository.findAll();
    }

}
