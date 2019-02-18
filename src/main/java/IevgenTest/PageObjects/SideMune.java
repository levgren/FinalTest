package IevgenTest.PageObjects;

import IevgenTest.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideMune {
    static WebDriver driver = Driver.get();

private WebElement typeOfEstateDropdown;
private WebElement typeOfEstate;
private WebElement cityDropDown;
private WebElement citySelect;
private WebElement areaOfCity;
private WebElement area1;
private WebElement area2;
private WebElement area3;
private WebElement selectButton;
private WebElement numberOfRooms;
private WebElement areaOfEstate;
private WebElement areaOfLand;
private WebElement priceOfEstate;

    public SideMune(String url) {
        typeOfEstateDropdown = driver.findElement(By.cssSelector("#leftFilter .box-panel:nth-child(5) .css-pseudoselect"));
        typeOfEstate = driver.findElement(By.cssSelector("#leftFilter .options .catType:nth-of-type(2)"));
        cityDropDown = driver.findElement(By.id("autocompleteSearch"));
        citySelect = driver.findElement(By.cssSelector("[title='Винница']"));
        areaOfCity = driver.findElement(By.id("pseudomodalRegion"));        //Районы города
        area1 = driver.findElement(By.xpath("//div[@id='leftFilterDistricts']/div[1]/div[5]/label[.='Вишенка']"));     //Вишенка
        area2 = driver.findElement(By.xpath("//div[@id='leftFilterDistricts']/div[2]/div[4]/label[.='Зарванцы']"));     //Зарванцы
        area3 = driver.findElement(By.xpath("//div[@id='leftFilterDistricts']/div[3]/div[2]/label[.='Березина']"));    //Шкуринцы
        selectButton = driver.findElement(By.xpath("/html//div[@id='pseudomodalRegion']//label[.='Выбрать']"));  //жмем кнопочку "Выбрать"
        numberOfRooms = driver.findElement(By.xpath("//*[@id=\"roomsCountBtns\"]/span/label[4]"));    //Количество комнат
        areaOfEstate = driver.findElement(By.xpath("/html//div[@id='additional_characteristics']/div[3]/p[1]/span[1]//input[@name='characteristic[215][from]']"));   // площадь дома, пишем от 100м2
        areaOfLand = driver.findElement(By.xpath("/html//div[@id='additional_characteristics']/div[4]/p[1]/span//input[@name='characteristic[219][to]']"));    // площадь участка до 6 соток
        priceOfEstate = driver.findElement(By.xpath("/html//div[@id='additional_characteristics']/div[9]/p[1]/span//input[@name='characteristic[234][to]']"));    // цена до 100000


    }
}