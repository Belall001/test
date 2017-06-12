package JenkinsMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenTest {
	
	public WebDriver driver;
	
	
	@Test
	public void TestHello(){
		
		System.out.println("Hello world");
		
		System.out.println("Hello world2");
		
		/**System.setProperty("geckodriver.exe", "C:/Users/Automation/Desktop/Eclipse workspace/JenkinsDemo/lib/chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.mu");
		System.out.print(driver.getTitle());
		driver.close();
		**/
	}

}
