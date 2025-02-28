package automation.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonBase {

	public WebDriver driver;
	public WebDriver initBrowser(String URL) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.out.println("aaaaaa" + System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}
