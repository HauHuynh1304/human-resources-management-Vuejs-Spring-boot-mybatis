package com.company.hrsystem.request;

import java.io.Serializable;

import com.company.hrsystem.dto.RoomDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomRequest implements Serializable {

	private static final long serialVersionUID = -6662968398151544956L;

	private RoomDto room;

	private RoomRequest data;

}
