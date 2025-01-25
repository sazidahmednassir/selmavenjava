package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionMethodDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);
		
		boolean enable= driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(enable);
		
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selecting");

		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		boolean newsleeterstatus=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println(newsleeterstatus);
		driver.close();
	}

}
