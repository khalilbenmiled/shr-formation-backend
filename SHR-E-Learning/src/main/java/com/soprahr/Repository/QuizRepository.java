package com.soprahr.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.soprahr.models.Quiz;


public interface QuizRepository extends JpaRepository<Quiz, Integer>{

	@Query(value = "SELECT * FROM quiz q WHERE q.deleted = false", nativeQuery = true)		
	public List<Quiz> findAllQuiz();
	
	@Query(value = "SELECT * FROM quiz q WHERE q.id_formation = :id", nativeQuery = true)		
	public Quiz findQuizByIdFormation(@Param(value ="id") int id);
}
