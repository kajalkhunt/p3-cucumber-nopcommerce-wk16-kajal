package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.cucumber.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.cucumber.pages.ComputerPage;
import com.nopcommerce.demo.cucumber.pages.DesktopsPage;
import com.nopcommerce.demo.cucumber.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputersSteps {

    @When("^I click on Computers$")
    public void iClickOnComputers() {
        new HomePage().clickOnMenuTab("Computers");
    }

    @Then("^I should navigate to Computer page$")
    public void iShouldNavigateToComputerPage() {
        Assert.assertEquals("Computers page not displayed", "Computers", new ComputerPage().getPageTitleText());
    }

    @Given("^I am on Computers$")
    public void iAmOnComputers() {
        new HomePage().clickOnMenuTab("Computers");

    }

    @And("^I click on Desktops$")
    public void iClickOnDesktops() {
        new ComputerPage().clickOnSubMenu("Desktops");
    }

    @Then("^I should nevigate to desktop page successfully$")
    public void iShouldNevigateToDesktopPageSuccessfully() {
        Assert.assertEquals("Desktops page not displayed","Desktops",new DesktopsPage().getPageTitleText());
    }

//    @When("^I click on Computers$")
//    public void iClickOnCoputers() {
//        new HomePage().clickOnMenuTab("Computers");
//    }

    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String product) {
        new DesktopsPage().selectProduct(product);
    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessoe(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^I select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^I select HDD \"([^\"]*)\"$")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("^I select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("^I click on Add to Cart Button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^I can add product to cart successfully$")
    public void iCanAddProductToCartSuccessfully() {
        Assert.assertEquals("Product does not added to cart","The product has been added to your shopping cart",new BuildYourOwnComputerPage().getProductAddedMessage());
    }

    @Then("^I should navigate to Computer page successfully$")
    public void iShouldNavigateToComputerPageSuccessfully() {

    }

  }
