package com.example.demo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ProblemDetail;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Admin;
import com.example.demo.Entity.ProjectDetails;
import com.example.demo.Repositry.AdminRepo;
import com.example.demo.Repositry.ProjectDetailsRepo;
import com.example.demo.Service.ServiceInterface;

@Service
public class ServiceClass implements ServiceInterface
{
	@Autowired
	AdminRepo adminRepo;
	@Autowired
	ProjectDetailsRepo projectDetailsRepo;
	@Override
	public Admin login(String username, String password) 
	{
		try
		{
			int count=adminRepo.countByUsername(username);
			if(count!=1)
			{
				return null;	
			}
			Admin ad=adminRepo.findByUsername(username);
			if(!password.equals(ad.getPassword()))
			{
					return null;
			}
			return ad;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean saveNewProject(ProjectDetails project) 
	{
		try 
		{
			if(project.getProjectname()==null)
			{
				return false;
			}
			else
			{
			 projectDetailsRepo.save(project);
			return true;
			}	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}	
	}
	@Override
	public List<ProjectDetails> getAllProject() 
	{
		try
		{
			return projectDetailsRepo.findAll();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean setstatus(int id, String change)
	{
		try
		{
			ProjectDetails details=projectDetailsRepo.findById(id).get();
			details.setStatus(change);
			projectDetailsRepo.save(details);
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		
	}
	@Override
	public boolean forgotPassword(String username, String Password)
	{
		try 
		{
			int count=adminRepo.countByUsername(username);
			if(count!=1)
			{
				return false;	
			}
			Admin ad=adminRepo.findByUsername(username);
			if(Password.equals(ad.getPassword()))
			{
				return false;
			}
					ad.setPassword(Password);
					adminRepo.save(ad);
					return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		
	}
	@Override
	public List<Long> getAllStatus()
	{
		try 
		{
			List<Long> getAllStatus=new ArrayList<>();
			getAllStatus.add(projectDetailsRepo.count());
			getAllStatus.add(projectDetailsRepo.closedCount());
			getAllStatus.add(projectDetailsRepo.runningCount());
			getAllStatus.add(projectDetailsRepo.cancelledCount());
			System.out.println(getAllStatus);
			return getAllStatus;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
		
	}
	
}
