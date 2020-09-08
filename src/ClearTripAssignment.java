import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		Map<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		//1-Allow, 2-Block, 0-default
		options.setExperimentalOption("prefs",prefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		//driver.findElement(By.id("DepartDate")).click();
		//driver.findElement(By.className("closeit")).click();
		Select val = new Select(driver.findElement(By.id("Adults")));
		val.selectByValue("2");
		driver.findElement(By.cssSelector("i[class*='datePicker']")).click();
		driver.findElement(By.cssSelector("a[class*='ui-state-active']")).click();
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		//FromTag
		//

	}

}
