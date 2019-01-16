package com.berry.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Setter
@Getter
public class UserKey implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  @Column(name="user_id")
  int userId;
  @Column(name="user_email")
  String email;
}
