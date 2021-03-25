package com.wage;
public class EmployeeWageOop {
			// Creating a method
			public void welcomeMsg() {
				System.out.println("Welcome to employee wage Details");

				// Check the employee is present or absent
				int IS_FULL_TIME = 1;
				double empcheck = Math.floor(Math.random() * 10) % 2;
				if (empcheck == IS_FULL_TIME) {
					System.out.println("emp is present");
				} else {
					System.out.println("emp is not present");
				}

			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				// To creating a object and call the method
				EmployeeWageOop obj = new EmployeeWageOop();
				obj.welcomeMsg();

			}
			
		}
	