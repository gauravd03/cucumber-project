package com.stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ScenarioOutline {

	WebDriver driver;

	@Given("user is on Loginpage")
	public void user_is_on_loginpage() {
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@When("^userss enters (.*) and (.*)$")
	public void userss_enters_admin_and_admin123(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("click the login button")
	public void click_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("user should on Homepage")
	public void user_should_on_homepage() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

	}

}