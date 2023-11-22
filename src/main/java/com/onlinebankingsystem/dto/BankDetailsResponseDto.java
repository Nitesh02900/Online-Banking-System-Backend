package com.onlinebankingsystem.dto;

import java.util.ArrayList;
import java.util.List;

import com.onlinebankingsystem.entity.Bank;

import lombok.Data;

@Data
public class BankDetailsResponseDto extends CommonApiResponse {
	
	private List<Bank> banks = new ArrayList<>(); 

}
