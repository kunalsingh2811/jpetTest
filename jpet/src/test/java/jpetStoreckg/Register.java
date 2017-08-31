package jpetStoreckg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Register {
	
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
		driver.findElement(By.xpath(".//*[@id='Catalog']/a")).click();
		
		driver.findElement(By.name("username")).sendKeys("testUser1");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/table[1]/tbody/tr[2]/td[2]/input")).sendKeys("testUser1");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/table[1]/tbody/tr[3]/td[2]/input")).sendKeys("testUser1");
		
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/table[2]/tbody/tr[1]/td[2]/input")).sendKeys("test");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/table[2]/tbody/tr[2]/td[2]/input")).sendKeys("User1");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/table[2]/tbody/tr[3]/td[2]/input")).sendKeys("testUser1@gmail.com");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/table[2]/tbody/tr[4]/td[2]/input")).sendKeys("1234567890");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/table[2]/tbody/tr[5]/td[2]/input")).sendKeys("address1");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/table[2]/tbody/tr[6]/td[2]/input")).sendKeys("address2");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/table[2]/tbody/tr[7]/td[2]/input")).sendKeys("city1");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/table[2]/tbody/tr[8]/td[2]/input")).sendKeys("state1");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/table[2]/tbody/tr[9]/td[2]/input")).sendKeys("zip1");
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/table[2]/tbody/tr[10]/td[2]/input")).sendKeys("country1");
		
		driver.findElement(By.xpath(".//*[@id='Catalog']/form/input")).click();
		
		
	

	}

}
