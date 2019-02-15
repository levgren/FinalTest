package IevgenTest;

import okhttp3.internal.connection.RouteSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.xml.transform.Result;

public class MainPage {
    static WebDriver driver = Driver.get();

    public MainPage goTo(String url) {
        driver.get(url);
        return this;
    }
    WebElement typeOfEstateDropdown = driver.findElement(By.cssSelector("#leftFilter .box-panel:nth-child(5) .css-pseudoselect"));
    WebElement typeOfEstate = driver.findElement(By.cssSelector("#leftFilter .options .catType:nth-of-type(2)"));
    Select numberOfAdsToDisplay = new Select (driver.findElement(By.xpath("/html//div[@id='pagination']//a[.='20 объявлений']")));  //show 20 ads link
    WebElement amountOfResults = driver.findElement(By.xpath("//div[contains(@class, 'ticket-clear')]"));   //path to ads

    public MainPage SelectTypeofEstate(){
    typeOfEstateDropdown.click();
    typeOfEstate.click();
    return this;
    }

    public int NumberOfElements(){
       String getValue = numberOfAdsToDisplay.getFirstSelectedOption().getText();
       return Integer.getInteger(getValue);
    }



}