package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/"); // org.openqa.selenium.InvalidArgumentException: invalid argument if we are opeing without http or https protocol
		
		driver.quit();
		
		System.out.println(driver.getTitle());
	}

	
	
	
}
