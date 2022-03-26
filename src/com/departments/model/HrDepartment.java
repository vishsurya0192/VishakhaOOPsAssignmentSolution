package com.departments.model;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		String department = "Hr Department ";
		return department;
	}
	public String getTodaysWork() {
		String todaysWork = "Fill today’s worksheet and mark your attendance";
		return todaysWork;
	}
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	public String doActivity() {
		String activity = "Team Lunch";
		return activity;
	}

}
