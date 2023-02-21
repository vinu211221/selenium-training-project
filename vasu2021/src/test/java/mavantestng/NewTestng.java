package mavantestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTestng {
	WebDriver dr;
	public String URL1 = "https://www.google.com/";
	public String URL2 = "https://www.amazon.in/";
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	  dr=new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.get(URL1);
  }
  @Test
  public void Action() throws AWTException, InterruptedException {
	  WebElement Link = dr.findElement(By.xpath("//*[contains(text(),'Gmail')]"));
	  Thread.sleep(3000);
	  Actions act = new Actions(dr);
	  act.contextClick(Link).build().perform();
	  
	  Robot rb = new Robot();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(3000);
	  rb.keyPress(MenuKeyEvent.VK_CONTROL);
	  rb.keyPress(MenuKeyEvent.VK_TAB);
	  
	 
	  	  
  }

  @AfterTest
  public void afterTest() {
	  //dr.close();
  }

}
