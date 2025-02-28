package day5_homework1;

public class HinhHoc_App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HinhTron ht = new HinhTron();
		ht.setTenHinh("hinh tron AAA");
		ht.banKinh = 3;
		System.out.print(ht.getTenHinh() + " co ");
		ht.tinhDienTich();
		
		HinhVuong hv = new HinhVuong();
		hv.setTenHinh("hinh vuong BBB");
		hv.chieuDaiMotCanh = 5;
		System.out.print(hv.getTenHinh() + " co ");
		hv.tinhDienTich();
		
	}

}
