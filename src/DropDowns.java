import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("divpaxinfo")).getText();
		Thread.sleep(2000);
		for(int i=0;i<3;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println("test");}
		driver.findElement(By.id("divpaxinfo")).getText();
		//driver.findElement(By.id("hrefDecChd")).click();
		//driver.findElement(By.id("hrefIncInf")).click();
		
		//WebElement x = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//Select s = new Select(x);
		//s.selectByValue("AED");
		//s.selectByIndex(0);
		//System.out.println(s.getFirstSelectedOption());
	}

}
