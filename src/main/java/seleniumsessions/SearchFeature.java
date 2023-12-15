package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SearchFeature {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("Automation Testing");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		
		Thread.sleep(3000);
		
		System.out.println(list.get(1));
		
		
		for(WebElement e : list) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains("course")) {
				e.click();
				break;
			}
		}
	}

}
