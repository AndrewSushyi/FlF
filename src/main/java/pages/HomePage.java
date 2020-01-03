package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class HomePage extends ParentPage {
    @FindBy(xpath = ".//*[@class='logon-status']")
    private WebElement logonStatus;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isLogonStatusDisplayed(){
        try{
            return logonStatus.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
}
