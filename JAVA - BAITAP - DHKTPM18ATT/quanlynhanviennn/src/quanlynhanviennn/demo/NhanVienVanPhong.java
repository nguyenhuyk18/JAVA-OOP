/*
 * @ (#)  NhanVienVanPhong.java   2023-06    Nov 22, 2023
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
 * @time:		 12:46:49 AM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class NhanVienVanPhong extends NhanVien {
	private double heSoLuong;

	public NhanVienVanPhong() {
		this("", "", "", 0.0, 0.0);
	}

	public NhanVienVanPhong(String maSo, String hoTen, String sdt, double luongCB, double heSoLuong) {
		super(maSo, hoTen, sdt, luongCB);
//		if (this.heSoLuong < 1.86 || this.heSoLuong > 8.69)
//			throw new IllegalArgumentException("He so luong sai");
		this.heSoLuong = heSoLuong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		if (this.heSoLuong < 1.86 || this.heSoLuong > 8.69)
			throw new IllegalArgumentException("He so luong sai");
		this.heSoLuong = heSoLuong;
	}

	@Override
	public double tinhTienLuong() {
		return super.luongCB * this.heSoLuong;
	}

	@Override
	public String toString() {
		return super.toString() + "[heSoLuong= " + heSoLuong;
	}

}