package com.company.hrsystem.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.company.hrsystem.dto.SupervisorActionDto;

@Mapper
public interface SupervisorAcctionMapper {

	int insertSupervisorAction(SupervisorActionDto supervisorActionDto);

	/**
	 * This method related to update status CANCEL by employee
	 */
	int updateActionByEmployee(SupervisorActionDto supervisorActionDto);

	/**
	 * This method use to update by Supervisor
	 */
	int updateActionBySupervisor(SupervisorActionDto supervisorActionDto);

}
