package com.onlinebankingsystem.dto;

import com.onlinebankingsystem.entity.User;

import lombok.Data;

@Data
public class UserLoginResponse extends CommonApiResponse {

	private User user;
	
	private String jwtToken;

}
