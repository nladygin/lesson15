package my.qa.page;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


@Component
public class MainPage {

    private final String url                = "https://www.gosuslugi.ru";
    private final String linkCategories     = "https://www.gosuslugi.ru/category";
    private final By locatorUserMenu        = By.cssSelector("#float-user-menu");
    private final By locatorSearchIcon      = By.cssSelector("div.search-ico");
    private final By locatorSearchInput     = By.cssSelector("input.select-text");
    private final By locatorDebtInformer    = By.cssSelector("div.block-informer-single");
    private final By locatorNoDebtIcon      = By.cssSelector("div.informer-ok-icon");
    private final By locatorNoDebtText      = By.cssSelector("div.block-informer-single > div > a > div:nth-child(2)");


    @Autowired
    private WebDriver driver;


    public void open(){
        driver.get(url);
    }

    public void loaded(){
        assertThat(driver.getTitle(), equalTo("Портал государственных услуг Российской Федерации"));
    }

    public void openSearchDialog(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(locatorSearchIcon));
    }

    public void putSearchQuery(String query){
        driver.findElement(locatorSearchInput).sendKeys(query, Keys.ENTER);
    }

    public void showServiceCategories(){
        driver.get(linkCategories);
    }

    public void checkPersonalDebt(){
        new WebDriverWait(driver, 10L).until(ExpectedConditions.presenceOfElementLocated(locatorDebtInformer));
    }

    public void noPersonalDebt(){
        assertThat(driver.findElements(locatorNoDebtIcon).size(), equalTo(1));
        assertThat(driver.findElement(locatorNoDebtText).getText(), equalTo("У вас нет неоплаченных задолженностей"));
    }

    public void verify(){
        assertThat(driver.findElements(locatorUserMenu).size(), equalTo(1));
    }


}
