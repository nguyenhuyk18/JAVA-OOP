package iuh.fit.se;
/*
 * @ (#) Company.java       1.0     Sep 11, 2023
 *
 * Copyright (c) 2023 IUH. All rights reserved.
 */

import java.util.Map;
import java.util.Set;

/*
 * @description: 
 * @author: Khanh Nguyen
 * @date:   Sep 11, 2023
 * @version:    1.0
 */
public class EmployeeList {
	
	private Set<Employee> employees;

	/**
	 * Default constructor: Create a collection of employees
	 */
	public EmployeeList() {
	}

	/**
	 * This method returns the collection of employees
	 * @return
	 */
	public Set<Employee> getEmployees() {
		return employees;
	}

	/**
	 * This method adds a new employee to the list. 
	 * @param emp the new employee
	 * @throws IllegalArgumentException if the employee id is duplicated
	 */
	public boolean addEmployee(Employee emp) {
		return false;
	}

	/**
	 * Search the employee by id
	 * @param id
	 * @return
	 */
	public Employee searchEmployeeById(String id) {
		
		return null;
	}

	/**
	 * This method adds an array of employees to the list
	 * @param emps the array of employees
	 */
	public void addAll(Set<Employee> emps) {
	}
	
	/**
	 * This method sorts the list by weekly salary of employees in ascending order
	 * @return
	 */
	public Set<Employee> sortByWeeklySalary() {
		return null;
	}
	
	/**
	 * Remove an employee by id
	 * @param id the given id
	 * @throws IllegalArgumentException if the employee with the given id does not exist
	 */
	public boolean removeEmployee(String id) {
		return false;
	}
	
	/**
	 * This method updates the information of an employee by id
	 * @param newInfor the new information
	 * @throws IllegalArgumentException if the employee with the given id does not exist
	 */
	public boolean updateEmployee(Employee newInfor) {

		return false;
	}
	/**
	 * This method returns an array of employees who are hourly employees and work more than 40 hours per week
	 * @return an array of employees who are hourly employees and work more than 40 hours per week
	 */
	public Set<Employee> getHourlyEmpsWorkMoreThan40() {
		
		return null;
	}
	
	/**
	 * This method returns the total salary of all managers
	 * @return the total salary of all managers
	 */
	public double getWeeklyTotalSalaryOfManager () {
		
		return 0.0;
	}
	
	/**
	 * This method updates the hourly work of an hourly employee by id
	 * @param id the given id
	 * @param newHour the new hourly worked
	 * @throws IllegalArgumentException if the new hourly worked is less than 0
	 * @throws IllegalArgumentException if the employee with the given id does not exist or the employee is not an hourly employee
	 */
	public void updateHourlyWorked(String id, int newHour) {
		

	}

	/**
	 * This method returns an array of employees who are young managers (less than 30 years old)
	 * @return an array of employees who are young managers (less than 30 years old)
	 */
	public Set<Employee> getYoungEmployeesAsManagers() {
		return null;
	}
	
	/**
	 * This method returns a map of number of employees by year of birth
	 * @return a map of number of employees by year of birth
	 */
	public Map<Integer, Long> getNoOfEmployeesByYOB() {
		return null;
	}
	
	/**
	 * This method returns a map of total weekly salary of all employees by employee type, sorted in ascending order of total salary
	 * @return a map of total weekly salary of all employees by employee type, sorted in ascending order of total salary
	 */
	public Map<String, Double> getTotalWeeklySalary() {
		return null;
	}

	/**
	 * This method returns a set of year of birth of all employees, sorted in descending order
	 * @return a set of year of birth of all employees, sorted in descending order
	 */
	public Set<Integer> getYOBSet() {
		return null;
	}
}



