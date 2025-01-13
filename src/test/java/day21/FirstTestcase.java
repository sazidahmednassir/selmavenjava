package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestcase {

	public static void main(String[] args) {
		
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		String homeTitle= driver.getTitle();
		
		if(homeTitle.equals("Your Store")) {
			System.out.println("TestCase Passed");
		}
		else {
			System.out.println("Testcase Failed");
		}
		
		driver.close();

	}

}
