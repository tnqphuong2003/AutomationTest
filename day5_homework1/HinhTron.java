package day5_homework1;

public class HinhTron extends HInhHoc {

	@Override
	public void tinhDienTich() {
		// TODO Auto-generated method stub
		String dienTich = String.valueOf(3.14 * banKinh * banKinh);
		System.out.println("dien tich: " + dienTich);
	}
	
	public int banKinh;
}
