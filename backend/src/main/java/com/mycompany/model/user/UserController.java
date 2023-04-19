package com.mycompany.model.user;

import com.mycompany.model.fundraising.Fundraising;
import com.mycompany.model.fundraising.FundraisingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    FundraisingRepository fundraisingRepository;



    @GetMapping("/myaccount")
    String getMe(Authentication authentication){
        JSONObject jsonObject = new JSONObject(authentication.getPrincipal());
        String email = jsonObject.getJSONObject("attributes").getString("email");
        User user = userRepository.getUserByEmail(email);
        return user.getBasicInfo();
    }

    @GetMapping("/login")
    public Object welcome(Authentication authentication){
        JSONObject jsonObject = new JSONObject(authentication.getPrincipal());
        String email = jsonObject.getJSONObject("attributes").getString("email");

        if(userRepository.existsByEmail(email))
            return authentication.getPrincipal();

        User user = new User();
        user.setEmail(email);
        user.setRole(UserRole.USER);
        userRepository.save(user);

        return authentication.getPrincipal();
    }

    @GetMapping("/myfundraising")
    String getMyFund(Authentication authentication){
        User user = userRepository.getUserByEmail(authentication.getName());
        List<Fundraising> funds = fundraisingRepository.findAllByOwnerAndAvailableIsTrueOrderByCollectedMoney(user);
        StringBuilder fundBasicInfo = new StringBuilder();

        for (Fundraising fund:
             funds) {
            fundBasicInfo.append(fund.getBasicInfo()).append(",\n");
        }
        return fundBasicInfo.toString();

    }

}
