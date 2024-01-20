package withoutAtFindby;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutAtFindBy {
	public static WebElement username;
	public static WebElement password;
	public static WebElement login;

@Test
	public void login() {
		//System.setProperty("webdriver.chrome.driver","D:\\Manju\\AutomationTesting\\AutomationTestingTools\\Drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver,LoginWithoutAtFindBy.class);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();
		
}
}
