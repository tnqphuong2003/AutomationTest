package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class TS_PracticeLocateElement extends CommonBase {
	@BeforeMethod
	public void openBrowserTest() {
		driver = initBrowser("https://automationfc.github.io/basic-form/index.html");
	}
	
	@Test
	public void locateById() {
		WebElement inpName = driver.findElement(By.id("name"));
		System.out.println("Element is : " + inpName);
		
		WebElement inpPassword = driver.findElement(By.id("password"));
		System.out.println("Element is : " + inpPassword);
	}
	
	@Test
	public void locateByTagName() {
		WebElement textAreaAddress = driver.findElement(By.tagName("textarea"));
		System.out.println("Element is : " + textAreaAddress);
	}
	
	@Test
	public void locateByName() {
		WebElement inpEmail = driver.findElement(By.name("email"));
		System.out.println("Element is : " + inpEmail);
	}
	
	

}
