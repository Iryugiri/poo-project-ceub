package com.ceub.poo.pooProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ceub.poo.pooProject.entity.Sickness;

@Repository
public interface SicknessRepository extends JpaRepository<Sickness, Integer>{
	@Query(nativeQuery = true, value="SELECT MAX(ID) FROM test.sickness")
	Integer findLastId();
}
