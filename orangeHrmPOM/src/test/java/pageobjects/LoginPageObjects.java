package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
	/*Normal way
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
public static WebElement password(WebDriver driver) {
	return driver.findElement(By.name("password"));
	
}
public static WebElement login(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
}*/
	
	// Using PageFactory
	@FindBy(name = "username" )
	public static WebElement username;
	@FindBy(name = "password")
	public static WebElement password;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public static WebElement login;
	
	
}
