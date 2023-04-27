package org.fourdaytask;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Samplewa {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				               "C:\\Users\\ELCOT\\eclipse-workspace\\Taskfour\\chrome111\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		WebElement elc = driver.findElement(By.xpath("//span[@title='Markets']"));
		Actions bulider =new Actions(driver);
		bulider.moveToElement(elc).perform();
	  driver.findElement(By.xpath("//span[@title='F&O']")).click();
	  
		
		
		
		
		
		
	}

}
