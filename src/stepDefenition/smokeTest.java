package stepDefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {
	WebDriver driver;
	
	@Given("^Open chrome and access website$")
	public void Open_chrome_and_access_website() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/Users/niwinpriskilanapitupulu/Desktop/chromedriver-mac-x64/chromedriver");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/");
	}

	@When("^Click button login$")
	public void Click_button_login() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	}

	@When("^Fill field valid Email Address and Password$")
	public void Fill_field_valid_Email_Address_and_Password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("test");
		
	}

	@When("^click button Login$")
	public void click_button_Login() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	}

	@Then("^Success access homepage$")
	public void Success_access_homepage() throws Throwable {

	}

}
