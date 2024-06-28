/*
 * @ (#)  CircleDriver.java   2023-06    Oct 9, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package generic.demo;

import java.net.Socket;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Oct 9, 2023
 * @time:		 6:24:14 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class CircleDriver {
	public static void main(String[] args) {
		Circle<Integer> c1 = new Circle<>(100);
		Circle<Double> c2 = new Circle<>(100.0);
//		Circle<String> c3 = new Circle<>("A Long");
		
		System.out.println(c1);
		System.out.println(c2);
//		System.out.println(c3);
	}

}