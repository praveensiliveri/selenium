package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver=null;
	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
    @FindBy(xpath="//input[@id='search_query_top']")
	private WebElement searchtextbox;
	
	@FindBy(linkText="Sign in")
	private WebElement signinlink;
	
	@FindBy(linkText="Contact us")
	private WebElement Contactus;

	@FindBy(linkText="Women")
	private WebElement Womenlink;
	
	
	public WebElement getSearchtextbox() {
		return searchtextbox;
	}

	public void setSearchtextbox(String searchtextbox) {
		this.searchtextbox.sendKeys(searchtextbox);
	}

	public WebElement getSigninlink() {
		return signinlink;
	}

	public WebElement getContactus() {
		return Contactus;
	}

	public WebElement getWomenlink() {
		return Womenlink;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
