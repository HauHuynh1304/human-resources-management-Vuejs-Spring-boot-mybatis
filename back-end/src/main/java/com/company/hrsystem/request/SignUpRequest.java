package com.company.hrsystem.request;

import java.io.Serializable;
import java.util.Arrays;

import com.company.hrsystem.commons.constants.JsonRequestProperty;
import com.company.hrsystem.dto.SystemAccountDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequest implements Serializable {

	private static final long serialVersionUID = 438829947573371297L;

	private SystemAccountDto account;

	private Integer[] roleIds;

	@JsonProperty(JsonRequestProperty.JSON_REQUEST_PROPERTY)
	SignUpRequest data;

	@Override
	public String toString() {
		return "[account=" + account + ", roleIds=" + Arrays.toString(roleIds) + "]";
	}

}
