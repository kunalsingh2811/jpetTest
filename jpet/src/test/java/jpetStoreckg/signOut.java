package jpetStoreckg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class signOut {
	
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
		
		driver.findElement(By.name("username")).sendKeys("testUser1");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/p[2]/input[2]")).clear();
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/p[2]/input[2]")).sendKeys("testUser1");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/input")).click();
		
		String text = driver.findElement(By.xpath(".//*[@id='MenuContent']/a[3]")).getText();
		
		Assert.assertEquals(text, "My Account");
		System.out.println("Login successful");
		
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[2]")).click();
		String text1 = driver.findElement(By.xpath(".//*[@id='MenuContent']/a[2]")).getText();
		
		Assert.assertEquals(text1, "Sign In");
		System.out.println("Signout successful");
				
		driver.quit();

	}

}