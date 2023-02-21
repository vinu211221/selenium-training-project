package mavantestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTestng2 {
	WebDriver dr;

  @BeforeTest
  public void beforeTest() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	  dr= new ChromeDriver();
	  dr.navigate().to("https://rahulshettyacademy.com/practice-project");
	  WebElement wb=dr.findElement(By.linkText("More"));
	  Actions act=new Actions(dr);
	  Thread.sleep(3000);
	  act.moveToElement(wb).build().perform();
	  Robot rc=new Robot();
	  //rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
	  //rc.keyPress(MenuKeyEvent.VK_PAGE_UP);
	  Thread.sleep(2000);
	  WebElement link = dr.findElement((By.xpath("//*[@class='navbar-collapse collapse clearfix']/ul/li[2]")));
	  link.click();
	  Thread.sleep(2000);
	  rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
	  rc.keyPress(MenuKeyEvent.VK_ENTER);
	  rc.keyPress(MenuKeyEvent.VK_CONTROL);
	  rc.keyPress(MenuKeyEvent.VK_TAB);
	  Thread.sleep(2000);
	  
	  
	  
	  
	  
  }
  @Test
  public void f() {
  }

  @AfterTest
  public void afterTest() {
  }

}
