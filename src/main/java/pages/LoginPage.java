package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
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
}
