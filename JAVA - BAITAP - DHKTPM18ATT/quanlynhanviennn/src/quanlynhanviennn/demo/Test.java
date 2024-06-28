/*
 * @ (#)  Test.java   2023-06    Nov 22, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package quanlynhanviennn.demo;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Nov 22, 2023
 * @time:		 1:09:39 AM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Test {
	public static void main(String[] args) {
		DanhSachNhanVien list = new DanhSachNhanVien();
		list.themMotNhanVien(new NhanVienBanHang("01", "A", "0123013", 1800000.0, 20000000.0));
		list.themMotNhanVien(new NhanVienBanHang("02", "B", "0123013", 1800000.0, 10000000.0));
		list.themMotNhanVien(new NhanVienBanHang("03", "C", "0123013", 1800000.0, 50000000.0));
		list.themMotNhanVien(new NhanVienBanHang("04", "D", "0123013", 1800000.0, 1500000.0));
		list.themMotNhanVien(new NhanVienBanHang("05", "E", "0123013", 1800000.0, 1000000.0));
		
		list.themMotNhanVien(new NhanVienVanPhong("06", "FA", "013012031", 1800000.0, 2.56));
		list.themMotNhanVien(new NhanVienVanPhong("07", "FA", "013012031", 1800000.0, 7.8));
		list.themMotNhanVien(new NhanVienVanPhong("08", "FA", "013012031", 1800000.0, 2.89));
		list.themMotNhanVien(new NhanVienVanPhong("09", "FA", "013012031", 1800000.0, 3.02));
		list.themMotNhanVien(new NhanVienVanPhong("011", "FA", "013012031", 1800000.0, 2.65));
		
		list.getDSNV().forEach(p -> System.out.println(p));
		System.out.println();
		list.thongKeLuongTrungBinh().entrySet().stream().forEach(p -> System.out.println(p));
		System.out.println();
		list.getDSNVKhongCoThuNhapTangThem().stream().forEach(p->System.out.println(p));
		System.out.println();
		list.getDSNVBanHangCoDoanhSoLonNhat().stream().forEach(p->System.out.println(p));
		System.out.println();
		list.capNhatThongTinNhanVienVanPhong("06", new NhanVienVanPhong("0982", "HAH", "0103013", 5.08, 50));
		list.getDSNV().forEach(p -> System.out.println(p));
		
	}

}