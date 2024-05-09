package com.ceub.poo.pooProject.entity.dto;

import java.util.List;

import lombok.Data;

@Data
public class EmployeeDto {
	
	private String name;
	private String phone;
	private String email;
	private List<String> sickness;
	
}
