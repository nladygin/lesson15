package my.qa.step;


import io.cucumber.java.en.Given;
import my.qa.page.LoginPage;
import my.qa.page.MainPage;
import org.springframework.beans.factory.annotation.Autowired;


public class BackgroundStepdefs {

    private String login;
    private String password;

    @Autowired
    private LoginPage loginPage;
    @Autowired
    private MainPage mainPage;

    public BackgroundStepdefs() {
        this.login = System.getProperty("login");
        this.password = System.getProperty("password");
    }


    @Given("User is logged in")
    public void userIsLoggedIn() {
        loginPage.open();
        loginPage.login(login, password);
        mainPage.verify();
    }

}
