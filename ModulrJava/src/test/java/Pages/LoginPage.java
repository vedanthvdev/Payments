package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id= "username-inp")
	WebElement txtUsername;
    
	@FindBy(id = "password-inp")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id = "signInSubmitButton")
	@CacheLookup
	WebElement BtnSubmit;
	
	@FindBy(xpath = "/html/body/app-root/ng-component/div/div[2]/div[2]/div[2]/app-account/div/section[1]/div[1]/p")
	@CacheLookup
	WebElement txtAccount;
	
	public void setUsername(String uname) {
		txtUsername.clear();
		txtUsername.sendKeys(uname);
	}
	
	public void setPassword(String pass) {
		txtPassword.clear();
		txtPassword.sendKeys(pass);
	}
	
	public void clickLogin() {
		BtnSubmit.click();
	}
	
	public void signinButtonDisable() {
		Assert.assertFalse(BtnSubmit.isEnabled());
	}
	
	public String verifyLogin() {
		return txtAccount.getAttribute("innerHTML");
	}
}
