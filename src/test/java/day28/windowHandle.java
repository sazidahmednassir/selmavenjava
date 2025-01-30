package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowHandle {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        
		
		driver.manage().window().maximize();
		
		

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'OrangeHRM')]")));
        link.click();
		
		Set<String> windowID=driver.getWindowHandles();
		
		//Approach1
		
//		List<String> windowList=new ArrayList(windowID);
//		String parentID=windowList.get(0);
//		String childID=windowList.get(1);
//		
//		driver.switchTo().window(childID);
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(parentID);
//		System.out.println(driver.getTitle());
		
		//Approach2
		
		for(String winId:windowID) {
			
			String title=driver.switchTo().window(winId).getTitle();
			
			if(title.equals("OrangeHRM")) {
				
				driver.close();
			}
			
			
		}

		System.out.println(driver.getTitle());
		driver.close();
	}

}
