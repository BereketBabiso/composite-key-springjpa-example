package com.berry.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berry.jpa.domain.UserAccount;
import com.berry.jpa.domain.UserKey;
import com.berry.jpa.service.UserAccountRepository;

@RestController
@RequestMapping(path="/ma")
public class UserController {
  
  @Autowired
  UserAccountRepository userAccountRepository;
  
  @PostMapping(path="/create/{id}/{email}")
  public String test(@PathVariable String id, @PathVariable String email) {
    UserKey uk = new UserKey();
    uk.setUserId(Integer.parseInt(id));
    uk.setEmail(email);
    
    UserAccount ua = new UserAccount();
    ua.setPrimaryKey(uk);
    ua.setFirstName("bereket");
    ua.setLastName("yetera");
    
    userAccountRepository.save(ua);
    
    return "success";
  }
  
  @GetMapping("/{id}/{email}")
  public List<UserAccount> test2(@PathVariable String id, @PathVariable String email) {
    UserKey uk = new UserKey();
    uk.setUserId(Integer.parseInt(id));
    uk.setEmail(email);
    UserAccount ua = new UserAccount();
    ua.setPrimaryKey(uk);
    return userAccountRepository.findAll(Example.of(ua));
  }

}
