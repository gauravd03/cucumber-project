package com.stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Test1 {
	WebDriver driver;

	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

//	@When("user enters Username and password")
//	public void user_enters_username_and_password() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//
//	}
//	

@When("user enters {string} and {string}")
public void user_enters_and(String string, String string2) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2);

	}


	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user should success	fully get loged in")
	public void user_should_success_fully_get_loged_in() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

}
