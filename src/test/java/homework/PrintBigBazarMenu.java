package homework;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PrintBigBazarMenu {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// (//ul[contains(@class, 'jsx-')])[1]//a
		// (//*[contains(@class, 'jsx-')])[1]//a

		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//button[contains(@id, 'headlessui-menu-button-')])[4]")).click();

		List<WebElement> menuFirstCol = driver.findElements(By.xpath("(//ul[contains(@class, 'jsx-')])[4]/li/a"));

		System.out.println(menuFirstCol.size());

		Thread.sleep(5000);

		

		for (WebElement ele : menuFirstCol) {
			System.out.println(ele.getText());
		}
	}

}
