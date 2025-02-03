package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

//		Alert myalert = driver.switchTo().alert();
//
//		System.out.println(myalert.getText());
//		myalert.accept();

//		WebElement confirmAlertbtn = wait.until(ExpectedConditions
//				.elementToBeClickable(By.xpath("//button[normalize-space()='Click for JS Confirm']")));
//		confirmAlertbtn.click();
//		Alert myalert2 = driver.switchTo().alert();
//
//		myalert2.dismiss();

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert myalert3 = driver.switchTo().alert();

		myalert3.sendKeys("Welcome");

		myalert3.accept();

		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		driver.close();

	}

}
