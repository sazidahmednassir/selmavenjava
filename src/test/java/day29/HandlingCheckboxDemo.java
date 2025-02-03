package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

//		driver.findElement(By.xpath("//input[@id='wednesday']")).click();

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

//		for (WebElement checkbox : checkboxes) {
//
//			checkbox.click();
//		}

		// select last 3 checkboxes

//		for (int i = 4; i < checkboxes.size(); i++) {
//			checkboxes.get(i).click();
//		}

		// select first 3 checkboxes

//		for (int i = 0; i < 3; i++) {
//			checkboxes.get(i).click();
//		}

		// unselect checkboxes what are selected
		for (WebElement checkbox : checkboxes) {

			checkbox.click();
		}

		Thread.sleep(5000);

		for (WebElement checkbox : checkboxes) {

			if (checkbox.isSelected()) {
				checkbox.click();
			}

		}

		driver.close();

	}

}
