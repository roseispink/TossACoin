package com.mycompany.model.fundraising;


import com.mycompany.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FundraisingController {

    @Autowired
    FundraisingRepository fundraisingRepository;

    @GetMapping("/home")
    List<String> getAllFunds(){
        List<Fundraising> funds = fundraisingRepository.findAllByAvailableIsTrueOrderByFundraisingStart();
        List<String> fundBasicInfo = new ArrayList<>();

        for (Fundraising fund:
             funds) {
            fundBasicInfo.add(fund.getBasicInfo());
        }

        return fundBasicInfo;
    }


}
