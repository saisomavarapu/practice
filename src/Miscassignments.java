import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miscassignments {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("checkBoxOption2")).click();
		String txt = driver.findElement(By.id("checkBoxOption2")).getAttribute("value").trim();
		System.out.println(txt);
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByValue(txt);
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(txt);  
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText().contains(txt));
		driver.switchTo().alert().accept();
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		List<WebElement> vals= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
		System.out.println(vals.size());
		for(WebElement val:vals) {
			if(val.getText().equalsIgnoreCase("india")) {
				val.click();
			}
		}
		
		
		

	}

}
