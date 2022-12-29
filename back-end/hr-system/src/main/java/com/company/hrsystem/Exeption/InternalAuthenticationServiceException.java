package com.company.hrsystem.Exeption;

import java.util.Calendar;
import java.util.Date;

import com.company.hrsystem.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InternalAuthenticationServiceException extends RuntimeException {

	private static final long serialVersionUID = 8157006358696825678L;

	private String system;

	private String version;

	private int status;

	private String errorMessage;

	@JsonFormat(pattern = DateUtil.DAY_HOUR_SECOND, timezone = DateUtil.TIME_ZONE)
	private Date timestamp;

	private Object data;

	public InternalAuthenticationServiceException(String system, String version, String errorMessage) {
		super(errorMessage);
		this.system = system;
		this.version = version;
		setTimestamp(Calendar.getInstance().getTime());
	}
}
