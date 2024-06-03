package selenium3.c_Wait_ImplicitExplicitFluent_ThreadSleep;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Explicit_WebDriverWait_ExpectedCondition_a1_Test_CO {
		private WebDriver driver;
		
		@Test
	    public void explicitWait1() {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Family\\Desktop\\Rakesh\\Resource\\chromedriver.exe");
			//driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Family\\Desktop\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(chromeOptions);

			driver.get("https://google.com");
	            WebDriverWait wait = new WebDriverWait(driver,3);
	    		wait.until(ExpectedConditions.urlContains("google"));   		
	        String url = driver.getTitle();
	        System.out.println("url :" +url);
	        driver.quit();
	    	}
	    }