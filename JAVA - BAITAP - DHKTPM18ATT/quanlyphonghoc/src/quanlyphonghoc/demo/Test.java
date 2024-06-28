/*
 * @ (#)  Test.java   2023-06    Nov 21, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlyphonghoc.demo;

import java.util.List;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 21, 2023
 * @time:		 12:22:25 AM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Test {
	public static void main(String[] args) {
		DanhSachPhongHoc list = new DanhSachPhongHoc();
		list.themPhongHoc(new PhongLyThuyet("01", "A", 100, 50, false));
		list.themPhongHoc(new PhongLyThuyet("01A", "A", 200, 50, true));
		list.themPhongHoc(new PhongLyThuyet("01B", "A", 300, 50, false));
		list.themPhongHoc(new PhongLyThuyet("01C", "A", 400, 50, true));
		
		list.themPhongHoc(new PhongMayTinh("02", "B", 50.5, 10, 10));
		list.themPhongHoc(new PhongMayTinh("02A", "B", 110.5, 20, 20));
		list.themPhongHoc(new PhongMayTinh("02B", "B", 120.5, 30, 30));
		list.themPhongHoc(new PhongMayTinh("02C", "B", 200.5, 40, 40));
		
		list.themPhongHoc(new PhongThiNghiem("03", "C", 50.04, 10, "CNTT", 50, false));
		list.themPhongHoc(new PhongThiNghiem("03A", "C", 150.04, 50, "CNTT", 100, false));
		list.themPhongHoc(new PhongThiNghiem("03B", "C", 250.04, 50, "CNTT", 150, true));
		list.themPhongHoc(new PhongThiNghiem("03C", "C", 350.04, 50, "CNTT", 250, true));
		
		list.getDS().forEach(ph -> System.out.println(ph));
		System.out.println();
		System.out.println();
		System.out.println("So luong phong hoc: "+list.getSoPhongHoc());
		System.out.println();
		list.capNhatSoMayTinh("02A", 50);
		System.out.println("Sau khi cap nhat");
		list.getDS().forEach(ph1 -> System.out.println(ph1));
		System.out.println();
		System.out.println("Danh sach dat chuan");
		list.inDanhSachPhongHocDatChuan().forEach(ph2 -> System.out.println(ph2));
		System.out.println();
		List<PhongHoc> ph3=list.getDSPhongMayTinhCo60May(60);
		System.out.println(ph3);
		System.out.println();
		list.xoaPhongHoc("02");
		System.out.println("Danh sach sau khi xoa");
		list.getDS().forEach(ph -> System.out.println(ph));

		
	}

}
