package IevgenTest;

import io.qameta.allure.Allure;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    MainPage mainPage = new MainPage("https://dom.ria.com/ru/search/");

    @Test
    public void TestOne() {
        boolean x = mainPage.SelectTypeofEstate()
                .NumberOfAds();
        assert (x);
        mainPage.ChangeNumberOfAds();




    }
}