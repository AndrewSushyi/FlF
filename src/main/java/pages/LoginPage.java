package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {

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
        WebElement inputLogin = webDriver.findElement(By.name("UserOnlyName"));
        inputLogin.clear();
        inputLogin.sendKeys(login);
        logger.info(login + "was inputed in to input Login");
    }

    public void enterPassInToInputPassWord(String password) {
        WebElement inputLogin = webDriver.findElement(By.name("UserOnlyPassword"));
        inputLogin.clear();
        inputLogin.sendKeys(password);
        logger.info(password + "was inputed in to input Password");
    }

    public void clickOnButtonLogin() {
        WebElement inputLogin = webDriver.findElement(By.id("submit-button"));
        inputLogin.click();
        logger.info(" Button Login was clicked");
    }
}
