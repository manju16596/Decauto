package Pagepkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBloginPage {

WebDriver driver;
By fbEmailid=By.id("email");
By FbPass=By.id("pass");
By login=By.name("login");
By forgotPass=By.xpath("//*[@id=\"login_link\"]/div/a");
By forgotCancel=By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[3]/div/div[1]/a");
By SigUpLink=By.xpath("//*[@id=\"login_link\"]/a[2]");

public FBloginPage(WebDriver driver) {
this.driver=driver;

}
public void setvalues(String email,String pass) {
driver.findElement(fbEmailid).sendKeys(email);
driver.findElement(FbPass).sendKeys(pass);
}

public void loginclick(){
driver.findElement(login).click();
}

public void forgotPasslink() {
driver.findElement(forgotPass).click();
}

public void forgotCancelButton() {
driver.findElement(forgotCancel).click();
}

public void SignUpLink() {
driver.findElement(SigUpLink).click();

}}
