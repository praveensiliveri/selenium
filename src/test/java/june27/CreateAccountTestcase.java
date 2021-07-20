package june27;

import org.testng.annotations.Test;

import testbase.Testbase;

public class CreateAccountTestcase extends Testbase {

	@Test
	public void CreateAccount() {
		homepageobj.getSigninlink().click();
		authpageobj.setCreateaccountemail("digitalcutlet2@gmail.com");
		authpageobj.getCreateaccountsubmitbutton().click();
	}
	
	
}
