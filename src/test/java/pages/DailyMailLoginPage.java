package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

/**
 * Created by rahul.kulkarni on 23/12/2016.
 */
@DefaultUrl("http://uat.dailymailplus.co.uk")
public class DailyMailLoginPage extends PageObject{

    @FindBy(linkText = "My Account")
    WebElement myAccountButton;

    @FindBy(id="signinemail")
    WebElement emailAddress;

    @FindBy(id = "signinpassword")
    WebElement password;

    @FindBy(id = "submit")
    WebElement loginButton;


//signinemail
    //signinpassword
    //submit

    public void enterUseridAndPassword() {

        System.out.println("Came here now.. ");
        myAccountButton.click();
        emailAddress.sendKeys("mppuat110test@mailinator.com");
        password.sendKeys("Password123");
        loginButton.click();
        waitFor(titleContains("interactive app"));
        System.out.println("Came till here...");


        //mppuat110test@mailinator.com
              //  Password123
    }
}
