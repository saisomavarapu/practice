import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		WebElement x = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		x.click();
		Assert.assertFalse(x.isSelected());
		List<WebElement> y = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		System.out.println(y.size());
		int i = 0;
		for (WebElement val:y) {
			if (i!=0) {
			val.click();
			}
			i++;
		}

	}

}
