package com.onlinebankingsystem.dto;

import lombok.Data;

@Data
public class BankAccountStatusUpdateRequestDto { 
	
	private int accountId;
	
	private String status;

}
