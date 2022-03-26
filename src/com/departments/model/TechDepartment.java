package com.departments.model;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		String department = "Tech Department";
		return department;
	}
	public String getTodaysWork() {
		String todaysWork = "Complete coding of module 1";
		return todaysWork;
	}
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	public String getTechStackInformation() {
		String info = "core Java";
		return info;
	}

}
