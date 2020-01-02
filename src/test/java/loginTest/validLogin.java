package loginTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class validLogin {
    @Test
    public void validLogin(){
       // loginPage.openPage("https://try.flowfinity.com/");
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://try.flowfinity.com/");

        webDriver.findElement(By.name("UserOnlyName")).clear();
        webDriver.findElement(By.name("UserOnlyName")).sendKeys("qasushyi\\sushyi");

        webDriver.findElement(By.name("UserOnlyPassword")).clear();
        webDriver.findElement(By.name("UserOnlyPassword")).sendKeys("Nirvana123");

        webDriver.findElement(By.id("submit-button")).click();

        Assert.assertTrue("Нет Статуса авторизирЮзера", webDriver.findElement(By.xpath(".//*[@class='logon-status']")).isDisplayed());

        webDriver.quit();
    }





}
