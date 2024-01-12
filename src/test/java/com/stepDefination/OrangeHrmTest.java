package com.stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmTest {
	
	WebDriver driver;

	@Given("user should open URL")
	public void user_should_open_url() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}

	@When("users enter {string} and {string}")	
	public void users_enter_and(String string, String string2) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	

	@And("user should login")
	public void user_should_login() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	
	
	@When("user click on admin button")
	public void user_click_on_admin_button() {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		
	}

	@Then("user should get on admin page")
	public void user_should_get_on_admin_page() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		
	}

}
