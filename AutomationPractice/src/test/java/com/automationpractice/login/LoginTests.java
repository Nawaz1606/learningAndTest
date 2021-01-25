package com.automationpractice.login;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.tests.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests extends TestBase{
	
	
	
	@Test
	public void Login_with_invalid_userid() {
		
		
		
//		    Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		driver.findElement(By.className("login")).click();
//			Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
		driver.findElement(By.id("email")).sendKeys("myunknowxaad@mailinator.com");
//			Click Sign in button
		WebElement e = driver.findElement(By.id("SubmitLogin"));
		Actions actions = new Actions(driver);
		actions.moveToElement(e).click().build().perform();
		//	Verify error message displayed 'There is 1 error'
		String createAccount =driver.findElement(By.className("page-subheading")).getText();
		Assert.assertEquals(createAccount, "CREATE AN ACCOUNT");
		System.out.println(createAccount);
//			Verify error message displayed 'Password is required.'
		String pwd=driver.findElement(By.xpath("//li[contains(text(),'Password is required.')]")).getText();
		Assert.assertEquals(pwd, "Password is required.");
		System.out.println(pwd);
	}
	
	@Test
	public void Login_with_valid_userid_but_invalid_password() {
		
		
		
//		Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		driver.findElement(By.className("login")).click();
//			Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		driver.findElement(By.id("email")).sendKeys("abc213@mailinator.com");
		//	Enter invalid password 'myinvalidpwd' in password text field
		driver.findElement(By.id("passwd")).sendKeys("myinvalidpwd");
//			Click 'Sign in' button
		
		
		WebElement e=driver.findElement(By.xpath("//p[@class='submit']//span[1]"));
		
//		WebDriverWait wait= new WebDriverWait(driver,45);
//  		wait.until(ExpectedConditions.elementToBeClickable(e));
//		
//		
//      		e.click();
		
	    Actions actions= new Actions(driver);
		actions.moveToElement(e).click().build().perform();
		
//		JavascriptExecutor jse= (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0]. click();", e);
		
		
//			Verify error message displayed 'There is 1 error'
		String authentication=driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]")).getText();
		Assert.assertEquals(authentication, "There is 1 error");
		//Verify error message displayed 'Authentication failed.'
		String authentication1=driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText();
		Assert.assertEquals(authentication1, "Authentication failed.");
		System.out.println(authentication1);
		
//		
	}
	
	@Test
	public void Login_with_valid_userid_and_password() {
		
		
		
//		Go to http://www.automationpractice.com
		driver.get("http://www.automationpractice.com");
//			Click Sign in button from top right corner of the page
		driver.findElement(By.className("login")).click();
//			Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		driver.findElement(By.id("email")).sendKeys("abc213@mailinator.com");
//			Enter valid password 'abc1234' in password text field
		driver.findElement(By.id("passwd")).sendKeys("abc1234");
//			Click 'Sign in' button
		WebElement e=driver.findElement(By.xpath("//p[@class='submit']//span[1]"));
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0]. click();", e);
		
//			Verify 'MY ACCOUNT' text displayed
		String myAccount=driver.findElement(By.className("page-heading")).getText();
		Assert.assertEquals(myAccount, "MY ACCOUNT");
		System.out.println(myAccount);
//	       Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
		String welcome=driver.findElement(By.className("info-account")).getText();
		Assert.assertEquals(welcome, "Welcome to your account. Here you can manage all of your personal information and orders.");
		System.out.println(welcome);
//			Verify 'My personal information' text displayed
		String personalInfo=driver.findElement(By.xpath("//span[contains(text(),'My personal information')]")).getText();
		Assert.assertEquals(personalInfo, "MY PERSONAL INFORMATION");
		System.out.println(personalInfo);
//			Click 'Sign out' button from top right corner
		driver.findElement(By.className("logout")).click();
		
	}
	


}
