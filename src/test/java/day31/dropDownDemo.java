package day31;

import java.lang.classfile.ClassFile.Option;
import java.nio.channels.SelectableChannel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropCountryEle=driver.findElement(By.xpath("//select[@id='country']"));

		//1
		Select dropCountry=new Select(dropCountryEle);
		
		dropCountry.selectByVisibleText("Germany");
		
		dropCountry.selectByValue("japan");
		dropCountry.selectByIndex(4);
		
		//2
		List <WebElement> options=dropCountry.getOptions();
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		
		driver.close();
	}

}
