package com.company.hrsystem.request;

import java.io.Serializable;

import com.company.hrsystem.dto.ApproverActionDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApproverActionRequest implements Serializable {

	private static final long serialVersionUID = -8981094362303713959L;

	private ApproverActionDto approverAction;
	
	private ApproverActionRequest data;

}
