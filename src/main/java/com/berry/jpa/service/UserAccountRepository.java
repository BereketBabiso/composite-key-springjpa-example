package com.berry.jpa.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.berry.jpa.domain.UserAccount;
import com.berry.jpa.domain.UserKey;

@Repository
public interface UserAccountRepository extends CrudRepository<UserAccount, UserKey> {

  public UserAccount findByPrimaryKeyUserIdAndPrimaryKeyEmail(int id, String email);
  
  List<UserAccount> findAll(Example<UserAccount> userKey);
}
