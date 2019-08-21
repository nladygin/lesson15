package my.qa.service;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;


@Service
public class Driver {

    static {
        WebDriverManager.chromedriver().setup();
    }

    public WebDriver driver;


    public WebDriver initDriver(){
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }


    public void closeDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
