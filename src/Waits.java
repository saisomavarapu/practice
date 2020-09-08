import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] lst = { "Cucumber", "Beans", "Tomato", "Brinjal" };
		addItems(driver,lst);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
public static void addItems(WebDriver driver,String[] lst) {
List<WebElement> items = driver.findElements(By.xpath("//h4[@class='product-name']"));
List<String> alst = Arrays.asList(lst);
String[] nameOfTheProduct = {};
String nameOfTheProduct1;
for (int item = 0, j = 0; item < items.size(); item++) {

	nameOfTheProduct = items.get(item).getText().split("-");
	nameOfTheProduct1 = nameOfTheProduct[0].trim();
	if (alst.contains(nameOfTheProduct1)) {
		j++;
		driver.findElements(By.xpath("//a[@class='increment']")).get(item).click();
		driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(item).click();
		if (j == alst.size()) {
			break;
		}
	}
}

}}

	

