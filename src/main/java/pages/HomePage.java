package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import parentPage.ParentPage;

public class HomePage extends ParentPage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isLogonStatusDisplayed(){
        try{
            WebElement logonstatus = webDriver.findElement(By.xpath(".//*[@class='logon-status']"));
            return logonstatus.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
}
