import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22711/rsaixi-vs-eng-2-day-practice-match-england-tour-of-south-africa-2019-20");
		WebElement table = driver.findElement(By.xpath("//div[@id='innings_1']/div[1]"));
		List<WebElement> cell = table.findElements(By.cssSelector("div[class*='cb-scrd-itms'] div:nth-child(3)"));
		
		for(WebElement c:cell) {
			System.out.println(c.getText());
		}
		
		
	}

}
