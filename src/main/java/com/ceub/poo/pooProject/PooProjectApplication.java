package com.ceub.poo.pooProject;

import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import db.DB;

@SpringBootApplication
public class PooProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooProjectApplication.class, args);
		
		/*
		 * Connection conn = DB.getConnection(); DB.closeConnection();
		 */
		
	}

}
