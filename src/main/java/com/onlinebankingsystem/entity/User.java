package com.onlinebankingsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String email;

	@JsonIgnore
	private String password;

	private String roles;
	
	private String gender;

	private String contact;

	private String street;

	private String city;

	private String pincode;

	@ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

	private String isAccountLinked;  // Yes, No
	
	private String status; // active, deactivated

}
