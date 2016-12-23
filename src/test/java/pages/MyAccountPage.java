package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

/**
 * Created by rahul.kulkarni on 23/12/2016.
 */
public class MyAccountPage extends PageObject{

@FindBy(xpath = ".//*[@id='content']/h2")
WebElement welcomeMessageText;

    public void checkTextOnPage() {
        Assert.assertTrue(welcomeMessageText.getText().contains("UAT110"));
        System.out.println("Message Verified");
    }
}
