package java37_quanLySinhVien;

public class sinhVien {
	private String mssv,hoVaTen;
	private double DTB;
	private ngaySinh ns;
	private lop ls;
	
	public sinhVien(String mssv, String hoVaTen, double DTB, ngaySinh ns, lop ls) {
		this.mssv = mssv;
		this.hoVaTen = hoVaTen;
		this.DTB = DTB;
		this.ns = ns;
		this.ls = ls;
	}
	
	public lop getLop() {
		return ls;
	}
	public String getTenSinhVien() {
		return this.hoVaTen;
	}
	public boolean dauHayKhong() {
		return this.DTB >= 5;
	}
	public double getDTB() {
		return this.DTB;
	}
	public ngaySinh getNgaySinh() {
		return this.ns;
	}
	
	public void inThongTinSinhVien() {
		System.out.println(this.hoVaTen + "\t" + this.mssv + "\t" + this.ns.to_string() + "\t" + this.ls.getTenLop() + "\t" + this.ls.getTenKhoa());
	}
}
