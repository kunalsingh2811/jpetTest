package jpetStoreckg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest {
	
	public static WebDriver driver;

	@Test
	public void setup()
	{
				
		driver = new FirefoxDriver();
		driver.get("http://10.1.23.186:9080/jpetstore/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[2]")).click();
		
		driver.findElement(By.name("username")).sendKeys("testuser");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/p[2]/input[2]")).clear();
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/p[2]/input[2]")).sendKeys("testuser");
		
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/input")).click();
		
		String text = driver.findElement(By.xpath(".//*[@id='MenuContent']/a[3]")).getText();
		
		Assert.assertEquals(text, "My Account");
		System.out.println("Login successful");
		driver.quit();


	}
	
}
