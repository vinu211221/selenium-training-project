package vasu2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
			WebDriver wd = new ChromeDriver();
			wd.navigate().to("https://opensource-demo.orangehrmlive.com/");
			wd.manage().window().maximize();
			Thread.sleep(3000);
			//String Actual_Title = wd.getTitle();
			//System.out.println(Actual_Title);
			//String Expected_Title = "OrangeHRM1";
			//Assert.assertEquals(Actual_Title, Expected_Title);
			WebElement wb = wd.findElement(By.xpath("//*[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
			Assert.assertEquals(true, wb.isDisplayed());
			System.out.println("Assertion Passed");
			
			
			
			
			
		

	
	
	}
}
