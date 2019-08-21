package my.qa.step;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my.qa.page.PensionReportPage;
import org.springframework.beans.factory.annotation.Autowired;

public class PensionReportStepdefs {

    @Autowired
    private PensionReportPage pensionReportPage;



    @When("User requests the pension report")
    public void userRequestsThePensionReport() {
        pensionReportPage.open();
    }

    @Then("Report is created")
    public void reportIsCreated() {
        pensionReportPage.verify();
    }
}
