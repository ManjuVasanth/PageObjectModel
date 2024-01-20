package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.LoginPageObjects;

public class LoginPageTestCases {
	@Test(enabled = false)
	public void login() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","D:\\Manju\\AutomationTesting\\AutomationTestingTools\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//normal methods
		/*LoginPageObjects.username(driver).sendKeys("Admin");
		
		LoginPageObjects.password(driver).sendKeys("admin123");
		LoginPageObjects.login(driver).click();
		*/
		/*WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		//WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		//WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();*/
		
		//PageFactory
		PageFactory.initElements(driver,LoginPageObjects.class);
		LoginPageObjects.username.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.login.click();
		driver.quit();
		
		
		
		
	}

}
