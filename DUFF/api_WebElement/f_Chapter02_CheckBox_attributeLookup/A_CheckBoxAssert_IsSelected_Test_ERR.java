package api_WebElement.f_Chapter02_CheckBox_attributeLookup;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;

// //ERR 'is' requires a library import, but not sure which to pick (is)
public class A_CheckBoxAssert_IsSelected_Test_ERR {
	//ERR 'is' requires a library import, but not sure which to pick (Observe: original import was JUNIT4 i.e. import org.junit.Test;)
	@Test
	public void checkboxOption2Test() {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Family\\Desktop\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exee");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox = driver.findElement(By.cssSelector("form input:nth-of-type(2)"));
		//assertThat(checkbox.isSelected(), is(true));
		assertThat(checkbox.isSelected(), is(true));
		driver.quit();
	}
	} 