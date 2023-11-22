package com.onlinebankingsystem.dto;

import java.util.List;

import com.onlinebankingsystem.entity.BankAccount;

import lombok.Data;

@Data
public class BankAccountResponseDto extends CommonApiResponse {
	
	private List<BankAccount> accounts;

}
