package automationSwaglabs;

import automationSwaglabs.basicConfig.TestConfig;
import automationSwaglabs.pages.HomePage;
import automationSwaglabs.pages.LoginPage;
import org.junit.jupiter.api.Test;

import java.io.IOException;


public class AuthenticationTest extends TestConfig {
    HomePage homePage = new HomePage();
    LoginPage loginPage= new LoginPage();
    @Test
    public void openBrowserTest() throws InterruptedException, IOException {
        initialise();
        Thread.sleep(10000);
        homePage.acceptCookies();
        homePage.clickLogin();
        //driver.close();
        loginPage.login("abc@gmail.com" , "abcd");
    }

}

