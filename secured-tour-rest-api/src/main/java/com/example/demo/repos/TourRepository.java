package com.example.demo.repos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tour;

@Repository
public interface TourRepository extends JpaRepository<Tour, Integer> {

	// DSL  Query
	
	List<Tour> findByTourName(String tourName);
	
	// Native Query not updating 
	
	@Query(value = "select * from sitatours where cost>:srchValue",nativeQuery = true)
	List<Tour> getToursGreaterThanCost(@Param("srchValue")  double value);
	
	// JPQL Query ,its Modifying hence @Modifying and @Transactional
	@Query(value = "update Tour set cost = cost+ cost *.10")
	@Modifying
	@Transactional
	public int updateCost();
}
