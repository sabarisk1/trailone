package org.fourdaytask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TaskDayfour {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Taskfour\\chrome111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement animal = driver.findElement(By.id("animals"));
		Select sl = new Select(animal);
		List<WebElement> dropdown = sl.getOptions();
		for (WebElement wb : dropdown) {
			System.out.println(wb.getText());
			
		}
		
	
		
		
	}

}
