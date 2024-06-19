package com.example.demo.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>
{
		int countByUsername(String username);
		Admin findByUsername(String username);
		Admin findByPassword(String password);
		
		
}
