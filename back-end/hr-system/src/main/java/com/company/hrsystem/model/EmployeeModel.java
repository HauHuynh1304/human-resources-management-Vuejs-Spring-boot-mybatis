package com.company.hrsystem.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class EmployeeModel implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer employeeId;

	private String employeeProfileId;

	private Integer roomId;

	private Integer personalInfoId;

	private Integer systemAccountId;

	private Boolean deletedFlag;

	private String employeeStartDate;

	private String employeeEndDate;

	private String createdAt;

	private String updatedAt;
	
}