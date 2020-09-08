import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("divpaxinfo")).getAttribute("textValue");
		Thread.sleep(2000);
		for(int i=0;i<3;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println("test");}

	}

}
