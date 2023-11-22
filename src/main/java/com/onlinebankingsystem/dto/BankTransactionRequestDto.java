package com.onlinebankingsystem.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class BankTransactionRequestDto {
	
	private int userId;
	
	private int bankId;
	
	private BigDecimal amount;
	
	private int sourceBankAccountId;
	
	private String transactionType;
	
	private String toBankAccount;  // for account transfer
	
	private String toBankIfsc;  // for account transfer
	
	private String accountTransferPurpose;

}
