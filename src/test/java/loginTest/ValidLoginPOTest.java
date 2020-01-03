package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class ValidLoginPOTest extends AbstractParentTest {
    @Test
    public void validLogin(){
        loginPage.openPage();
        loginPage.enterLoginInToInputLogin("qasushyi\\sushyi");
        loginPage.enterPassInToInputPassWord("Nirvana123");
        loginPage.clickOnButtonLogin();

        checkExpectedResult ("LogStatus not present", homePage.isLogonStatusDisplayed());




    }


}
