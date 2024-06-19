package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.ProjectDetails;
import com.example.demo.Service.ServiceInterface;

@RestController
@CrossOrigin
public class MyController 
{
	@Autowired
	ServiceInterface serviceInterface;
	@RequestMapping("login{username}/{password}")
	public Admin login(@PathVariable String username, @PathVariable String password)
	{
		return this.serviceInterface.login(username, password);
	}
	@RequestMapping("save")
	public boolean saveProject(@RequestBody ProjectDetails project)
	{
		return this.serviceInterface.saveNewProject(project);
	}
	@RequestMapping("getAllProject")
	public List<ProjectDetails> getAllProject()
	{
			return this.serviceInterface.getAllProject();
	}
	@RequestMapping("setstatus{id}/{change}")
	public boolean setstatus(@PathVariable int id,@PathVariable String change)
	{
		return this.serviceInterface.setstatus(id,change);
	}
	@RequestMapping("forgotPassword{username}/{Password}")
	public boolean forgotPassword(@PathVariable String username,@PathVariable String Password)
	{
		return this.serviceInterface.forgotPassword(username,Password);
	}
	@RequestMapping("getAllStatus")
	public List<Long> getAllStatus()
	{
		return this.serviceInterface.getAllStatus();
	}

	
}
