package com.automationpractice.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

public class ProfileTest extends TestBase{
	
	
	@Test
	public void Update_name_in_User_Profile() {
		
//		    Go to http://www.automationpractice.com
		
		driver.get("http://www.automationpractice.com");
		
//			Click Sign in button from top right corner of the page
		
		driver.findElement(By.className("login")).click();
		
//			Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		
		driver.findElement(By.id("email")).sendKeys("abc213@mailinator.com");
		
//			Enter valid password 'abc1234' in password text field
		
		driver.findElement(By.id("passwd")).sendKeys("abc1234");
		
//			Click 'Sign in' button
		
		WebElement e =driver.findElement(By.id("SubmitLogin"));
		
		Actions action = new Actions(driver);
		action.moveToElement(e).click().build().perform();
		
//			Click on name 'Misir Ali' from top right corner
		
		driver.findElement(By.xpath("//span[contains(text(),'Misir Ali')]")).click();
		
//			Click on button 'MY PERSONAL INFORMATION'
		
		driver.findElement(By.xpath("//span[contains(text(),'My personal information')]")).click();
		
//			Verify text displayed 'Please be sure to update your personal information if it has changed.'
		
		String msg1= driver.findElement(By.className("info-title")).getText();
		Assert.assertEquals(msg1, "Please be sure to update your personal information if it has changed.");
		
//			Enter new first name as 'Hanif'
		
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys("Hanif");
		
//			Enter new last name as 'Shanket'
		
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys("Shanket");
		
//			Click 'Save' button
		
		driver.findElement(By.name("submitIdentity")).click();
		
//			Verify error message displayed 'There is 1 error'
		
		String err_msg_1= driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]")).getText();
		Assert.assertEquals(err_msg_1, "There is 1 error");
		
//			Verify error message displayed 'The password you entered is incorrect'
		
		String err_msg_2= driver.findElement(By.xpath("//li[contains(text(),'The password you entered is incorrect.')]")).getText();
		System.out.println(err_msg_2);
		Assert.assertEquals(err_msg_2, "The password you entered is incorrect.");
		
//			Enter current password 'abc1234' in password text field
		
		driver.findElement(By.id("old_passwd")).sendKeys("abc1234");
//			Click 'Save' button
		
		driver.findElement(By.name("submitIdentity")).click();
		
//			Verify success message displayed 'Your personal information has been successfully updated.'
		
		String update_msg= driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
		System.out.println(update_msg);
		Assert.assertEquals(update_msg, "Your personal information has been successfully updated.");
		
//			Click on name 'Hanif Shanket' from top right corner
		
		driver.findElement(By.xpath("//span[contains(text(),'Hanif Shanket')]")).click();
		
		
//			Click on button 'MY PERSONAL INFORMATION'
		
		driver.findElement(By.xpath("//span[contains(text(),'My personal information')]")).click();
		
//			Verify text displayed 'Please be sure to update your personal information if it has changed.'
		
		String per_info_msg= driver.findElement(By.xpath("//p[@class='info-title']")).getText();
		System.out.println(per_info_msg);
		Assert.assertEquals(per_info_msg, "Please be sure to update your personal information if it has changed.");
		
//			Enter first name back as 'Misir'
		try {
			driver.findElement(By.className("info-title")).clear();
			driver.findElement(By.className("info-title")).sendKeys("Misir");
		} catch (Exception e2) {
			e2.getMessage();
		}
		
		
		
//			Enter last name back as 'Ali'
		
		driver.findElement(By.className("columns-container")).clear();
		driver.findElement(By.className("columns-container")).sendKeys("Ali");
		
//			Click 'Save' button
		
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		
//			Enter current password 'abc1234' in password text field
		
		driver.findElement(By.id("identity")).sendKeys("abc1234");
		
//			Click 'Save' button
		
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		
	
//			Verify success message displayed 'Your personal information has been successfully updated.'
		
		String update_msg2= driver.findElement(By.className("alert alert-success")).getText();
		System.out.println(update_msg2);
		Assert.assertEquals(update_msg2, "Your personal information has been successfully updated.");
		
	}

}
