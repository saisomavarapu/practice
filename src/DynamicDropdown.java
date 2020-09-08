import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		Thread.sleep(4000);
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> vals = driver.findElements(By.cssSelector("li.ui-menu-item a"));
		System.out.println(vals.size());
		Thread.sleep(2000);
		for(WebElement option :vals) {

		if(option.getText().equalsIgnoreCase("India"))

		{

		option.click();

		break;

		}

		}
		/*for (WebElement val:vals) {
			if(val.getText().equalsIgnoreCase("India")) {
				val.click();
				break;
			}
			System.out.println("test");
			
		}*/
		
		
	}

}
