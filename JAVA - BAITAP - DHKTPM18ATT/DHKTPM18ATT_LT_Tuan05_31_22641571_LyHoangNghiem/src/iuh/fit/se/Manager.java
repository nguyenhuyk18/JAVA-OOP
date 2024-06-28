/*
 * @ (#)  Manager.java   2023-06    Sep 19, 2023
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
 * @time:		 6:59:12 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Manager extends SalariedEmployee{
	private double weeklyBonus;
	public Manager() {
		super();
		this.weeklyBonus = 0.0;
	}
	public Manager(String id, String name, LocalDate dob, double annualSalary, double weeklyBonus) {
		super(id, name, dob, annualSalary);
		this.weeklyBonus = weeklyBonus;
		if(this.weeklyBonus <= 0)
			throw new IllegalArgumentException("Error Weekly Bonus");
	}
	public double getWeeklyBonus() {
		return weeklyBonus;
	}
	public void setWeeklyBonus(double weeklyBonus) {
		if(this.weeklyBonus <= 0)
			throw new IllegalArgumentException("Error Weekly Bonus");
		this.weeklyBonus = weeklyBonus;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "Manager [weeklyBonus=" + weeklyBonus + "]";
	}
	@Override
	public double weeklyPay() {
		return super.weeklyPay() + this.weeklyBonus;
	}
}