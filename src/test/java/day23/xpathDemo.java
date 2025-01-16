package day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		

		
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Mobile");
//		
//		driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("&");
//		driver.findElement(By.xpath("//input[@placeholder='Search'and @name='search']")).sendKeys("car");
		driver.findElement(By.xpath("//input[@placeholder='sarch'or @name='search']")).sendKeys("car");

//		driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		boolean displayStatus= driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(displayStatus);
		
		String value= driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(value);
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("nassir");

		//div[@id='logo']/a/img -- chained xpath
		
		driver.quit();

	}

}
