package java37_quanLySinhVien;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		
		Scanner sc = new Scanner(System.in);
		String mssv,hoVaTen,tenLop,tenKhoa,kk;
		int day,month,year;
		double DTB;
		
		sinhVien sv[];
		lop l;
		ngaySinh sn;
		
		
		
		int n,luachon;
		System.out.print("Nhập số lượng sinh viên: ");
		n = sc.nextInt();
		sv = new sinhVien[n];
		while(true) {
			System.out.println("\n\n\t\t============MENU============");
			System.out.println("\t1. Nhập " + n + " thông tin sinh viên.");
			System.out.println("\t2. In tên khoa của các sinh viên đang theo học.");
			System.out.println("\t3. In kết quả của sinh viên (đậu hoặc rớt).");
			System.out.println("\t4. Kiểm tra ngày sinh của sinh viên bất kỳ có trùng với các sinh viên khác không.");
			System.out.println("\n\n\t\t==============END=============");
			System.out.print("\tNhập lựa chọn mà bạn muốn(nhập 0 để thoát): ");
			
			luachon = sc.nextInt();
			kk = sc.nextLine();
			
			if(luachon == 1) {
				for(int i=0;i<n;i++) {
					System.out.println("\n\n\tNhập thông tin sinh viên thứ: " + (i+1));
					System.out.print("Nhập họ và tên: ");
					hoVaTen = sc.nextLine();
					System.out.print("Nhập mã số sinh viên: ");
					mssv = sc.nextLine();
					System.out.print("Nhập tên lớp: ");
					tenLop = sc.nextLine();
					System.out.print("Nhập tên khoa: ");
					tenKhoa = sc.nextLine();
					
					do {
						System.out.print("Nhập ngày: ");
						day = sc.nextInt();
						System.out.print("Nhập tháng: ");
						month = sc.nextInt();
						System.out.print("Nhập năm: ");
						year = sc.nextInt();
						sn = new ngaySinh(day, month, year);
					}while(sn.checkAvalidDate() == false);
					
					do {
						System.out.print("Nhập điểm: ");
						DTB = sc.nextDouble();
					}while(DTB < 0);
					kk = sc.nextLine();
					l = new lop(tenLop, tenKhoa);
					sv[i] = new sinhVien(mssv, hoVaTen, DTB, sn, l);
				}
			}
			else if(luachon == 2) {
				int dem = 0;
				for(int i=0;i<n;i++) {
					++dem;
					System.out.println(dem + ' ' + sv[i].getTenSinhVien() + ":" + ' ' + sv[i].getLop().getTenKhoa());
				}
			}
			else if(luachon == 3) {
				int dem = 0;
				for(int i=0;i<n;i++) {
					++dem;
					if(sv[i].getDTB() >= 5) {
						System.out.println(dem + ' ' + sv[i].getTenSinhVien() + ": " + "Đậu");
					}
					else {
						System.out.println(dem + ' ' + sv[i].getTenSinhVien() + ": " + "Rớt");
					}
				}
			}
			else if(luachon == 4) {
				for(int i=0;i<n;i++) {
					sv[i].inThongTinSinhVien();
				}
				
				String e;
				int dem = 0,dem1 = 0;
				System.out.print("Nhập tên sinh viên mà bạn muốn check: ");
				e = sc.nextLine();
				
				for(int i =0;i<n;i++) {
					int check = -1;
					if(new String(sv[i].getTenSinhVien()).equals(e) == true) {
						check = i;
						dem1++;
					}
					if(check != -1) {
						for(int j=0;j<n;j++) {
							if(j != check && sv[i].getNgaySinh().soSanhCungNgayThangNam(sv[j].getNgaySinh()) == true) {
								++dem;
							}
						}
					}
				}
				
				if(dem1 != 0) {
					if(dem != 0) System.out.println("Sinh viên " + e + "có trùng ngày sinh với một số bạn");
					else System.out.println("ĐÉO!!!");
				}
				else {
					System.out.println("không tìm thấy sinh viên mà bạn muốn tìm!!!");
				}
				
			}
			else if(luachon == 0) {
				break;
			}
		}
		sc.close();
	}
}
