package jpetStoreckg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cartPage {
	
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
		driver.findElement(By.xpath(".//*[@id='MenuContent']/a[1]/img")).click();
		String text = driver.findElement(By.xpath(".//*[@id='Cart']/h2")).getText();
		Assert.assertEquals(text, "Shopping Cart");
		System.out.println("Cart Page loaded successfully");
				
		driver.quit();
		
		
		
		/*driver.findElement(By.xpath(".//*[@id='SidebarContent']/a[1]/img")).click();
		driver.findElement(By.xpath(".//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath(".//*[@id='Cart']/a")).click();*/
		
		
		
		
		
	}
	

}
