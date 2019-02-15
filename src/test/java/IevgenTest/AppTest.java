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
    MainPage mainPage = new MainPage();
    @Test
    public void TestOne() {
        mainPage.goTo("https://dom.ria.com/ru/search/");
//        if (mainPage.NumberOfElements()==20){
//            System.out.println("ebtvojumat!");
//        }
//        else{
//            System.out.println("govno");
//        }



    }
}