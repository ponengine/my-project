package com.oreopon.authen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "users_req")
	@SequenceGenerator(name = "users_req", sequenceName = "users_req", allocationSize = 1)
	private Long id;
	private String username;
	private String password;
	private boolean enabled; 
}
