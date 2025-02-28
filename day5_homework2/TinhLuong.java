package day5_homework2;

public class TinhLuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TinhLuong bs = new TinhLuong();
		System.out.println(String.format("%.0f", bs.tinhLuong(10000000, 0.5, 2, "Chuyen Khoa")));
		System.out.println(String.format("%.0f", bs.tinhLuong(10000000, 0.5, 2, "Da Khoa")));
		System.out.println(String.format("%.0f", bs.tinhLuong(10000000, 0.5, 2, "Y Ta")));
	}
	
	public double tinhLuong(double _luongCoBan, double _heSoLuong) {
		return _luongCoBan * _heSoLuong;
	}

	public double tinhLuong(double _luongCoBan, double _heSoLuong, int _namKinhNghiem) {
		return _luongCoBan * _heSoLuong * _namKinhNghiem;
	}
	
	public double tinhLuong(double _luongCoBan, double _heSoLuong, int _namKinhNghiem, String _loaiBS) {
		double type = 0;
		switch (_loaiBS) {
		case "Chuyen Khoa" : type = 0.2; break;
		case "Da Khoa" : type = 0.45; break;
		default: type = 0;
		}
		
		return _luongCoBan * (_heSoLuong * _namKinhNghiem + type);
	}
}
