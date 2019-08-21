package my.qa.step;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my.qa.page.CardsPage;
import org.springframework.beans.factory.annotation.Autowired;

public class CardsStepdefs {

    @Autowired
    private CardsPage cardsPage;



    @When("User navigates to cards page")
    public void userNavigatesToCardsPage() {
        cardsPage.open();
    }

    @Then("User should be on the cards page")
    public void userShouldBeOnTheCardsPage() {
        cardsPage.verify();
    }

}