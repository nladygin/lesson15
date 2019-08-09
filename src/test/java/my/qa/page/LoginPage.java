package my.qa.page;

import my.qa.service.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    private final String url            = "https://www.gosuslugi.ru/auth/esia/";
    private final By locatorLogin       = By.cssSelector("#mobileOrEmail");
    private final By locatorPassword    = By.cssSelector("#password");
    private final By locatorLoginByPwd  = By.cssSelector("#loginByPwdButton");


    private WebDriver driver;

    public LoginPage() {
        this.driver = Driver.getDriver();
    }

    public void open(){
        driver.get(url);
    }

    public void login(String login, String password){
        driver.findElement(locatorLogin).sendKeys(login);
        driver.findElement(locatorPassword).sendKeys(password);
        driver.findElement(locatorLoginByPwd).click();
    }



}
