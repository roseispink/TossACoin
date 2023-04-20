package com.mycompany.model.user;

import com.mycompany.model.fundraising.Fundraising;
import com.mycompany.model.fundraising.FundraisingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.json.*;


import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    FundraisingRepository fundraisingRepository;


    @GetMapping("/myAccount")
    @ResponseBody
    com.nimbusds.jose.shaded.json.JSONObject getMe(Authentication authentication){
        User user = userRepository.getUserByEmail(authentication.getName());
        if(user==null)
        {
            JSONObject jsonObject = new JSONObject(authentication.getPrincipal());
            String email = jsonObject.getJSONObject("attributes").getString("email");
            user = userRepository.getUserByEmail(email);
        }
        com.nimbusds.jose.shaded.json.JSONObject jsonObject = new com.nimbusds.jose.shaded.json.JSONObject();
        jsonObject.put("role", user.getRole());
        jsonObject.put("loginType", user.getLoginType());
        jsonObject.put("name", user.getName());
        jsonObject.put("email", user.getEmail());
        return jsonObject;

    }

    @GetMapping("/login")
    @ResponseBody
    public Object welcome(Authentication authentication){
        JSONObject jsonObject = new JSONObject(authentication.getPrincipal());
        String email = jsonObject.getJSONObject("attributes").getString("email");

        if(userRepository.existsByEmail(email))
            return authentication.getPrincipal();

        User user = new User();
        user.setEmail(email);
        user.setRole(UserRole.USER);
        user.setLoginType(LoginType.OAUTH2);

        userRepository.save(user);

        return authentication.getPrincipal();
    }


    @GetMapping("/myFundraising")
    @ResponseBody
    com.nimbusds.jose.shaded.json.JSONArray getMyFund(Authentication authentication){
        User user = userRepository.getUserByEmail(authentication.getName());
        List<Fundraising> funds = fundraisingRepository.findAllByOwnerAndAvailableIsTrueOrderByCollectedMoney(user);
        com.nimbusds.jose.shaded.json.JSONArray jsonArray = new com.nimbusds.jose.shaded.json.JSONArray();
        for(Fundraising fund: funds)
        {
            com.nimbusds.jose.shaded.json.JSONObject jsonObj = new com.nimbusds.jose.shaded.json.JSONObject();
            jsonObj.put("fundraising_start",fund.getFundraisingStart());
            jsonObj.put("fundraising_end", fund.getFundraisingEnd());
            jsonObj.put("title", fund.getTitle());
            jsonObj.put("collected_money",fund.getCollectedMoney());
            jsonObj.put("goal", fund.getGoal());
            jsonObj.put("image", fund.getImage());
            jsonObj.put("owner_name", fund.getOwner().getName());
            jsonObj.put("owner_surname", fund.getOwner().getSurname());

            jsonArray.add(jsonObj);

        }

        return jsonArray;

    }

}
