package IevgenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage  {
    static WebDriver driver = Driver.get();

    private WebElement typeOfEstateDropdown;
    private WebElement typeOfEstate;
    private WebElement numberOfAdsToDisplay;
    private List <WebElement> results;
    private WebElement dropDown;
    private WebElement selectNumberOfAds;

    public MainPage() {
    }


    public MainPage goTo(String url) {
        driver.get(url);
        return this;
    }
    public MainPage(String url) {
        driver.get(url);
        typeOfEstateDropdown = driver.findElement(By.cssSelector("#leftFilter .box-panel:nth-child(5) .css-pseudoselect"));
        typeOfEstate = driver.findElement(By.cssSelector("#leftFilter .options .catType:nth-of-type(2)"));
        numberOfAdsToDisplay = driver.findElement(By.xpath("/html//div[@id='pagination']//a[.='20 объявлений']"));  //show 20 ads link
        results = driver.findElements(By.xpath("//div[contains(@class, 'ticket-clear')]"));   //path to ads
        selectNumberOfAds = driver.findElement(By.cssSelector("[data-value='10']"));   //path to ads

    }

    public MainPage SelectTypeofEstate(){
    typeOfEstateDropdown.click();
    typeOfEstate.click();
    return this;
    }
    public Integer NumberOfElementsOnThePage(){
       String getValue = numberOfAdsToDisplay.getText();
        return Utils.substringInt(getValue);

    }
    public int NumberOfAds() {
       return results.size();
    }
    public MainPage ChangeNumberOfAds() throws InterruptedException {
        Thread.sleep(5000);
        JavascriptExecutor scroll = ((JavascriptExecutor) driver);
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");     //скроллим вниз страницы
       numberOfAdsToDisplay.click();
        System.out.println("click the link 'number of ads'");
       selectNumberOfAds.click();
        System.out.println("select number of ads to display");
        return this;
    }






}
