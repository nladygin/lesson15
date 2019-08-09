package my.qa.step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import my.qa.page.SearchResultPage;

import java.util.List;

public class SearchResultStepdefs {

    private SearchResultPage searchResultPage;

    public SearchResultStepdefs() {
        this.searchResultPage = new SearchResultPage();
    }

    @Then("User should be on the search result page")
    public void userShouldBeOnTheSearchResultPage() {
        searchResultPage.loaded();
    }

//    @And("Search result is <result>")
//    public void searchResultIsResult(String result) {
//        searchResultPage.verify(result);
//    }

//    @And("Search result is {string}")
//    public void searchResultIs(String arg0) {
//        searchResultPage.verify(arg0);
//    }

    @And("Search result is {string} and {string}")
    public void searchResultIsAnd(String arg0, String arg1) {
        searchResultPage.verify(arg0, arg1);
    }
}
