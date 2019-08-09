package my.qa.page;

import my.qa.service.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PensionReportPage {

    private final String url            = "https://www.gosuslugi.ru/10042/1/form";
    private final By locatorCrumbs      = By.cssSelector("li.last span");
    private final By locatorPageTitle   = By.cssSelector("div.title h1");
    private final By locatorDate        = By.cssSelector("span b:nth-of-type(2)");

    private WebDriver driver;

    public PensionReportPage() {
        this.driver = Driver.getDriver();
    }


    public void open(){
        driver.get(url);
    }


    public void verify(){
        new WebDriverWait(driver, 30L).until(ExpectedConditions.numberOfElementsToBe(locatorPageTitle, 1));
        assertThat(driver.findElement(locatorCrumbs).getText(), equalTo("Получение сведений о состоянии индивидуального лицевого счета"));
        assertThat(driver.findElement(locatorDate).getText(), equalTo(new SimpleDateFormat("dd.MM.yyyy").format(new Date())));
    }

}
