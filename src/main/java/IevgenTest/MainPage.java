package IevgenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MainPage {
    static WebDriver driver = Driver.get();

    private WebElement typeOfEstateDropdown;
    private WebElement typeOfEstate;
    private WebElement numberOfAdsToDisplay;
    private WebElement amountOfResults;
    private WebElement dropDown;
    private WebElement selectNumberOfAds;


    public MainPage goTo(String url) {
        driver.get(url);
        return this;
    }
    public MainPage(String url)
    {
        driver.get(url);
        typeOfEstateDropdown = driver.findElement(By.cssSelector("#leftFilter .box-panel:nth-child(5) .css-pseudoselect"));
        typeOfEstate = driver.findElement(By.cssSelector("#leftFilter .options .catType:nth-of-type(2)"));
        numberOfAdsToDisplay = driver.findElement(By.xpath("/html//div[@id='pagination']//a[.='20 объявлений']"));  //show 20 ads link
        amountOfResults = driver.findElement(By.xpath("//div[contains(@class, 'ticket-clear')]"));   //path to ads
        selectNumberOfAds = driver.findElement(By.cssSelector("[data-value='10']"));   //path to ads
    }

    public MainPage SelectTypeofEstate(){
    typeOfEstateDropdown.click();
    typeOfEstate.click();
    return this;
    }
    public int NumberOfElements(){
       String getValue = numberOfAdsToDisplay.getText();
       return Integer.getInteger(getValue);
    }
    public boolean NumberOfAds() {
        return amountOfResults.getSize().equals(NumberOfElements());
    }
    public MainPage ChangeNumberOfAds(){
       numberOfAdsToDisplay.click();
       selectNumberOfAds.click();
   return this;
    }

}
