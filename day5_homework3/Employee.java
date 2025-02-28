package day5_homework3;

public class Employee {
	private String hoTen;
	private String maNV;
	private String phongBan;
	private double luongCoBan;
	private double heSoLuong;
	
	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}
	
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	
	public String getPhongBan() {
		return phongBan;
	}
	
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getMaNV() {
		return maNV;
	}
	
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	
	public void NhapThongTin(String phongBan, int no) {
		
		if (phongBan == "developer") {
			this.setHoTen("Le Van 00" + no);
			this.setMaNV("D00" + no);
			this.setPhongBan("Developer");
			this.setHeSoLuong(no%3!=0 ? 1.5 : 2);
			this.setLuongCoBan(15000000);
		} else {
			this.setHoTen("Tran Thi 00" + no);
			this.setMaNV("T00" + no);
			this.setPhongBan("Tester");
			this.setHeSoLuong(no%3!=0 ? 1 : 1.5);
			this.setLuongCoBan(12000000);
		}
	}
	
	public void InThongTin() {
		System.out.print(this.getHoTen() + " - Mã NV: "+ this.getMaNV());
	}

}
