package Steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	public LoginPage lp;

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    lp=new LoginPage(driver);
	    
	    
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	}

	@And("user enters the {string} and {string}")
	public void user_enters_the_and(String username,String password) {
	    lp.setUsername(username);
	    lp.setPassword(password);
	}

	@And("Click on Sign in")
	public void click_on_sign_in() {
	    lp.clickLogin();
	}

	@Then("assert sign in button is disabled")
	public void assert_sign_in_button_is_disabled() {
	    lp.signinButtonDisable();
	}

	@And("assert that user can see {string}")
	public void assert_that_user_can_see_welcome(String result) {
	    Assert.assertEquals(result, lp.verifyLogin());
	    //Assert.assertTrue(driver.getPageSource().contains(result));
	}
	
	@And("close browser")
	public void close_browser() {
	    driver.close();
	}



}
