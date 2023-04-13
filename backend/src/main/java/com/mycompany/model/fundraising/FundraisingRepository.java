package com.mycompany.model.fundraising;

import com.mycompany.model.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FundraisingRepository extends CrudRepository<Fundraising, Long> {

    List<Fundraising> findAllByOwnerAndAvailableIsTrueOrderByCollectedMoney(User user);
    List<Fundraising> findAllByAvailableIsTrueOrderByFundraisingStart();
}
