package day25;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethodemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids);
		Thread.sleep(10000);
		driver.quit();

	}

}
