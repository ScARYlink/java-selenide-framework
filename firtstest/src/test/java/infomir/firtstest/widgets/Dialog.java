package infomir.firtstest.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class Dialog {
    private SelenideElement container = $(".sales_department_modal");

    public Dialog setFor(String label, String value) {
        container.$(withText(label)).parent().find("input"); //OR .find(byXpath("./following-sibling::*/input"));
        $("#llencountries").setValue(value);
        return this;
    }

    public void submit() {
        $(".c-dropdown").find(".c-marker").click();
    }
}
