package my.qa.page;

import my.qa.service.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class InfoPage {

    private final String url        = "https://lk.gosuslugi.ru/info";
    private final By locatorCrumbs  = By.cssSelector("li.last span");
    private final By locatorTab     = By.cssSelector("div.profile-tab.tabs-offset.md-h-title-16.active span");

    private WebDriver driver;

    public InfoPage() {
        this.driver = Driver.getDriver();
    }


    public void open(){
        driver.get(url);
    }

    public void verify(){
        assertThat(driver.findElement(locatorCrumbs).getText(), equalTo("Персональная информация"));
        assertThat(driver.findElement(locatorTab).getText(), equalTo("Обзор"));
    }
}
