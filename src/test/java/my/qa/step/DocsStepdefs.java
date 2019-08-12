package my.qa.step;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my.qa.page.DocumentsPage;

public class DocsStepdefs {

    private DocumentsPage documentsPage;

    public DocsStepdefs() {
        this.documentsPage = new DocumentsPage();
    }

    @When("User navigates to docs page")
    public void userNavigatesToDocsPage() {
        documentsPage.open();
    }

    @Then("User should be on the docs page")
    public void userShouldBeOnTheDocsPage() {
        documentsPage.verify();
    }

}
