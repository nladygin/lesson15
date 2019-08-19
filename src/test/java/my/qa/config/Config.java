package my.qa.config;

import io.cucumber.java.After;
import my.qa.service.Driver;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.annotation.DirtiesContext;

@Configuration
@ComponentScan("my.qa")
@DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
public class Config {

    @Autowired
    private Driver driver;

    @Bean
    public WebDriver getDriver(){
        return driver.initDriver();
    }

}
