package my.qa.page;

import my.qa.service.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


@Component
public class ServiceCategoriesPage {

    private final By locatorCrumbs      = By.cssSelector("li.last span");
    private final By locatorCategory    = By.cssSelector("div.span_7.ng-scope");

    @Autowired
    private WebDriver driver;

    public ServiceCategoriesPage() {
//        this.driver = Driver.getDriver();
    }

    public void loaded(){
        new WebDriverWait(driver, 10L).until(ExpectedConditions.textToBe(locatorCrumbs, "Категории услуг"));
    }

    public void checkServicesNumber(int num){
        assertThat(driver.findElements(locatorCategory).size(), equalTo(num));
    }


}
