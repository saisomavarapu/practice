import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppingcart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> items = driver.findElements(By.xpath("//h4[@class='product-name']"));
		String[] lst = { "Cucumber", "Beans", "Tomato", "Brinjal" };
		List<String> alst = Arrays.asList(lst);
		String[] nameOfTheProduct = {};
		String nameOfTheProduct1;
		for (int item = 0, j = 0; item < items.size(); item++) {

			nameOfTheProduct = items.get(item).getText().split("-");
			nameOfTheProduct1 = nameOfTheProduct[0].trim();
			if (alst.contains(nameOfTheProduct1)) {
				j++;
				driver.findElements(By.xpath("//a[@class='increment']")).get(item).click();
				Thread.sleep(1000);
				driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(item).click();
				
				Thread.sleep(1000);
				if (j == alst.size()) {
					break;
				}
			}
		}

	}

}
