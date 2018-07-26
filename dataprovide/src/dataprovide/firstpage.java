package dataprovide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class firstpage {
	WebDriver driver;
	@Test(dataProvider="getrediffdata")
	public void initialize() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
	 driver = new ChromeDriver(); 
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	
		
		driver.findElement(By.id("login1")).sendKeys("ghghghghghg");
		driver.findElement(By.id("password")).sendKeys("23232");
		
		//driver.findElement(By.xpath("//div[@class='create-new-account f15 alignC bold']")).click();
		driver.close();
	}
	
	@DataProvider
	public void getrediffdata() {
		
	}

}