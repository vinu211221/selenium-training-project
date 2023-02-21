package vasu2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mavendemo {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		wb.navigate().to("https://www.amazon.in");
		
		   
			
		

	}

}