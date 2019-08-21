package my.qa.step;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my.qa.page.DocumentsPage;
import org.springframework.beans.factory.annotation.Autowired;

public class DocsStepdefs {

    @Autowired
    private DocumentsPage documentsPage;



    @When("User navigates to docs page")
    public void userNavigatesToDocsPage() {
        documentsPage.open();
    }

    @Then("User should be on the docs page")
    public void userShouldBeOnTheDocsPage() {
        documentsPage.verify();
    }

}
