package my.qa.step;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import my.qa.config.Config;
import my.qa.service.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = Config.class)
@DirtiesContext
public class BaseStepdefs {

    @Autowired
    private Driver driverService;



    @Before
    public void before(Scenario scenario){
        System.out.println(">>>" + scenario.getName());
        driverService.initDriver();
    }

    @After
    public void after(Scenario scenario){
        System.out.println("<<<" + scenario.getName());
        driverService.closeDriver();
    }

}
