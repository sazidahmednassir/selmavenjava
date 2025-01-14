package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Iphone");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Samsung");
//		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Samsung");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Samsung");
		driver.quit();

	}

}
