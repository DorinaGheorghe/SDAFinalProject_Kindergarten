package com.dorinagheorghe.sda.kindergarten.repository;

import com.dorinagheorghe.sda.kindergarten.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByEmail(String email);
}
