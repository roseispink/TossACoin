package com.mycompany.model.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long>{
    User getUserByEmail(String email);

    boolean existsByEmail(String email);
}
