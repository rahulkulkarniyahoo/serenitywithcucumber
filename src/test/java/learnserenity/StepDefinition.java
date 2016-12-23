package learnserenity;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SearchResultPage;
import pages.TVPage;
import pages.WebPage;

/**
 * Created by rahul.kulkarni on 22/12/2016.
 */
public class StepDefinition {

    WebPage webPage;
    SearchResultPage searchResultPage;


    @Given("^User opens Google website$")
    public void user_opens_Google_website() throws Throwable {
        System.out.println("Given");
        webPage.open();
    }

    @When("^User enters value \"([^\"]*)\"$")
    public void user_enters_value(String searchWord) throws Throwable {
        System.out.println("When stament");

        //searchResultPage = webPage.searchforWord(searchWord);
        webPage.abc(searchWord);
    }

    @Then("^User can see \"([^\"]*)\" on the page$")
    public void user_can_see_on_the_page(String resultWord) throws Throwable {
        System.out.println("Then I am doing well");
        searchResultPage.findTheWord(resultWord);

    }



}
