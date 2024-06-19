package com.example.demo.Entity;


import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProjectDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int proId;
	String projectname;
	String reason;
	String type;
	String divison;
	String category;
	String priority;
	String department;
	Date startdate;
	Date enddate;
	String location;
	String status;
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDivison() {
		return divison;
	}
	public void setDivison(String divison) {
		this.divison = divison;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ProjectDetails [proId=" + proId + ", projectname=" + projectname + ", reason=" + reason + ", type="
				+ type + ", divison=" + divison + ", category=" + category + ", priority=" + priority + ", department="
				+ department + ", startdate=" + startdate + ", enddate=" + enddate + ", location=" + location
				+ ", status=" + status + "]";
	}
	public ProjectDetails(int proId, String projectname, String reason, String type, String divison, String category,
			String priority, String department, Date startdate, Date enddate, String location, String status) {
		super();
		this.proId = proId;
		this.projectname = projectname;
		this.reason = reason;
		this.type = type;
		this.divison = divison;
		this.category = category;
		this.priority = priority;
		this.department = department;
		this.startdate = startdate;
		this.enddate = enddate;
		this.location = location;
		this.status = status;
	}
	public ProjectDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
