package my.qa.step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my.qa.page.ChatBlock;

public class ChatStepdefs {

    private ChatBlock chatBlock;

    public ChatStepdefs() {
        this.chatBlock = new ChatBlock();
    }

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
