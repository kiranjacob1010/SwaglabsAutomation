package automationSwaglabs.pages;

import automationSwaglabs.basicConfig.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class LoginPage extends TestConfig {

    public void login (String email, String password) throws InterruptedException {
        Thread.sleep(3000);
        WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
        WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
        Username.sendKeys(email);
        Password.sendKeys(password);
        WebElement Submit = driver.findElement(By.xpath("//button[@class='mt-1 w-full btn-cta btn-new light-theme bg-primary variant-filled size-md']//div[@class='btn-content']"));
        Submit.click();

    }
}
