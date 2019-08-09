package my.qa.step;


import cucumber.api.java.en.Given;
import io.cucumber.java.After;
import my.qa.page.LoginPage;
import my.qa.page.MainPage;
import my.qa.service.Driver;

public class BackgroundStepdefs {

    private String login;
    private String password;

    private LoginPage loginPage;
    private MainPage mainPage;

    public BackgroundStepdefs() {
        this.loginPage = new LoginPage();
        this.mainPage = new MainPage();
        this.login = System.getProperty("login");
        this.password = System.getProperty("password");
    }

    @Given("User is logged in")
    public void userIsLoggedIn() {
        loginPage.open();
        loginPage.login(login, password);
        mainPage.verify();
    }

    @After
    public void after(){
        Driver.clearDriver();
    }
}
