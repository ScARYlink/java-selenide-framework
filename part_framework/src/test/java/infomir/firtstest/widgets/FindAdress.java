package infomir.firtstest.widgets;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FindAdress {
    public void open() {
        Selenide.open("/");
    }

    public void setFor(String selectCountry) {
        $(".where_to_buy_link").click();
        new Dialog()
                .setFor("Select country:", selectCountry)
                .submit();
    }
}
