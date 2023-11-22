package com.onlinebankingsystem.dto;

import org.springframework.beans.BeanUtils;

import com.onlinebankingsystem.entity.BankAccount;

import lombok.Data;

@Data
public class AddBankAccountRequestDto {
	
	private String number;

	private String ifscCode;

	private String type; // saving or current
	
	private int bankId;
	
	private int userId; // bank customer id
	
	public static BankAccount toBankAccountEntity(AddBankAccountRequestDto addBankAccountRequestDto) {
		BankAccount bankAccount =new BankAccount();
		BeanUtils.copyProperties(addBankAccountRequestDto, bankAccount, "bankId", "userId");		
		return bankAccount;
	}

}
