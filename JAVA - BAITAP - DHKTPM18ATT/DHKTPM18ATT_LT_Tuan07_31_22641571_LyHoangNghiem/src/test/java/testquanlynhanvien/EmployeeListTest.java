/*
 * @ (#)  EmployeeListTest.java   2023-06    Sep 27, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package testquanlynhanvien;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import quanlynhanvien.Employee;
import quanlynhanvien.EmployeeList;
import quanlynhanvien.HourlyEmployee;
import quanlynhanvien.Manager;
import quanlynhanvien.SalariedEmployee;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Sep 27, 2023
 * @time:		 1:23:32 AM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class EmployeeListTest {
	@Test
	public void testGetWeeklyTotalSalaryOfManager() {
		EmployeeList employeeList = new EmployeeList();
		
		Employee emp1 = new Manager("MN01", "John", LocalDate.of(1990, 2, 20), 10, 50);
		Employee emp2 = new Manager("MN02", "Marry", LocalDate.of(1995, 10, 30),10, 40);
		Employee emp3 = new HourlyEmployee("HE001", "Bob", LocalDate.of(2000, 6, 10), 80, 30.5);
		Employee emp4 = new SalariedEmployee("SE101", "Alice", LocalDate.of(1998, 4, 7),520000 );
		
		employeeList.addEmployee(emp1);
		employeeList.addEmployee(emp2);
		employeeList.addEmployee(emp3);
		employeeList.addEmployee(emp4);
		
		double totalSalary = employeeList.getWeeklyTotalSalaryOfManager();
		assertEquals(20.0,totalSalary,0.0001);
	}
}
