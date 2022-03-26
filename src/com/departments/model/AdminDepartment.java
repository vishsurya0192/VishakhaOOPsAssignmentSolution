package com.departments.model;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		String department = "Admin Department";
		return department;
	}
	public String getTodaysWork() {
		String todaysWork = "Complete your documents submission";
		return todaysWork;
	}
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}

}
