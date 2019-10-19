package multiplescenarioSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MultipeScenario {
	
	WebDriver driver;
	
	@Given("User need to be on Facebook login page")
	public void User_need_to_be_on_Facebook_login_page() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","D:\\CucumberSetep\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get("https//www.facebook.com/");
		Thread.sleep(1000);
	}
	
	@When("User enters user first name ")
	public void User_enters_user_first_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='u_0_1']")).sendKeys("David");
		Thread.sleep(1000);
	} 

	
	@Then("User checks user first name is present")
	public void User_checks_user_first_name_is_present() throws InterruptedException {
	String userNameActual =driver.findElement(By.xpath("//input[@id='u_0_1']")).getAttribute("value");
	Assert.assertEquals("David", userNameActual);
	Thread.sleep(1000);
	}
	@And("User enters user surname")
	public void User_enters_surname() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys("Rogers");	
		Thread.sleep(1000);
	}
	@But("User mobile field shoulde be blank")
	public void User_mobile_field_shoulde_be_blank() throws InterruptedException {
		String mobileActual =driver.findElement(By.xpath("//input[@id='u_0_q']")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
	Thread.sleep(1000);
	}
	
	
	@Then("close browser")
	public void close_browser() {
		driver.quit();
		driver.close();
	}
}
