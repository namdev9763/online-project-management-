package com.example.demo.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.ProjectDetails;

public interface ProjectDetailsRepo extends JpaRepository<ProjectDetails, Integer>
{
	@Query(value = "select count(*) from project_details where status=\"closed\";",nativeQuery = true)
	Long closedCount();
	
	@Query(value = "select count(*) from project_details where status=\"Cancelled\";", nativeQuery = true)
	Long cancelledCount();
	
	@Query(value ="select count(*) from project_details where status=\"Running\";", nativeQuery = true)
	Long runningCount();
	 
}
