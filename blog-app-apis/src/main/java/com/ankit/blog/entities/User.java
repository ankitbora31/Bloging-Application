package com.ankit.blog.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="users")
@NoArgsConstructor
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="user_name",nullable=false,length=100)
	private String name;
	
	private String email;
	private String password;
	private String about;
}
