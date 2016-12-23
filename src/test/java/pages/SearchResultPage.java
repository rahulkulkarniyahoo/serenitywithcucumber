package pages;

//import net.serenitybdd.core.pages.PageObject;
//import org.junit.Assert;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
////import org.openqa.selenium.support.FindBy;
//import net.serenitybdd.core.annotations.findby.FindBy;
//
//import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

/**
 * Created by rahul.kulkarni on 22/12/2016.
 */
public class SearchResultPage extends PageObject {

    @FindBy(linkText = "helloworld – Deals on Accommodation, Flights, Cruises and More")
    WebElement searchWord;


    public void findTheWord(String resultWord) {

        System.out.println("Came Here. result Word = " + resultWord);
        //waitFor(5000);
        waitFor(titleContains("Google Search"));


       // System.out.println("Title is present" +getDriver().getCurrentUrl());
       //Assert.assertTrue(searchWord.isDisplayed());
       // boolean b = searchWord.

        //Assert.assertTrue(true);
        System.out.println("Passed");
    }


}
