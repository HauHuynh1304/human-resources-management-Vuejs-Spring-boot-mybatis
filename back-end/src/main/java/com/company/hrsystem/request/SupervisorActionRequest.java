package com.company.hrsystem.request;

import java.io.Serializable;

import com.company.hrsystem.dto.SupervisorActionDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SupervisorActionRequest implements Serializable {

	private static final long serialVersionUID = 2718112999305583023L;

	private SupervisorActionDto supervisorAction;

	private SupervisorActionRequest data;

}
