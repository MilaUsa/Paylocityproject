package Pages.paylocityPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='form-username']")
    WebElement username;
    @FindBy(xpath = "//input[@name='form-password']")
    WebElement password;
    @FindBy(id = "btnLogin")
    WebElement loginButton;

    public void LoginPageInfo(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();

    }
}
