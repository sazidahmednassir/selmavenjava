package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ui.vision/demo/webtest/frames/");

		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

		driver.switchTo().frame(frame1);

		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("nassir");

		driver.switchTo().defaultContent();

		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));

		driver.switchTo().frame(frame2);

		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("welcome");

		driver.switchTo().defaultContent();

		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));

		driver.switchTo().frame(frame3);

		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("ahmed");

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//span[normalize-space()='Hi, I am the UI.Vision IDE']")).click();

		driver.switchTo().defaultContent();

		driver.close();

	}

}
