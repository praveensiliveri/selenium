package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authenticationpage {
	
	
	WebDriver driver=null;

	public Authenticationpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="email_create")
	private WebElement createaccountemail;

	@FindBy(name="SubmitCreate")
	private WebElement createaccountsubmitbutton;

	@FindBy(id="email")
	private WebElement signinemail;

	@FindBy(id="passwd")
	private WebElement signinpassword;

	@FindBy(id="SubmitLogin")
	private WebElement signinsubmitbutton;
	
	
	@FindBy(linkText="Sign out")
	private WebElement signoutlink;
	


	public WebElement getCreateaccountemail() {
		return createaccountemail;
	}

	public WebElement getCreateaccountsubmitbutton() {
		return createaccountsubmitbutton;
	}

	public WebElement getSigninemail() {
		return signinemail;
	}

	public WebElement getSigninpassword() {
		return signinpassword;
	}

	public WebElement getSigninsubmitbutton() {
		return signinsubmitbutton;
	}

	public void setCreateaccountemail(String  createaccountemail) {
		this.createaccountemail.sendKeys(createaccountemail);
	}

	public void setSigninemail(String signinemail) {
		this.signinemail.sendKeys(signinemail);
	}

	public void setSigninpassword(String signinpassword) {
		this.signinpassword.sendKeys(signinpassword);
	}

	
	

	public void Logintoapplication(String username, String password) {
	this.setSigninemail(username);
	this.setSigninpassword(password);
	this.getSigninsubmitbutton().click();
	}

	

	public WebElement getSignoutlink() {
		return signoutlink;
	}

}
