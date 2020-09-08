import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement footerDriver1 = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		/*int a = footerDriver1.findElements(By.tagName("a")).size();
		for(int i=0;i<a;i++) {
			String command = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerDriver1.findElements(By.tagName("a")).get(i).sendKeys(command);
		}
		Set<String> now = driver.getWindowHandles();
		Iterator<String> it = now.iterator();
		while(it.hasNext()) {
			System.out.println(driver.switchTo().window(it.next()).getTitle());
		}*/
		
		//code to launch all the links in the footer
		List<WebElement> lnks = footerDriver.findElements(By.tagName("a"));
		for(WebElement lnk : lnks) {
			String command = Keys.chord(Keys.CONTROL,Keys.ENTER);
			lnk.sendKeys(command);
		}
		Set<String> now1 = driver.getWindowHandles();
		Iterator<String> it1 = now1.iterator();
		while(it1.hasNext()) {
			System.out.println(driver.switchTo().window(it1.next()).getTitle());
		}

	}

}
