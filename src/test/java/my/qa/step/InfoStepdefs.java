package my.qa.step;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my.qa.page.InfoPage;
import org.springframework.beans.factory.annotation.Autowired;

public class InfoStepdefs {

    @Autowired
    private InfoPage infoPage;



    @When("User navigates to personal page")
    public void userNavigatesToPersonalPage() {
        infoPage.open();
    }

    @Then("User should be on the personal page")
    public void userShouldBeOnThePersonalPage() {
        infoPage.verify();
    }

}
