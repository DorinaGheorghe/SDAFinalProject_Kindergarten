package com.dorinagheorghe.sda.kindergarten.service;

import com.dorinagheorghe.sda.kindergarten.model.Account;
import com.dorinagheorghe.sda.kindergarten.model.UserType;
import com.dorinagheorghe.sda.kindergarten.repository.AccountRepository;
import com.dorinagheorghe.sda.kindergarten.service.dto.AccountDTO;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class AccountService implements UserDetailsService {

    private final AccountRepository accountRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public AccountService(AccountRepository accountRepository, BCryptPasswordEncoder passwordEncoder) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Account account = accountRepository.findByEmail(email);
        if (account == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }

        return new User(account.getEmail(), account.getPassword(), new ArrayList<>());
    }

    public void createAccount(AccountDTO accountDTO) {
        Account account = new Account();
        account.setEmail(accountDTO.getEmail());
        account.setPassword(passwordEncoder.encode(accountDTO.getPassword()));
        account.setUserType(UserType.PARENT);

        accountRepository.save(account);
    }

    public boolean accountExist(String email) {
        Account accountExist = accountRepository.findByEmail(email);
        return accountExist != null;
    }
}
