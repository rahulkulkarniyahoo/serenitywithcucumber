package learnserenity;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;

/**
 * Created by rahul.kulkarni on 22/12/2016.
 */
public class StepDefinition {

    WebPage webPage;
    SearchResultPage searchResultPage;

    DailyMailLoginPage dailyMailLoginPage;
   MyAccountPage myAccountPage;


    @Given("^User opens dailymailplus website$")
    public void user_opens_dailymailplus_website() throws Throwable {
    dailyMailLoginPage.open();
    //Assert.assertTrue(true);

    }

    @When("^user enters userid and password$")
    public void user_enters_userid_and_password() throws Throwable {
    dailyMailLoginPage.enterUseridAndPassword();
        //Assert.assertTrue(true);

    }

    @Then("^user can log in$")
    public void user_can_log_in() throws Throwable {
        myAccountPage.checkTextOnPage();
        //Assert.assertTrue(true);
    }








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
