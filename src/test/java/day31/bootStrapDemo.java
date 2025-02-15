package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootStrapDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
	    List<WebElement> option=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	
	    for(WebElement op:option) {
	
	    	if(op.getText().equals("Python")||op.getText().equals("MySQL")) {
	    		
	    		op.click();
	    	}
	}
	    
	    driver.close();

}
}
