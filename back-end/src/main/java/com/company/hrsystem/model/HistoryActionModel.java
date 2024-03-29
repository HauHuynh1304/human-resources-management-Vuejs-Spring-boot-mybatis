package com.company.hrsystem.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class HistoryActionModel implements Serializable {

	private static final long serialVersionUID = -6787400402319382910L;

	private Integer historyActionId;
	
	private Integer employeeId;

	private String actionType;

	private String computerIp;

	private String targetTable;

	private String targetValue;

	private String createdAt;

}