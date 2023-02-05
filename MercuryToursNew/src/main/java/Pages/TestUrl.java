package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUrl {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jobin\\OneDrive\\Documents\\Jessin John\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		driver.close();
		driver.quit();
	}
	

}
