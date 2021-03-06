package com.company.hrsystem.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JwtDto implements Serializable{
	
	private static final long serialVersionUID = -8091879091924046844L;
	
	private final String accessToken;
	
	private final String refreshToken;

	public JwtDto(String accessToken, String refreshToken) {
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
	}

}
