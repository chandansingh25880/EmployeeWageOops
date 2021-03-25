package com.wage;

public class EmployeeWageOop {

	// Creating a method
	public void welcomeMsg() {
		// Check the employee is present or absent
		final int Is_Part_Time = 1; // Added part time condition
		final int IS_FULL_TIME = 2;

		final int NoOfWorkingDays = 2;
		// Calculating daily employee wage
		final int empWagePerHrs = 20;
		int empHrs = 0;
		int empWage = 0;
		double empcheck = Math.floor(Math.random() * 10) % 3; // Check random value between 0,1 and 2
		if (empcheck == Is_Part_Time) {
			empHrs = 8;
		} else if (empcheck == IS_FULL_TIME) {
			empHrs = 4; //
		} else
			empHrs = 0;
		empWage = empHrs * empWagePerHrs;
		System.out.println("EmpWage :" + " " + empWage);

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case Is_Part_Time:
			empHrs = 4;
			break;
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * empHrs;
		System.out.println("Emp Wage" + " " + empWage);

	}

	public void empWage() {
		final int IsPartTime = 1;
		final int IsFullTime = 2;
		final int EmpRatePerHrs = 20;
		final int NoOfWorkingDays = 2;

		int EmpWage = 0;
		int Emphrs = 0;
		int totalEmpWage = 0;
		for (int days = 0; days < NoOfWorkingDays; days++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IsPartTime:
				Emphrs = 4;
				break;
			case IsFullTime:
				Emphrs = 8;
				break;
			default:
				Emphrs = 0;
			}
			EmpWage = Emphrs * EmpRatePerHrs;
			totalEmpWage += EmpWage;
			System.out.println(" ");
			System.out.println("Emp Wage" + " " + EmpWage);
		}
		System.out.println("totalEmpWage" + " " + totalEmpWage);

	}

	// Creating method
	public void totalWorkingHrsOrDay() {

		final int isPartTime = 1;
		final int isFullTime = 2;
		final int empRatePerHrs = 20;
		final int noOfWorkingDays = 20;
		final int maxHrInMonth = 10;

		int Emphrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs <= maxHrInMonth && totalWorkingDays <= noOfWorkingDays) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case isPartTime:
				Emphrs = 4;
				break;
			case isFullTime:
				Emphrs = 100;
				break;
			default:
				Emphrs = 0;
			}
			totalEmpHrs += Emphrs;
			System.out.println(totalWorkingDays + "Emphrs: " + Emphrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHrs;
		System.out.println("total Emp Wage" + " " + totalEmpWage);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To creating a object and call the method
		EmployeeWageOop obj = new EmployeeWageOop();
		obj.welcomeMsg();
		EmployeeWageOop obj1 = new EmployeeWageOop();
		obj1.empWage();
		EmployeeWageOop obj2 = new EmployeeWageOop();
		obj2.totalWorkingHrsOrDay();

	}

}