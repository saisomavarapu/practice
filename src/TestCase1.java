import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String x = driver.getTitle();
		System.out.println(x);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.get("http://www.youtube.com");
		driver.navigate().back();

	}

}
