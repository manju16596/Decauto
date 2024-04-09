package testpkg;


import org.testng.annotations.Test;

import Pagepkg.FBloginPage;

public class FBLoginTest extends Baseclass{


@Test

public void LoginTest() throws InterruptedException {
FBloginPage ob=new FBloginPage(driver);
ob.setvalues("testselenium","Passwo@123");
ob.loginclick();
Thread.sleep(10000);
ob.forgotPasslink();
ob.forgotCancelButton();
ob.SignUpLink();
//
}

// @Test

/* public void ForgotPasswordTest() {

driver.get("https://www.facebook.com");
ob.forgotPasslink();
} */
}
