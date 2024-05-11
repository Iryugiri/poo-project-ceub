package com.ceub.poo.pooProject.entity.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EmployeeDto {
	
	private String name;
	private String phone;
	private String email;
	private List<String> sickness;
	
}
