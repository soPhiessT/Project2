package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HappyMealPage {
    public SelenideElement
            goToFood = $(byAttribute("href", "/category/15/restornebi-da-barebi")),
            getFirst = $(".special-offer", 0),
            increaseCount = $(byAttribute("src", "/Images/NewDesigneImg/additional-icons/plus.png")),
            quantity = $(".recommended-product__input"),
            buttonQuantity = $(".details-voucher-price"),
            buyButton = $(".checkout__button");
}
