package com.mycompany.model.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository repo;

//    public void updateAuthenticationType(String username, String oauth2ClientName) {
//        Resource.AuthenticationType authType = Resource.AuthenticationType.valueOf(oauth2ClientName.toUpperCase());
//        repo.updateAuthenticationType(username, authType);
//    }
}
