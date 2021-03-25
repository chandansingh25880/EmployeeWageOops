package com.wage;
public class EmployeeWageOop {
	// Creating a method
	public void welcomeMsg() {
		// Check the employee is present or absent
		int Is_Part_Time = 1; // Added part time condition
		int IS_FULL_TIME = 2;
		// Calculating daily employee wage
		final int empWagePerHrs = 20;
		int empHrs = 0;
		int empWage = 0;
		 // Check random value 
		double empcheck = Math.floor(Math.random() * 10) % 3; 
		if (empcheck == Is_Part_Time) {
			empHrs = 8;
		} else if (empcheck == IS_FULL_TIME) {
			empHrs = 4; //
		} else
			empHrs = 0;
		empWage = empHrs * empWagePerHrs;
		System.out.println("EmpWage :" + " " + empWage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To creating a object and call the method
		EmployeeWageOop obj = new EmployeeWageOop();
		obj.welcomeMsg();

	}

}
