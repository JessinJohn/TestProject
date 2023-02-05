package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\jobin\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/selenium-webdriver-browser-commands/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);

	}

}
