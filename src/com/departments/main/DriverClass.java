package com.departments.main;

import com.departments.model.AdminDepartment;
import com.departments.model.HrDepartment;
import com.departments.model.SuperDepartment;
import com.departments.model.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {
		AdminDepartment adminDepartment = new AdminDepartment();
		System.out.println(" Welcome to "+adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		
		HrDepartment hrDepartment = new HrDepartment();
		System.out.println("\n Welcome to "+hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		
		TechDepartment techDepartment = new TechDepartment();
		System.out.println("\n Welcome to "+techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.isTodayAHoliday());
	}

}
