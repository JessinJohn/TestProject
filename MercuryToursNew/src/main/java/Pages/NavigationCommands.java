package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\jobin\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/selenium-webdriver-browser-commands/");
		driver.navigate().to("https://www.javatpoint.com/");
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
