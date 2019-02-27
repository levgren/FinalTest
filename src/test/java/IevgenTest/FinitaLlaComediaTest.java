package IevgenTest;
import IevgenTest.PageObjects.SideMune;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FinitaLlaComediaTest {
    private MainPage mainPage;
    private SideMune sideMune = new SideMune();

    @BeforeMethod
    public void before() {
        mainPage = new MainPage("https://dom.ria.com/ru/search/");
    }

    @Test
    public void checkNumberOfAds() throws InterruptedException {
        mainPage.SelectTypeofEstate()
                .NumberOfAds();
        mainPage.ChangeNumberOfAds()
                .NumberOfElementsOnThePage();
        mainPage.NumberOfAds();
    }

    @Test
    public void sideMenuParameters() throws InterruptedException {
        sideMune.choseParametrs();

    }


}