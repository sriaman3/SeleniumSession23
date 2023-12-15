package dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new EdgeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		driver.manage().window().maximize();
		
		By by = By.id("Form_getForm_Country");
		
		Thread.sleep(3000);
		
		List<String> li = getDropDownOptions(by);
		
		for(String str : li) {
			System.out.println(str);
		}
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static int getDropDownOptionCount(By locator) {
		Select sel = new Select(getElement(locator));
		return sel.getOptions().size();
	}
	
	public static void selectDropDownOption(By locator, String dropDownValue) {
		Select select = new Select(getElement(locator));

		List<WebElement> optionsList = select.getOptions();

		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(dropDownValue)) {
				e.click();
				break;
			}
		}
	}
	
	public static List<String> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsTextList = new ArrayList<String>();
		
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		
		return optionsTextList;
	}
	

}
