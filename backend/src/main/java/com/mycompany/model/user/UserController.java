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
        User user = userRepository.getUserByEmail(authentication.getName());
        return user.getBasicInfo();
    }

    @GetMapping("/login/oauth2")
    public Object welcome(Authentication authentication){
        System.out.println(authentication.getPrincipal());

        JSONObject jsonObject = new JSONObject(authentication.getPrincipal());
        String fullName = jsonObject.getJSONObject("attributes").getString("name");

        User user = new User();

        user.setName(fullName.split(" ")[0]);
        user.setSurname(fullName.split(" ")[1]);
        user.setEmail(jsonObject.getJSONObject("attributes").getString("email"));

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
