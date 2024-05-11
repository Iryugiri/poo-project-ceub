package com.ceub.poo.pooProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ceub.poo.pooProject.entity.Sickness;

@Repository
public interface SicknessRepository extends JpaRepository<Sickness, Integer>{
	@Query(nativeQuery = true, value="SELECT sick_of_employee from MGS.sickness WHERE id_employee = ?;")
	List<String> findSicknessOfEmployee(Integer id);
	
	@Query(nativeQuery = true, value="SELECT * from MGS.sickness WHERE id_employee = ?;")
	List<Sickness> findSicknessAllOfEmployee(Integer Id);
}
