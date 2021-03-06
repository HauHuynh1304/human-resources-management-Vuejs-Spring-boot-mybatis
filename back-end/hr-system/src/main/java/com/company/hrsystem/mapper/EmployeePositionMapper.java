package com.company.hrsystem.mapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Mapper;

import com.company.hrsystem.dto.EmployeeDto;
import com.company.hrsystem.dto.EmployeePositionDto;

@Mapper
public interface EmployeePositionMapper {

	int insertEmployeePosition(EmployeeDto employee, List<EmployeePositionDto> positions);

	int updateEmployeePosition(List<EmployeePositionDto> positions, Timestamp updatedAt);

	Set<EmployeePositionDto> findLastInsertListEmployeePosition(Integer employeeId);

	List<EmployeePositionDto> findEmployeePositionsByEmployeeId(Integer employeeId);

}
