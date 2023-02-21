package test;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementtextbox {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://demoqa.com/text-box");
		wd.findElement(By.id("userName")).sendKeys("Vasundhara");
		wd.findElement(By.id("userEmail")).sendKeys("vasundhararaj02@gmail.com");
		wd.findElement(By.id("currentAddress")).sendKeys("Mumbai");
		wd.findElement(By.id("permanentAddress")).sendKeys("Mumbai");
		Thread.sleep(2000);
		//wd.findElement(By.xpath("//*[@class='text-right col-md-2 col-sm-12']/div")).click();
		wd.findElement(By.id("submit")).click();
		
		
		
		
		

	}

}
