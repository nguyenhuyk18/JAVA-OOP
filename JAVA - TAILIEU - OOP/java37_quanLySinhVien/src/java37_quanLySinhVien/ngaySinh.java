package java37_quanLySinhVien;

public class ngaySinh {
	private int day,month,year;
	
	public ngaySinh(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean checkAvalidDate() {
		if(this.year <= 0) return false;
		switch(this.month) {
			case 1, 3, 5, 7, 8, 10, 12:
				if(this.day <= 31 && this.day >= 0) return true;
				return false;
				
			case 4 ,6 ,9 ,11:
				if(this.day <= 30 && this.day >= 0) return true;
				return false;
				
			case 2:
				if ( (this.year%4 == 0 && this.year%100 != 0) || this.year%4==0 ) {
					if(this.day <= 29 && this.day >= 0) return true;
					return false;
				}
				
				else {
					if(this.day <= 28 && this.day >= 0) return true;
					return false;
				}
			default:
				return false;
 		}
	}
	
	public String to_string() {
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	public boolean soSanhCungNgayThangNam(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(this.getClass() != obj.getClass()) return false;
		
		ngaySinh k = (ngaySinh) obj;
		
		return (k.day == this.day) && (k.month == this.month) && (k.year == this.year);
		
	}
	
	
}
