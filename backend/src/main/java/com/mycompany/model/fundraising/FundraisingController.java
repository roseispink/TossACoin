package com.mycompany.model.fundraising;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class FundraisingController {

    @Autowired
    FundraisingRepository fundraisingRepository;

    @GetMapping("/home")
    @ResponseBody
    JSONArray getAllFunds(){
        List<Fundraising> funds = fundraisingRepository.findAllByAvailableIsTrueOrderByFundraisingStart();
        StringBuilder fundBasicInfo = new StringBuilder();
        JSONArray jsonArray = new JSONArray();
        for(Fundraising fund: funds)
        {
            JSONObject jsonObj = new JSONObject();
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
