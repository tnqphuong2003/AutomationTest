package day3;

import java.util.Scanner;

public class homeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//timSoNhoNhatTrongArray();
		timSoLonNhatTrongArray();
		
	}
	
	public static int[] nhapMangSoNguyen() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhập số lượng phần tử của mảng số nguyên: ");
			int num = sc.nextInt();
			int[] arr = new int[num];
			for (int i=0; i< num; i++) {
				System.out.print("phần tử thứ " + i + ": ");
				arr[i] = sc.nextInt();
			}
			return arr;
		}
	}

	public static void timSoNhoNhatTrongArray() {
		int[] arr = nhapMangSoNguyen();
		int min = arr[0];
		for (int i=0; i< arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Số nhỏ nhất trong mảng: " + min);
	}
	
	public static float[] nhapMangSoThapPhan() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhập số lượng phần tử của mảng số thập phân: ");
			int num = sc.nextInt();
			float[] arr = new float[num];
			for (int i=0; i< num; i++) {
				System.out.print("phần tử thứ " + i + ": ");
				arr[i] = sc.nextFloat();
			}
			return arr;
		}
	}
	
	public static void timSoLonNhatTrongArray() {
		float[] arr= nhapMangSoThapPhan();
		float max = arr[0];
		for (int i=0; i< arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Số lớn nhất trong mảng: " + max);
	}
}
