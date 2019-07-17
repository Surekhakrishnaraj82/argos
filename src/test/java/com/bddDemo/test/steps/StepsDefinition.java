package com.bddDemo.test.steps;

import com.bddDemo.pageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class StepsDefinition {

    HomePage homePage=new HomePage();

    @Given("^I am HomePage$")
    public void i_am_HomePage()  {
        String actual = homePage.getHomePageUrl();
        assertThat("HomePage might be end with something or user on different page .", actual, Matchers.endsWith("co.uk/"));
    }
    @When("^I am searching for a product \"([^\"]*)\"$")
    public void i_am_searching_for_a_product(String searchItem) {
        homePage.doSearch(searchItem);

    }
/*    @When("^I am searching for a product$")
    public void i_am_searching_for_a_product() {
     homePage.doSearch();
    }
*/


    @Then("^I should be able to see respective product$")
    public void i_should_be_able_to_see_respective_product(){

        System.out.println("Welcome");
    }

}
