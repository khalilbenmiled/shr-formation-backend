package com.soprahr.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.soprahr.models.Session;

public interface SessionRepository extends JpaRepository<Session, Integer>{

	@Query(value = "SELECT * FROM session s WHERE s.trimestre = :trimestre ", nativeQuery = true)		
	public List<Session> getSessionByQuarter(@Param("trimestre") int trimestre );
}
