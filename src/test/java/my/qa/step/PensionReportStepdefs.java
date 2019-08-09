package my.qa.step;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my.qa.page.PensionReportPage;

public class PensionReportStepdefs {

    private PensionReportPage pensionReportPage;

    public PensionReportStepdefs() {
        this.pensionReportPage = new PensionReportPage();
    }

    @When("User requests the pension report")
    public void userRequestsThePensionReport() {
        pensionReportPage.open();
    }

    @Then("Report is created")
    public void reportIsCreated() {
        pensionReportPage.verify();
    }
}
