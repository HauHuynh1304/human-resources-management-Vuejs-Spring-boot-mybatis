package com.company.hrsystem.mapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Mapper;

import com.company.hrsystem.dto.EmployeeDocumentDto;
import com.company.hrsystem.dto.EmployeeDto;

@Mapper
public interface EmployeeDocumentMapper {

	int insertEmployeeDocument(EmployeeDto employee, List<EmployeeDocumentDto> documents);

	int updateEmployeeDocument(List<EmployeeDocumentDto> documents, Timestamp updatedAt);

	Set<EmployeeDocumentDto> findLastInsertListEmployeeDocument(Integer employeeId);

	List<EmployeeDocumentDto> findEmployeeDocumentsByEmployeeId(Integer employeeId);

}
