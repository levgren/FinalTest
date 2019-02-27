package IevgenTest.PageObjects;

import IevgenTest.Driver;
import IevgenTest.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SideMune  {
    static WebDriver driver = Driver.get();

    private By typeOfEstateDropdown;
    private By typeOfEstate;
    private By cityDropDown;
    private By citySelect;
    private By areaOfCity;
    private By area1;
    private By area2;
    private By area3;
    private By selectButton;
    private By numberOfRooms;
    private By areaOfEstate;
    private By areaOfLand;
    private By priceOfEstate;

    public SideMune() {
        typeOfEstateDropdown = By.cssSelector("#leftFilter .box-panel:nth-child(5) .css-pseudoselect");
        typeOfEstate = By.cssSelector("#leftFilter .options .catType:nth-of-type(2)");
        cityDropDown = By.cssSelector(".twitter-typeahead");
        citySelect = By.cssSelector("[title='Винница']");
        areaOfCity = By.id("pseudomodalRegion");        //Районы города
        area1 = By.xpath("//div[@id='leftFilterDistricts']/div[1]/div[5]/label[.='Вишенка']");     //Вишенка
        area2 = By.xpath("//div[@id='leftFilterDistricts']/div[2]/div[4]/label[.='Зарванцы']");     //Зарванцы
        area3 = By.xpath("//div[@id='leftFilterDistricts']/div[3]/div[2]/label[.='Березина']");    //Шкуринцы
        selectButton = By.xpath("/html//div[@id='pseudomodalRegion']//label[.='Выбрать']");  //жмем кнопочку "Выбрать"
        numberOfRooms = By.xpath("//*[@id=\"roomsCountBtns\"]/span/label[4]");    //Количество комнат
        areaOfEstate = By.cssSelector(".characteristic_215_from");   // площадь дома, пишем от 100м2
        areaOfLand = By.xpath("//input[@name='characteristic[219][to]']");    // площадь участка до 6 соток
        priceOfEstate = By.xpath("//input[@name='characteristic[234][to]']");    // цена до 100000
    }

    public SideMune choseParametrs() throws InterruptedException {
        driver.findElement(typeOfEstateDropdown).click();
        driver.findElement(typeOfEstate).click();
        driver.findElement(cityDropDown).click();
        driver.findElement(citySelect).click();
        Thread.sleep(3000);
        driver.findElement(areaOfCity).click();
        driver.findElement(area1).click();
        driver.findElement(area2).click();
        driver.findElement(area3).click();
        Thread.sleep(3000);
        driver.findElement(selectButton).click();
        driver.findElement(numberOfRooms).click();
        driver.findElement(areaOfEstate).sendKeys("100");
        driver.findElement(areaOfLand).sendKeys("10");
        driver.findElement(priceOfEstate).sendKeys("100000");
        return this;
    }
}