package vasu2021;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.Set;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Uplodingafile {
	WebDriver wd;
	public String URL1 = "https://demoqa.com/upload-download";
	public String URL2 = "https://demoqa.com/alerts";
	public String URL3 = "https://demoqa.com/browser-windows";
	
  
  @BeforeClass
  public void beforeClass() {
	 WebDriverManager.chromedriver().setup();
	 wd = new ChromeDriver();
  }
  @Test(enabled = false)
  public void uploading() {
	  wd.get(URL1);
	  wd.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\Vasun\\OneDrive\\Desktop\\screenshot1.png");
	  
	  
  }
  @Test(enabled = false)
  public void Alerts() throws InterruptedException {
	  wd.get(URL2);
	  wd.findElement(By.id("alertButton")).click();//clicking on alert button
	  Alert alt = wd.switchTo().alert();// switch to alert popup
	  System.out.println(alt.getText());
	  Thread.sleep(3000);
	  alt.accept();//accept for clicking ok or yes
	  Thread.sleep(3000);
	  wd.findElement(By.id("timerAlertButton")).click();// click on popup with timer
	 // wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
	  WebDriverWait wdw = new WebDriverWait(wd, 180);//explicit wait for 180 seconds
	  wdw.until(ExpectedConditions.alertIsPresent());// you are telling webdriver to accept or press ok only after popup appears.
	  alt.accept();//clicking ok
	  
	  
	  wd.findElement(By.id("confirmButton")).click();
	  Thread.sleep(2000);
	  alt.dismiss();
	  Thread.sleep(3000);
	  wd.findElement(By.id("promtButton")).click();
	  alt.sendKeys("Vasu");
	  alt.accept();
	  
	  
  }
  @Test(enabled = true)
	  public void Window() throws InterruptedException {
	  wd.get(URL3);
	  Thread.sleep(3000);
	  String parentwindow = wd.getWindowHandle();// this one gets window handle(id)or id of parent window
	  System.out.println(parentwindow);//print the same id
	  //wd.findElement(By.id("tabButton")).click();
	  WebElement we = wd.findElement(By.id("windowButton"));
	  for(int i=0; i<3 ; i++)// for clicking on the new window for 3 times 
	  {
		  we.click();
		  Thread.sleep(3000);
	  }
	  Set<String> allwindow = wd.getWindowHandles();
	  System.out.println(allwindow.size());//how many id are present
	 // System.out.println(allwindow);//getting all the id
	  String lastwindow ="";
	  
	  for(String hanndle: allwindow) {
		  wd.switchTo().window(hanndle);
		  wd.get("https://www.google.co.in/");
		  lastwindow = hanndle;
	  }
	  Thread.sleep(3000);
	  wd.switchTo().window(parentwindow);
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  wd.close();
	  wd.switchTo().window(lastwindow);
	  wd.get("https://mail.google.com/");
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
