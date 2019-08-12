package my.qa.step;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my.qa.page.CardsPage;

public class CardsStepdefs {

    private CardsPage cardsPage;

    public CardsStepdefs() {
        this.cardsPage = new CardsPage();
    }

    @When("User navigates to cards page")
    public void userNavigatesToCardsPage() {
        cardsPage.open();
    }

    @Then("User should be on the cards page")
    public void userShouldBeOnTheCardsPage() {
        cardsPage.verify();
    }

}