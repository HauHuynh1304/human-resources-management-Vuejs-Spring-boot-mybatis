package com.company.hrsystem.dto;

import com.company.hrsystem.model.SystemRoleModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class AuthenRoleDto extends SystemRoleModel {
	
	private static final long serialVersionUID = 5867851719978981829L;

}
