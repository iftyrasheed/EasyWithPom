package pages;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test(priority = 1)
    public void testLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("01791557029", "123456");
        Thread.sleep(5000);
    }
}
