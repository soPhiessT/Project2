package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FunPage {
    public SelenideElement
            goToFunPage = $(byAttribute("href", "/category/4/gasartobi-centrebi")),
            getFirst = $(".special-offer", 0),
            mainImage = $(".col-6.main-img"),
            nextImg = $(".lb-next"),
            checkImg = $(".lb-number");
    public ElementsCollection

            nextButton = $$(byXpath("//a[contains(@href, 'https://cdn.swoop.ge/ImagesStorage/')]"));



}
