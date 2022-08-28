import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TideSIgnUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://tide.com/en-us");
		driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/en-us/sign-in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.pggoodeveryday.com/signup/tide-coupons/']")).click();
		Thread.sleep(3000);
		  String parentWindowHandle = driver.getWindowHandle();
		    
		    Thread.sleep(3000);
		    for (String childWindowtab:driver.getWindowHandles())
		    {
		    driver.switchTo().window(childWindowtab);
		    }
		driver.findElement(By.xpath("//input[@name='firstName']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("kamalnath");
		driver.findElement(By.xpath("//input[@name='emailAddress']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("p.kamalnath123@gmail.com");
		driver.findElement(By.xpath("//input[@name='newPassword']")).click();
		driver.findElement(By.xpath("//input[@name='newPassword']")).sendKeys("Kamal@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='active  submitBtn btn btn-primaryReceipt']")).click();
		

	}

}
