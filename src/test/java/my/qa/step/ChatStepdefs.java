package my.qa.step;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import my.qa.page.ChatBlock;
import org.springframework.beans.factory.annotation.Autowired;

public class ChatStepdefs {

    @Autowired
    private ChatBlock chatBlock;



    @When("User opens chat")
    public void userOpensChat() {
        chatBlock.openChat();
    }

    @And("Sends {string}")
    public void sends(String arg0) {
        chatBlock.sendMessage(arg0);
    }

    @Then("Message {string} is added to chat")
    public void messageIsAddedToChat(String arg0) {
        chatBlock.messageIsAddedToChat(arg0);
    }
}
