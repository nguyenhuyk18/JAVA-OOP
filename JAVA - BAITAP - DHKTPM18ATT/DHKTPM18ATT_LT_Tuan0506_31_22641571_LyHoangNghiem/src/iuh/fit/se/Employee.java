/*
 * @ (#)  Employee.java   2023-06    Sep 18, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package iuh.fit.se;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Sep 18, 2023
 * @time:		 9:26:39 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public abstract class Employee {

	String id;
	String name;
	LocalDate dob;

	public Employee() {
		this.id = "";
		this.name = "";
		this.dob = null;

	}

	public Employee(String id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		if (this.id == null || this.id.trim().equals("") == true)
			throw new IllegalArgumentException("ID Cannot Be Empty!");
		if (this.name == null || this.name.trim().equals("") == true)
			throw new IllegalArgumentException("Name Cannot Be Emppty!");
		if (this.dob == null)
			throw new IllegalArgumentException("Date Of Birth Cannot Be Empty!");
		
		

	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		if (this.id == null || this.id.trim().equals("") == true)
			throw new IllegalArgumentException("ID Cannot Be Empty!");
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (this.name == null || this.name.trim().equals("") == true)
			throw new IllegalArgumentException("Name Cannot Be Emppty!");
		this.name = name;
	}

	public LocalDate getDob() {
		return this.dob;
	}

	public void setDob(LocalDate dob) {
		if (this.dob == null)
			throw new IllegalArgumentException("Date Of Birth Cannot Be Empty!");
		this.dob = dob;
	}

	public abstract double weeklyPay();

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat salaryFormat = new DecimalFormat("#,###.00");
		return "Employee ID: " + id + "\n" + "Name: " + name + "\n" + "Date Of Birth: " + dateFormat.format(dob) + "\n"
				+ "Weekly Pay: $" + salaryFormat.format(weeklyPay());
	}
}
