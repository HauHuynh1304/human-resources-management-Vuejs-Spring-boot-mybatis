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
public abstract class RoomModel implements Serializable {

	private static final long serialVersionUID = 6154681553050482073L;

	private Integer roomId;

	private String roomName;

	private Boolean deletedFlag;

	@JsonFormat(timezone=DateUtil.TIME_ZONE)
	private Timestamp updatedAt;

	public RoomModel(Integer roomId, String roomName) {
		this.roomId = roomId;
		this.roomName = roomName;
	}

}