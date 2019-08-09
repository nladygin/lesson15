package my.qa.page;

import my.qa.service.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchResultPage {

    private final By locatorResultPage          = By.cssSelector("div[ng-if='!loading']");
    private final By locatorSearchResult        = By.cssSelector("span.title_search");
    private final By locatorSearchResultDetail  = By.cssSelector("div.details div.title a");

    private WebDriver driver;

    public SearchResultPage() {
        this.driver = Driver.getDriver();
    }

    public void loaded(){
        new WebDriverWait(driver, 30L).until(ExpectedConditions.numberOfElementsToBe(locatorResultPage, 1));
    }

    public void verify(String result, String details){
        if (driver.findElements(locatorSearchResultDetail).size() > 0) {
            assertThat(driver.findElement(locatorSearchResult).getText(), equalTo(result));
            assertThat(driver.findElement(locatorSearchResultDetail).getText(), equalTo(details));
        } else {
            assertThat(driver.findElement(locatorSearchResult).getText(), equalTo(result));
        }
    }
}
