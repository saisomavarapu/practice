import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.jqueryui.com/droppable");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions act = new Actions(driver);
		/*act.moveToElement(driver.findElement(By.xpath("//div[@id = 'draggable']/p"))).clickAndHold()
				.moveToElement(driver.findElement(By.xpath("//div[@id = 'droppable']/p"))).release().build().perform();*/
		act.dragAndDrop(driver.findElement(By.xpath("//div[@id = 'draggable']/p")), driver.findElement(By.xpath("//div[@id = 'droppable']/p"))).perform();
		driver.switchTo().defaultContent();

	}

}
