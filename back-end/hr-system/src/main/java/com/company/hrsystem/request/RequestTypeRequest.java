package com.company.hrsystem.request;

import java.io.Serializable;

import com.company.hrsystem.dto.RequestTypeDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestTypeRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private RequestTypeDto requestType;

	private RequestTypeRequest data;

}
