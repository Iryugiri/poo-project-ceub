package com.ceub.poo.pooProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee", schema = "test")
@Getter
@Setter
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
	
	/*
	 * @Column List<Sickness> sickness;
	 */
	
	
}
