package my.qa.step;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my.qa.page.NotificationSetupPage;

public class NotificationSetupStepdefs {

    private NotificationSetupPage notificationSetupPage;

    public NotificationSetupStepdefs() {
        this.notificationSetupPage = new NotificationSetupPage();
    }

    @When("User navigates to notification setup page")
    public void userNavigatesToNotificationSetupPage() {
        notificationSetupPage.open();
    }

    @Then("User should be on the notification setup page")
    public void userShouldBeOnTheNotificationSetupPage() {
        notificationSetupPage.verify();
    }

}
