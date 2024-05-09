package com.ceub.poo.pooProject.entity;

import java.util.List;

import com.ceub.poo.pooProject.ultility.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee", schema = "test")
@Data
@NoArgsConstructor
public class Employee {
	
	/*
	 * MGS encomendou um sistema de geração de cartões com as principais informações dos 
	 * funcionários, alergias, problemas médicos, bem como telefones e e-mails de contato. 
	 * O sistema deve ser capaz de armazenar as informações dos empregados e apresentá-las quando o 
	 * respectivo identificador for fornecido.
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false, length = 11)
	private String phone;
	
	public Employee (String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public static String saveList(List<String> string) throws JsonProcessingException {
		 String listJson = JsonUtil.toJson(string);
		 return listJson;
	    }
}
