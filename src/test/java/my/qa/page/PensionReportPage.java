package my.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Component
public class PensionReportPage {

    private final String url            = "https://www.gosuslugi.ru/10042/1/form";
    private final By locatorCrumbs      = By.cssSelector("li.last span");
    private final By locatorPageTitle   = By.cssSelector("div.title h1");
    private final By locatorDate        = By.cssSelector("span b:nth-of-type(2)");

    @Autowired
    private WebDriver driver;



    public void open(){
        driver.get(url);
    }


    public void verify(){
        new WebDriverWait(driver, 30L).until(ExpectedConditions.numberOfElementsToBe(locatorPageTitle, 1));
        assertThat(driver.findElement(locatorCrumbs).getText(), equalTo("Получение сведений о состоянии индивидуального лицевого счета"));
        assertThat(driver.findElement(locatorDate).getText(), equalTo(new SimpleDateFormat("dd.MM.yyyy").format(new Date())));
    }

}
