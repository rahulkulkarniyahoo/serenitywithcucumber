package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import static java.lang.Boolean.TRUE;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

/**
 * Created by rahul.kulkarni on 22/12/2016.
 */

@DefaultUrl("http://www.google.co.uk")
public class WebPage extends PageObject {

    @FindBy(id = "lst-ib")
    WebElement searchField;


    @FindBy(xpath =".//*[@name='btnG']")
    WebElement searchButton;

   /* public SearchResultPage searchforWord(String searchWord) {
        searchField.clear();
        searchField.sendKeys(searchWord);
        waitForMe(2000);
        searchButton.click();
        waitForMe(5000);
        System.out.println("Rahul is a good boy" +searchWord);
        return new SearchResultPage();
    }*/

public void waitForMe(int waitfor) {
    try {
        Thread.sleep(waitfor);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

public void abc(String keywords) {
    searchField.clear();
    searchField.sendKeys(keywords, Keys.ENTER);
        waitFor(titleContains("Google Search"));
        System.out.println("dance");

    }
}


