package automationSwaglabs.basicConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestConfig {

    public static WebDriver driver;

    public  static Properties properties;
    public static Properties readPropertyfile() throws IOException {

        Properties prop = new Properties(); //create properties object to store  the value from application.properties file
        String location = System.getProperty("user.dir") + "/src/main/resources/application.properties";
        prop.load(new FileInputStream(location));
        return prop;

    }

    public static void initialise() throws IOException {
         properties= readPropertyfile();
        WebDriverManager.chromedriver().setup(); //setup the drivermange
        ChromeOptions options = new ChromeOptions(); // create chrome options object
       // options.addArguments("--headless");
        driver = new ChromeDriver(options); // create chrome driver object
        driver.get(properties.getProperty("studydrive.url")); // set the url we need to open
        driver.manage().window().maximize(); // open chrome window and then maximise the window
        driver.manage().deleteAllCookies();
    }
        }

