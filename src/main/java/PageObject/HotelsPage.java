package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HotelsPage {
    public SelenideElement
            priceRate = $$(byName("maxprice")).filter(visible).get(0),
            submitBtn = $$(byText("ძებნა")).filter(visible).get(0),
            //relaxPage = $(By.xpath("//*[@id=\"body\"]/div[9]/div/div/nav/ul/li[4]")),

            priceRange = $(By.xpath("//div[@class='special-offer']//div[@class='discounted-prices']//p[1]")),
            scrollCheck = $(".category-menu-icon");







}
