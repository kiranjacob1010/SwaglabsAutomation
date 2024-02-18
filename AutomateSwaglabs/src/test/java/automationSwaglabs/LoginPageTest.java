package automationSwaglabs;

import automationSwaglabs.basicConfig.TestConfig;
import automationSwaglabs.pages.HomePage;
import automationSwaglabs.pages.LoginPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class LoginPageTest extends TestConfig {
    LoginPage loginPage = new LoginPage();

@BeforeEach
    public void setUp() throws IOException, InterruptedException {
      initialise();
    HomePage homepage = new HomePage();
    homepage.acceptCookies();
    homepage.clickLogin();
    }


    @Test
    public void loginWithUser1() throws InterruptedException {

        loginPage.login(properties.getProperty("username1"), properties.getProperty("password1"));


    }

    @Test
    public void loginWithUser2() throws InterruptedException {
        loginPage.login(properties.getProperty("username2"), properties.getProperty("password2"));
    }
}
