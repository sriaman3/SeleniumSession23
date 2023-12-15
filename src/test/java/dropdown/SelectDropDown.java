package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();

		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		driver.manage().window().maximize();

		By by = By.id("Form_getForm_Country");

		Thread.sleep(3000);

		doSelectDropdownByIndex(by, 6);

		doSelectDropdownByValue(by,"Algeria");

		doSelectDropdownByVisibleText(by, "Angola");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropdownByIndex(By locator, int index) {

		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);
	}

	public static void doSelectDropdownByValue(By locator, String value) {

		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	}

	public static void doSelectDropdownByVisibleText(By locator, String text) {

		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(text);
	}

}
