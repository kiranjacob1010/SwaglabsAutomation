package automationSwaglabs.pages;

import automationSwaglabs.basicConfig.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HomePage extends TestConfig {
    public void  acceptCookies() throws InterruptedException {
        String buttonJsPath = "return document.querySelector('#usercentrics-root').shadowRoot.querySelector('.sc-dcJsrY.eLpiYF')";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        WebElement acceptCookieButton = (WebElement) js.executeScript(buttonJsPath);
        acceptCookieButton.click();
    }

public void clickLogin() {
        driver.findElement(By.xpath("//div[@class='w-full'][normalize-space()='Log in']")).click();
}
}
