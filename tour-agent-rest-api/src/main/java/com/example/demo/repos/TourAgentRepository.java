package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.TourAgent;


@RepositoryRestResource
public interface TourAgentRepository extends JpaRepository<TourAgent, Integer> {

}
