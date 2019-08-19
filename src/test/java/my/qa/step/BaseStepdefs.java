package my.qa.step;

import io.cucumber.java.After;
import my.qa.config.Config;
import my.qa.service.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = Config.class)
public class BaseStepdefs {
    @Autowired
    private Driver driver;


    @After
    public void after(){
        driver.closeDriver();
    }

}
