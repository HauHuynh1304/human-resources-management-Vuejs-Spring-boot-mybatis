package com.company.hrsystem.model;

import java.io.Serializable;
import java.sql.Timestamp;

import com.company.hrsystem.commons.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class RequesterActionModel implements Serializable {

	private static final long serialVersionUID = 3887206316245168694L;

	private Integer requesterActionId;

	private Integer requesterId;

	private String actionType;

	@JsonFormat(timezone=DateUtil.TIME_ZONE)
	private Timestamp updatedAt;
	
}
