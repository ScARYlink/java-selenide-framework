package infomir.firtstest;

import infomir.firtstest.testConfig.BaseTest;
import infomir.firtstest.widgets.FindAdress;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GribbleTest extends BaseTest {

    @Test
    public void createTestTableForNewProduct() {
        FindAdress mainPage = new FindAdress();
        mainPage.open();
        mainPage.setFor("Canada");
    }

}