package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidLoginTest extends AbstractParentTest {
    WebDriver webDriver;

    @Test
    public void validLogin(){

        webDriver.get("https://try.flowfinity.com/");

        webDriver.findElement(By.name("UserOnlyName")).clear();
        webDriver.findElement(By.name("UserOnlyName")).sendKeys("qasushyi\\sushyi");

        webDriver.findElement(By.name("UserOnlyPassword")).clear();
        webDriver.findElement(By.name("UserOnlyPassword")).sendKeys("Nirvana123");

        webDriver.findElement(By.id("submit-button")).click();

        Assert.assertTrue("Нет Статуса авторизирЮзера", isLogonStatusPresent());
    }

    private boolean isLogonStatusPresent() {
       try{
           return webDriver.findElement(By.xpath(".//*[@class='logon-status']")).isDisplayed();
       }catch (Exception e){
            return false;
       }

    }

}

