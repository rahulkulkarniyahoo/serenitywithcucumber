package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Boolean.TRUE;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

/**
 * Created by rahul.kulkarni on 22/12/2016.
 */
public class TVPage extends PageObject{

//@FindBy(id="orb-search-button")
@FindBy(className = "orb-search-button")
WebElement searchButton;


@FindBy(partialLinkText = "HelloWorld")

WebElement searchWord;

    public void findTVText() {
        System.out.println("Came Here");
        waitFor(2000);
        Assert.assertTrue(searchWord.isDisplayed());
        System.out.println("Passed");

    }

    public void findTheWord(String resultWord) {
        System.out.println("Came Here. result Word = " + resultWord);
        waitFor(2000);
        Assert.assertTrue(searchWord.isDisplayed());
        System.out.println("Passed");
    }
}
