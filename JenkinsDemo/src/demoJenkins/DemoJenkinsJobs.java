package demoJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class DemoJenkinsJobs {

	public WebDriver driver;
	
	
	@Test
	public void testJenkins(){
		
		System.out.println("test");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Automation/Desktop/Eclipse workspace/JenkinsDemo/lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.mu");
		System.out.print(driver.getTitle());
		driver.close();
		
	}
	
}
