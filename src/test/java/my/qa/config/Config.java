package my.qa.config;

import my.qa.service.Driver;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.test.annotation.DirtiesContext;

@Configuration
@ComponentScan("my.qa")
@DirtiesContext
public class Config {

    @Autowired
    private Driver driverService;

    @Bean
    public WebDriver getDriver() {
        return driverService.initDriver();
    }

}
