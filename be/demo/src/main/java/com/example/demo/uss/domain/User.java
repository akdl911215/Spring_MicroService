package com.example.demo.uss.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "user_no")
	private long userNo;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "birthday")
	private String birthday;

	@Column(name = "regdate")
	private String regdate;

	@Builder
	public User(String name, String password, String username, String email, String gender, String birthday,
			String regdate) {
		super();
		this.name = name;
		this.password = password;
		this.username = username;
		this.email = email;
		this.gender = gender;
		this.birthday = birthday;
		this.regdate = regdate;
	}	
	
	
}
