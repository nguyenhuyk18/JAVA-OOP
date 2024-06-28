package bai4;

import java.util.Scanner;

public class TinhTienDienTuan01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tính tiền điện theo chỉ số cũ và chỉ số mới: ");
		System.out.println("Nhập chỉ số cũ (kWh): ");
		double chiSoCu = sc.nextDouble();
		System.out.println("Nhập chỉ mới mới (kWh): ");
		double chiSoMoi = sc.nextDouble();
		double luongDienTieuThu = chiSoMoi - chiSoCu;
		double soTienDien;
		System.out.println("Lượng điện năng tiêu thụ là: " + luongDienTieuThu + " (kWh)");
		if (luongDienTieuThu > 0 && luongDienTieuThu <= 50) {
			soTienDien = luongDienTieuThu * 1.678;
		} else if (luongDienTieuThu >= 51 && luongDienTieuThu <= 100) {
			soTienDien = 50 * 1.678 + (luongDienTieuThu - 50) * 1.734;
		} else if (luongDienTieuThu >= 101 && luongDienTieuThu <= 200) {
			soTienDien = 50 * 1.678 + 50 * 1.734 + (luongDienTieuThu - 100) * 2.014;
		} else if (luongDienTieuThu >= 201 && luongDienTieuThu <= 300) {
			soTienDien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + (luongDienTieuThu - 200) * 2.536;
		} else if (luongDienTieuThu >= 301 && luongDienTieuThu <= 400) {
			soTienDien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + (luongDienTieuThu - 300) * 2.834;
		} else {
			soTienDien = 50 * 1.678 + 50 * 1.734 + 100 * 2.014 + 100 * 2.536 + 100 * 2.834
					+ (luongDienTieuThu - 400) * 2.972;
		}
		System.out.println("Tiền điện tháng này: " + soTienDien);
		sc.close();
	}
}