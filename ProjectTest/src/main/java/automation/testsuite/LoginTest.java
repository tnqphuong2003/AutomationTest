package automation.testsuite;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class LoginTest extends CommonBase {
	@BeforeMethod
	public void openBrowserTest() {
		driver = initBrowser("https://alada.vn/tai-khoan/dang-nhap.html");
	}
	
	@Test
	public void locateById() {
		WebElement txtUsername = driver.findElement(By.id("txtLoginUsername"));
		System.out.println("Element is : " + txtUsername);
		
		WebElement txtPassword = driver.findElement(By.id("txtLoginPassword"));
		System.out.println("Element is : " + txtPassword);
	}
	
	@Test
	public void locateByName() {
		WebElement txtUsername = driver.findElement(By.name("txtLoginUsername"));
		System.out.println("Element is : " + txtUsername);
		
		WebElement txtPassword = driver.findElement(By.name("txtLoginPassword"));
		System.out.println("Element is : " + txtPassword);
	}
	
	@Test
	public void locateByClassName() {
		WebElement btnFacebook = driver.findElement(By.className("btn_face"));
		System.out.println("Element is : " + btnFacebook);
	}
	
	@Test
	public void locateByLinkText() {
		WebElement lnkForgotPassword = driver.findElement(By.linkText("Quên mật khẩu?"));
		System.out.println("Element is : " + lnkForgotPassword);
		
		WebElement lnkInstructor = driver.findElement(By.partialLinkText("giảng viên"));
		System.out.println("Element is : " + lnkInstructor);
	}
	
	@Test
	public void locateByTagName() {
		WebElement textInput = driver.findElement(By.tagName("input"));
		System.out.println("Element is : " + textInput);
	}
}
