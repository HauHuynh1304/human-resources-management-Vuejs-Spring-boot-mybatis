package com.company.hrsystem.model;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class PositionModel implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer positionId;

	private String positionName;

	private Boolean deletedFlag;

	private String createdAt;

	private Timestamp updatedAt;

}