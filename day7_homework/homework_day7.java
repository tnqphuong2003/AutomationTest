package automation.testsuite;
import java.util.Scanner;

import org.testng.annotations.Test;

import automation.common.CommonBase;

public class homework_day7 extends CommonBase {
//	 Homework day 7
		@Test
		public void Nhanvien() {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Nhập nhân viên: ");
				String[] empArr = new String[5];
				for (int i = 0; i < empArr.length; i++) {
					System.out.print(i + ": ");
					empArr[i] = sc.next();
				}
				
				for (int i=0; i < empArr.length; i++) {
					System.out.println(empArr[i]);
				}
	
			}
			

}
}