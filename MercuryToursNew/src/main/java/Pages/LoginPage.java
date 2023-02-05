package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
WebDriver driver;
	 public LoginPage(WebDriver driver) { 
		 this.driver = driver;
	 }
	
	public void setLoginCredentials(String name,String pass) {
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys(name);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pass);
		WebElement sub_btn = driver.findElement(By.name("submit"));
		sub_btn.click();
	}

}
