package com.amazon.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Story books");
		
		driver.findElement(By.xpath("")).click();
		
		//driver.findElement(By.xpath("//span[@role='button']")).click();
		
	
//	   WebElement mainMenu = driver.findElement(By.xpath("//span[text()='Electronics']"));
//		
//
//		//Instantiating Actions class //action used for handling keybord and mouse element
//		Actions actions = new Actions(driver);
//
//		//Hovering on main menu
//		actions.moveToElement(mainMenu);
//
//		// Locating the element from Sub Menu
//		WebElement subMenu = driver.findElement(By.xpath("//a[text()='Audio']"));
//
//		//To mouseover on sub menu
//		actions.moveToElement(subMenu);
//
//		//build()- used to compile all the actions into a single step 
//		actions.click().build().perform();
		
	
		
//		____________________________________________________________
		
//		WebElement mainMenu = driver.findElement(By.xpath("//span[text()='Sign in']"));
//		
//
//		//Instantiating Actions class
//		Actions actions = new Actions(driver);
//
//		//Hovering on main menu
//		actions.moveToElement(mainMenu);
//
//		// Locating the element from Sub Menu
//		WebElement subMenu = driver.findElement(By.xpath("//li[text()='Orders']"));
//
//		//To mouseover on sub menu
//		actions.moveToElement(subMenu);
//
//		//build()- used to compile all the actions into a single step 
//		actions.click().build().perform();
//		
//----------------------------------------------------------------------------------------		
//	//drop down
//		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
//		
//		dropdown.selectByVisibleText("Books");
//		
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		
		
	
		
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.close();
		
	}

}
