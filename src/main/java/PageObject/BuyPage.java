package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BuyPage {
    public SelenideElement
            totalQuantity = $("#basket_item_count"),
            totalPrice = $("#basket-total-amount"),
            finalBuy = $(byAttribute("href", "javascript:void(0)"));

}
