package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {
    @FindBy (name = "UserOnlyName")
    private WebElement inputLogin;
    @FindBy (name = "UserOnlyPassword")
    private WebElement inputPassword;
    @FindBy (id = "submit-button")
    private WebElement buttonLogin;


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openPage() {
        try {
            webDriver.get("https://try.flowfinity.com/");
        }catch (Exception e){
            Assert.fail("Can not work with browser");
        }
    }

    public void enterLoginInToInputLogin(String login) {
        inputLogin.clear();
        inputLogin.sendKeys(login);
        logger.info(login + "was inputed in to input Login");
    }

    public void enterPassInToInputPassWord(String password) {
        inputPassword.clear();
        inputPassword.sendKeys(password);
        logger.info(password + "was inputed in to input Password");
    }

    public void clickOnButtonLogin() {
        buttonLogin.click();
        logger.info(" Button Login was clicked");
    }
}
