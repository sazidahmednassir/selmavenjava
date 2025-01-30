package day27;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://computermania.com.bd/product-category/razer-laptop-price-in-bd/");
		
		URL myUrl=new URL("https://www.youtube.com/results?search_query=razer+laptop");
		driver.navigate().to(myUrl);

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		driver.quit();
	}

}
