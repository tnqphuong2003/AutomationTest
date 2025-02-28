package day5_homework3;

import java.util.Scanner;

public class QLNV_App {
	private static int devNum = 0;
	private static int testerNum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Thông tin phòng Dev - bấm số 1 ");
			System.out.println("Thông tin phòng QA - bấm số 2 ");
			System.out.print("chọn :");
			int selection = sc.nextInt();
			if (selection == 1) {
				NhapThongTinDevelopers();
			} else {
				NhapThongTinTesters();
			}
		}
	}
	
	public static void NhapThongTinDevelopers() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhập số lượng developer: ");
			devNum = sc.nextInt();
			Developer[] devArr = new Developer[devNum];
			for (int i=0; i<devNum; i++) {
				devArr[i] = NhapThongTinDeveloper(i+1);
			}

			System.out.println("Nhân vien phong Dev: ");
			InThongTinNhanVienPhongBan(devArr);
		}
	}
	
	public static Developer NhapThongTinDeveloper(int devNo) {
		Developer dev = new Developer();
		
		dev.viTri = devNo%3!=0 ? "developer" : "senior";
		dev.NhapThongTin("developer", devNo);
		
		return dev;
	}
	
	public static void NhapThongTinTesters() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhập số lượng tester: ");
			testerNum = sc.nextInt();
			
			Tester[] testArr = new Tester[testerNum];
			for (int i=0; i<testerNum; i++) {
				testArr[i] = NhapThongTinTester(i+1);
			}

			System.out.println("Nhân vien phong QA: ");
			InThongTinNhanVienPhongBan(testArr);
		}
	}
	
	public static Tester NhapThongTinTester(int testerNo) {
		Tester tester = new Tester();
		tester.phanLoaiTester = testerNo%3!=0 ? "manual" : "automation";
		tester.NhapThongTin("tester", testerNo);
		return tester;
	}

	public static void InThongTinNhanVienPhongBan(Developer[] devs) {
		for (int i=0; i<devs.length; i++) {
			devs[i].InThongTin();
			System.out.println(" - " + devs[i].viTri);
		}		
	}
	
	public static void InThongTinNhanVienPhongBan(Tester[] testers) {
		for (int i=0; i<testers.length; i++) {
			testers[i].InThongTin();
			System.out.println(" - " + testers[i].phanLoaiTester);
		}		
	}
}
	