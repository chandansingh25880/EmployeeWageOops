package com.wage;

public class EmployeeWageOop {
	// Creating a method
	public void welcomeMsg() {

		// Check the employee is present or absent
		int IS_FULL_TIME = 1;
		// Calculating daily employee wage
		final int empWagePerHrs = 20;
		int empHrs = 0;
		int empWage = 0;

		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_FULL_TIME) {

			empHrs = 8;
			System.out.println("emp is present");
		} else {

			empHrs = 0;
			System.out.println("emp is not present");
		}
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
