package com.ceub.poo.pooProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceub.poo.pooProject.entity.Employee;
import com.ceub.poo.pooProject.entity.Sickness;
import com.ceub.poo.pooProject.repository.SicknessRepository;

@Service
public class SicknessService {
	
	 @Autowired
	 private  SicknessRepository repositorySick;

	 public void saveSickness(String list, Employee employee) {
		 Sickness sick = new Sickness(list, employee);
		 repositorySick.save(sick);
	    }
		
}
