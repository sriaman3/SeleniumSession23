package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TopCasting {

	public static void main(String[] args) {
		
		//1. Valid + recommended + but not useful for cross brwoser
		//ChromeDriver driver = new ChromeDriver();
		
		//2. Valid + recommended
		//WebDriver driver = new ChromeDriver();
		
		//3. valid + not recommended
		//SearchContext driver = new ChromeDriver();
		
		//4. Valid + recommended + useful when we want to run our code on VM or grid
		
		//WebDriver driver = new RemoteWebDriver(null, null);
		
		//5. Valid + recommended 
		//RemoteWebDriver driver = new ChromeDriver();
		
		//6. Valid + not recommended + through ChromiumDriver, we can open only chrome & Edge driver
		//ChromiumDriver driver = new ChromeDriver();
		
		
	}

}
