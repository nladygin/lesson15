package my.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


@Component
public class SearchResultPage {

    private final By locatorResultPage          = By.cssSelector("div[ng-if='!loading']");
    private final By locatorSearchResult        = By.cssSelector("span.title_search");
    private final By locatorSearchResultDetail  = By.cssSelector("div.details div.title a");

    @Autowired
    private WebDriver driver;



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
