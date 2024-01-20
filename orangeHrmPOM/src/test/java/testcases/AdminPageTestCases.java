package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjects.AdminPageObjects;
import pageobjects.LoginPageObjects;


public class AdminPageTestCases {
	@Test()
	public void adminTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * WebElement username = driver.findElement(By.name("username"));
		 * username.sendKeys("Admin"); WebElement password =
		 * driver.findElement(By.name("password")); password.sendKeys("admin123");
		 * WebElement login = driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		 * login.click();
		 */
		
	
		
		//WebElement adminTab = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));
		//adminTab.click();
		
		//WebElement systemUsername = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
		//systemUsername.sendKeys("Cheeku");
		//WebElement userRoledropDown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/select"));
		//WebElement userRoleDropDown = driver.findElement(By.className("oxd-select-text oxd-select-text--active"));
		//Select selectUserRole = new Select(userRoleDropDown);
		//selectUserRole.selectByIndex(1);
		//WebElement employeeNameText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div"));
		//employeeNameText.sendKeys("Virat  Kohli");
		//WebElement statusDropDown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));
		//Select selectStatus = new Select(statusDropDown);
		//selectStatus.selectByIndex(1);
		//WebElement searchbtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
		//searchbtn.click();
		
		/*LoginPageObjects.username(driver).sendKeys("Admin");
		LoginPageObjects.password(driver).sendKeys("admin123");
		LoginPageObjects.login(driver).click();
		
		AdminPageObjects.admin(driver).click();
		AdminPageObjects.systemUsername(driver).sendKeys("Cheeku");
		AdminPageObjects.search(driver).click();
		*/
		
		//PageFactory
		PageFactory.initElements(driver,LoginPageObjects.class);
		PageFactory.initElements(driver,AdminPageObjects.class);
		
		LoginPageObjects.username.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.login.click();
		AdminPageObjects.admin.click();
		AdminPageObjects.systemUsername.sendKeys("Cheeku");
		AdminPageObjects.search.click();
		driver.quit();
		
	}

}
