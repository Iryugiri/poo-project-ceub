package com.ceub.poo.pooProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceub.poo.pooProject.entity.Employee;
import com.ceub.poo.pooProject.entity.Sickness;
import com.ceub.poo.pooProject.repository.SicknessRepository;

@Service
public class SicknessService {
	
	 @Autowired
	 private  SicknessRepository repositorySick;

	 public void saveSickness(String issue, Employee employee) {
		 Sickness sick = new Sickness(issue, employee);
		 repositorySick.save(sick);
	    }
	 
	 public List<String> findSicknessOfEmployee (Integer id){
		 return repositorySick.findSicknessOfEmployee(id);
	 }
	
	 public List<Sickness> findSicknessAllOfEmployee(Integer Id) {
		return repositorySick.findSicknessAllOfEmployee(Id); 
	 }
	 
	 public void delete(Integer id) { 
		List<Sickness> sickList = findSicknessAllOfEmployee(id);
		for (Sickness sick : sickList) {
			repositorySick.delete(sick); 
		}
		
	}
}
