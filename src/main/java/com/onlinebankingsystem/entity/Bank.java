package com.onlinebankingsystem.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String code; // unique bank code

	private String address;

	private String phoneNumber;

	private String email;

	private String website;

	private String country;

	private String currency;

	// One-to-Many mapping with Bank Accounts
	// i will give response of bank details in this Object only
	// so I don't want to give Bankaccount details along with that
	// so that's why JsonIgnore
	@JsonIgnore     
	@OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
	private List<BankAccount> bankAccounts = new ArrayList<>();

}
