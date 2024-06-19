package com.example.demo.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Admin
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int adminId;
	String username;
	String password;
	@OneToMany
	List<ProjectDetails> projectDetails;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<ProjectDetails> getProjectDetails() {
		return projectDetails;
	}
	public void setProjectDetails(List<ProjectDetails> projectDetails) {
		this.projectDetails = projectDetails;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", username=" + username + ", password=" + password + ", projectDetails="
				+ projectDetails + "]";
	}
	public Admin(int adminId, String username, String password, List<ProjectDetails> projectDetails) {
		super();
		this.adminId = adminId;
		this.username = username;
		this.password = password;
		this.projectDetails = projectDetails;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
