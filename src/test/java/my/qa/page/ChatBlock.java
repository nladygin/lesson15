package my.qa.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Component
public class ChatBlock {

    private final By locatorOpenChat        = By.cssSelector("div.pso-header");
    private final By locatorSwitchChat      = By.cssSelector("#pso-chat-tab");
    private final By locatorMessageInput    = By.cssSelector("#_ocwidget_chat_editorInput");
    private final By locatorMessageSent     = By.cssSelector("div._ocwidget_chat_messItem-text");

    @Autowired
    private WebDriver driver;



    public void openChat(){
        new WebDriverWait(driver, 10L).until(ExpectedConditions.presenceOfElementLocated(locatorOpenChat));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(locatorOpenChat));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(locatorSwitchChat));
        new WebDriverWait(driver, 10L).until(ExpectedConditions.presenceOfElementLocated(locatorMessageInput));
    }

    public void sendMessage(String msg){
        int num = driver.findElements(locatorMessageSent).size();
        new WebDriverWait(driver, 10L).until(ExpectedConditions.visibilityOfElementLocated(locatorMessageInput));
        driver.findElement(locatorMessageInput).sendKeys(msg, Keys.chord(Keys.CONTROL, Keys.ENTER));
        new WebDriverWait(driver, 10L).until(ExpectedConditions.numberOfElementsToBeMoreThan(locatorMessageSent, num));
    }

    public void messageIsAddedToChat(String msg){
        List<WebElement> posts = driver.findElements(locatorMessageSent);
        assertThat(posts.get(posts.size()-1).getAttribute("innerText"), equalTo(msg));
    }

}
