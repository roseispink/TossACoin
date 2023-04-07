package com.mycompany.model.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

import java.util.List;

public interface UserRepository  extends JpaRepository<User, Long>{
    User getUserByEmail(String email);

}
