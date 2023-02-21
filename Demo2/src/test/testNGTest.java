package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class testNGTest {
 WebDriver wd;

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	  wd =new ChromeDriver();
	  wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(3000);
	  
  }
  @Test(priority = 1)
  public void Login() {
	  wd.findElement(By.name("username")).sendKeys("Admin");
	  wd.findElement(By.name("password")).sendKeys("admin123");
	  wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
  }
  @Test(priority = 2)
  public void Homepage() throws InterruptedException {
	  wd.findElement(By.linkText("Admin")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.linkText("PIM")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.linkText("Logout")).click();  
  }	

  @AfterTest
  public void afterTest() {
	  wd.close();
  }

}
