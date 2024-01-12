package com.stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class GoogleTest {

	WebDriver driver;
//	@Before("T1")
//	public void before() {
//		System.out.println("this is before test");
//	}

	
	
	@Given("open browser")
	public void open_browser() {
		driver = new ChromeDriver();
	}

	@When("open google page")
	public void open_google_page() {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	@Then("validates title of the page with expected value")
	public void validates_title_of_the_page_with_expected_value() {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	
}
