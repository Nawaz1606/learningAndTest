package com.automationpractice.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class ActionsDemo extends TestBase {

	@Test
	public void keysToEnter() {
		
		driver.get("http://automationpractice.com/index.php?");
	WebElement e=  driver.findElement(By.id("search_query_top"));
	  
	 Actions action= new Actions(driver);
	 
	action.moveToElement(e).sendKeys(e, "invalid").sendKeys(Keys.ENTER).build().perform();
	
		
	}
}
