package my.qa.page;

import my.qa.service.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Component
public class CardsPage {

    private final String url        = "https://lk.gosuslugi.ru/cards";
    private final By locatorCrumbs  = By.cssSelector("li.last span");
    private final By locatorTab     = By.cssSelector("div.profile-tab.tabs-offset.md-h-title-16.active span");

    @Autowired
    private WebDriver driver;

    public CardsPage() {
//        this.driver = Driver.getDriver();
    }


    public void open(){
        driver.get(url);
    }

    public void verify(){
        assertThat(driver.findElement(locatorCrumbs).getText(), equalTo("Персональная информация"));
        assertThat(driver.findElement(locatorTab).getText(), equalTo("Карты оплаты"));
    }
}
