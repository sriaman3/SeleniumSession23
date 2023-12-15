package homework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ShadowDomConcept {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new EdgeDriver();
		
		driver.get("https://books-pwakit.appspot.com/");
		
		String input = "return document.querySelector('body > book-app').shadowRoot.querySelector('#input')";
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement ele =(WebElement) jse.executeScript(input);
		ele.sendKeys("Java Black Book");
		
		
	}

}
