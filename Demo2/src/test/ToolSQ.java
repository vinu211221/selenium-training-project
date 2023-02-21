package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolSQ {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://demoqa.com/");
		Thread.sleep(3000);
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		WebElement oc=wd.findElement(By.xpath("//*[@class='card mt-4 top-card'][1]"));
		Actions act = new Actions(wd);
		act.click(oc).build().perform();
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		WebElement ad=wd.findElement(By.xpath("//*[@class='element-group'][5]"));
		act.click(ad).build().perform();
		Thread.sleep(2000);
		WebElement dr=wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[4]"));
		act.click(dr).build().perform();
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_PAGE_UP);
		rc.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		//WebElement a=wd.findElement(By.xpath("//*[@class=\'drag-box mt-4 ui-draggable ui-draggable-handle\']"));
		//WebElement b=wd.findElement(By.xpath("//*[@class=\'drop-box ui-droppable\']"));
		WebElement a=wd.findElement(By.id("draggable"));
		WebElement b=wd.findElement(By.id("droppable"));
		act.dragAndDrop(a, b).build().perform();
		Thread.sleep(5000);
		wd.close();
		
	
		
		
		
		
		
		
		
		

	}

}
