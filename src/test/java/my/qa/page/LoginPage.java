package my.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class LoginPage {

    private final String url            = "https://www.gosuslugi.ru/auth/esia/";
    private final By locatorLogin       = By.cssSelector("#mobileOrEmail");
    private final By locatorPassword    = By.cssSelector("#password");
    private final By locatorLoginByPwd  = By.cssSelector("#loginByPwdButton");


    @Autowired
    private WebDriver driver;


    public void open(){
        driver.get(url);
    }

    public void login(String login, String password){
        driver.findElement(locatorLogin).sendKeys(login);
        driver.findElement(locatorPassword).sendKeys(password);
        driver.findElement(locatorLoginByPwd).click();
    }



}
