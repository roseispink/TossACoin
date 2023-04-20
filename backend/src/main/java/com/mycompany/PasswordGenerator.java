package com.mycompany;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "23445";
        String encodedPassword = encoder.encode(rawPassword);

        System.out.println(encodedPassword);
    }
}
