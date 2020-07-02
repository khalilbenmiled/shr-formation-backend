package com.soprahr.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.soprahr.models.Formation;


public interface FormationRepository extends JpaRepository<Formation, Integer> {

	@Query(value = "SELECT * FROM formation f WHERE f.id != :id", nativeQuery = true)		
	public List<Formation> getFormationsWithouThistId(@Param("id") int id);
	
	@Query(value = "SELECT * FROM formation f WHERE f.deleted = false", nativeQuery = true)		
	public List<Formation> findAllFormations();
}
