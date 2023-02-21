package vasu2021;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;

public class Paralleltest {
	WebDriver wd;
	@Parameters("mybrowser")
  @Test
  public void OrengeHRM() throws InterruptedException {
	  wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(3000);
	  wd.findElement(By.name("username")).sendKeys("Admin");
	  wd.findElement(By.name("password")).sendKeys("admin123");
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.linkText("Logout")).click();
	  
	  
	  
 }
  
  @BeforeTest
  public void before(String mybrowser) {
	  if(mybrowser.equalsIgnoreCase("chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  wd= new ChromeDriver();
	  }
	  else if(mybrowser.equalsIgnoreCase("firefox"))
	  {WebDriverManager.firefoxdriver().setup();
	  wd= new FirefoxDriver();
		  
	  }
	 // else if(mybrowser.equalsIgnoreCase("safari"))
	 // {WebDriverManager.safaridriver().setup();
	 // wd= new SafariDriver();
		  
	  //}
  }

  @AfterTest
  public void after() {
  }

}
