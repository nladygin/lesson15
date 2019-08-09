package my.qa.step;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my.qa.page.NotificationsPage;

public class NotificationsStepdefs {

    private NotificationsPage notificationsPage;

    public NotificationsStepdefs() {
        this.notificationsPage = new NotificationsPage();
    }

    @When("User navigates to notifications page")
    public void userNavigatesToNotificationsPage() {
        notificationsPage.open();
    }

    @Then("User should be on the notifications page")
    public void userShouldBeOnTheNotificationsPage() {
        notificationsPage.verify();
    }

}
