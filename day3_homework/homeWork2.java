package day3;

import java.util.Scanner;

public class homeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		timBoiSoCua2Va3();
	}
	
	public static void timBoiSoCua2Va3() {
		try (Scanner sc = new Scanner(System.in)) {
			int value = 0;
			int i = 1;
			while (i <= 20) {
				System.out.println("Nhập số thứ " + i + ": ");
				value = sc.nextInt();
				if (value % 2 == 0 && value % 3 == 0) {
					System.out.println("Số thỏa mãn là : " + value);
					return;
				} else {
					i += 1;
				}
			}
			
			System.out.println("Không tìm thấy số thỏa mãn");
			
		}
	}

}
