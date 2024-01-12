package com.stepDefination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TableData {
	WebDriver driver = new ChromeDriver();
	@Given("To Should be on {string} page")
	public void to_should_be_on_page(String string) {
		driver.get(string);

	}

//@When("User Should enters userName and PassWord")
//public void user_should_enters_user_name_and_pass_word() throws InterruptedException {
//   // Write code here that turns the phrase above into concrete actions

//}

	@When("^User Should enters userName and passWord$")

	public void User_Should_enters_userName_and_passWord_and(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<List<String>> cr = dataTable.cells();
		int rows = dataTable.height();
		int col = dataTable.width();

		for (int i = 0; i < rows; i++) {
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			// System.out.println(cr.get(i).get(0)+" "+cr.get(i).get(1));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.name("username")).sendKeys(cr.get(i).get(0));
			driver.findElement(By.name("password")).sendKeys(cr.get(i).get(1));
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			// driver.quit();
		}

	}

	@Then("Validate Homepage")

	public void validate_homepage() {
		// Write code here that turns the phrase above into concrete actions
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(url, driver.getCurrentUrl());
		// driver.quit();

	}

}
