package my.qa.step;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import my.qa.page.ServiceCategoriesPage;

public class ServiceCategoriesStepdefs {

    private ServiceCategoriesPage serviceCategoriesPage;
    public ServiceCategoriesStepdefs() {
        this.serviceCategoriesPage = new ServiceCategoriesPage();
    }

    @Then("User should be on the categories page")
    public void userShouldBeOnTheCategoriesPage() {
        serviceCategoriesPage.loaded();
    }

    @And("Categories number is {int}")
    public void categoriesNumberIs(int arg0) {
        serviceCategoriesPage.checkServicesNumber(arg0);
    }
}
