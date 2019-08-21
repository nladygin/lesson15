package my.qa.step;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import my.qa.page.SearchResultPage;
import org.springframework.beans.factory.annotation.Autowired;

public class SearchResultStepdefs {

    @Autowired
    private SearchResultPage searchResultPage;



    @Then("User should be on the search result page")
    public void userShouldBeOnTheSearchResultPage() {
        searchResultPage.loaded();
    }

    @And("Search result is {string} and {string}")
    public void searchResultIsAnd(String arg0, String arg1) {
        searchResultPage.verify(arg0, arg1);
    }
}
