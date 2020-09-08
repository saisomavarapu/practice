import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Sai\\Desktop\\Selenium\\Browser Driver\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get("http://www.google.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}
}

