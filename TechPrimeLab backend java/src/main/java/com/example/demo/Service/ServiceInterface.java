package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.ProjectDetails;

public interface ServiceInterface
{
	public Admin login(String username,String password);
	
	public boolean saveNewProject(ProjectDetails project);	
	
	public List<ProjectDetails> getAllProject();
	
	public boolean setstatus(int id, String change);

	public boolean forgotPassword(String username, String Password);

	public List<Long> getAllStatus();

	
	
}
