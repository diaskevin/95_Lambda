package api_WebElement.f_Chapter02_CheckBox_attributeLookup;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class B1_CheckBoxesLoop_Test {
	@Test
	public void checkboxDiscovery_Test() {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Family\\Desktop\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

		System.out.println("With .attribute('checked')");
		for (WebElement checkbox : checkboxes) {
			System.out.println(String.valueOf(checkbox.getAttribute("checked")));
		}

		System.out.println("\nWith .selected?");
		for (WebElement checkbox : checkboxes) {
			System.out.println(checkbox.isSelected());
		}
		driver.quit();
	}
}
