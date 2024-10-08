package com.example.test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;  //회원번호 컬럼
	
	@Column(length = 50, nullable = false, unique = true)
	private String username;  // 회원 아이디
	
	@Column(length = 100, nullable = false)
	private String password;  // 회원 비밀번호
	
	private String email;

}
