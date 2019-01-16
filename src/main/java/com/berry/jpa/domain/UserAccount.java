package com.berry.jpa.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USER_ACCT")
@Setter
@Getter
public class UserAccount {

  @EmbeddedId
  UserKey primaryKey = new UserKey();
  
  @Column(name="first_name")
  String firstName;
  
  @Column(name="last_name")
  String lastName;
  
}
