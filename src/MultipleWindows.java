import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.findElement(By.partialLinkText("Create an account")).click();
		driver.findElement(By.linkText("Help")).click();
		System.out.println(driver.getTitle());
		Set<String> handles = driver.getWindowHandles();
		//Iterator<String> it = handles.iterator();
		//String parent = it.next();
		for(String handle:handles) {
		System.out.println(driver.switchTo().window(handle).getTitle());

	}}

}
