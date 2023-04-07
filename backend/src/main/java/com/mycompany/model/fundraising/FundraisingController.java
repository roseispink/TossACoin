package com.mycompany.model.fundraising;


import com.mycompany.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FundraisingController {

    @Autowired
    FundraisingRepository fundraisingRepository;

    @GetMapping("/home")
    String getAllFunds(){
        List<Fundraising> funds = fundraisingRepository.findAllByAvailableIsTrueOrderByFundraisingStart();
        StringBuilder fundBasicInfo = new StringBuilder();

        for (Fundraising fund:
             funds) {
            fundBasicInfo.append(fund.getBasicInfo()).append(",\n");
        }

        return fundBasicInfo.toString();
    }


}
