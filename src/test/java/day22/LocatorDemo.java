package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();// for maximize the window screen
		
//
//		driver.findElement(By.name("search")).sendKeys("Mac");
//		Boolean logoDisplayedStatus=driver.findElement(By.id("logo")).isDisplayed();
//
//		System.out.println(logoDisplayedStatus);
		
//		driver.findElement(By.linkText("Software")).click();
//		driver.findElement(By.partialLinkText("Came")).click();
		
		List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		System.out.println(headerLinks.size());
		
		List<WebElement>links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement> images =driver.findElements(By.tagName("img"));
		System.out.println("Total image of "+images.size());
	}

	}
