package com.mycompany.model.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class OAuth2SuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

//    @Autowired
//    UserService userService;
//
////    @Override
////    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
////                                        Authentication authentication) throws ServletException, IOException {
////        CustomerOAuth2User oauth2User = (CustomerOAuth2User) authentication.getPrincipal();
////        String oauth2ClientName = oauth2User.getName();
////        String username = oauth2User.getEmail();
////
//////        userService.updateAuthenticationType(username, oauth2ClientName);
////
////        super.onAuthenticationSuccess(request, response, authentication);
////    }
}
