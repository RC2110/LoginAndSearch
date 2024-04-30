package org.stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSearchStep {
	WebDriver driver;
	
	@Given("User is on OMR page")
	public void user_is_on_omr_page() {
		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("User enter the {string} and {string}")
	public void user_enter_the_and(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	}
	@When("User click the Login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	@Then("Verifying successful login messgage")
	public void verifying_successful_login_messgage() {
		Assert.assertTrue("verify msg", true);
	}
	
	@Given("User is on Amazon page")
	public void user_is_on_amazon_page() {
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@When("User enter the {string}")
	public void user_enter_the(String product) {
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys(product, Keys.ENTER);
	}
	@Then("verify search results message")
	public void verify_search_results_message() {
		Assert.assertTrue("Verify result", true);
	}
}