package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatorpopupDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		Thread.sleep(5000);

		driver.close();

	}

}
