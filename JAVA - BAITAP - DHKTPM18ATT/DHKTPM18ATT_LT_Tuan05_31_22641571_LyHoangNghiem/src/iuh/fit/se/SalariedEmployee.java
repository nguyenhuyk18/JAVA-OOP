/*
 * @ (#)  SalariedEmployee.java   2023-06    Sep 19, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package iuh.fit.se;

import java.time.LocalDate;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Sep 19, 2023
 * @time:		 6:50:25 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class SalariedEmployee extends Employee{
	double annualSalary;
	public SalariedEmployee() {
		super();
		this.annualSalary = 0.0;
	}
	public SalariedEmployee(String id, String name, LocalDate dob, double annualSalary) {
		super(id, name, dob);
		this.annualSalary = annualSalary;
		if(this.annualSalary <= 0)
			throw new IllegalArgumentException("Error Salary");
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		if(this.annualSalary <= 0)
			throw new IllegalArgumentException("Error Salary");
		this.annualSalary = annualSalary;
	}
	@Override
	public double weeklyPay() {
		return this.annualSalary / 52;
	}
	@Override
	public String toString() {
		return super.toString()+"SalariedEmployee [annualSalary=" + annualSalary + "]";
	}
}
