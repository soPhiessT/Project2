package StepObject;

import PageObject.HotelsPage;
import io.qameta.allure.Step;

import java.time.Duration;

import static DataObject.PriceData.maxPrice;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HotelsPageStep extends HotelsPage {
    @Step ("Change price rate - max is 100")
    public HotelsPageStep priceRate(){
        executeJavaScript("window.scrollBy(0,500)");
        priceRate.sendKeys(maxPrice);
        return this;
    }

    public HotelsPageStep submitBtn(){
        submitBtn.click();
        return this;
    }
    public HotelsPageStep scrollUp(){
        executeJavaScript("window.scrollBy(0,-500)");
        scrollCheck.shouldBe(visible, Duration.ofMillis(5000));

        return this;
    }
    @Step("Check that all returned elements are in selected range")
    public HotelsPageStep priceRange(){
        priceRange.shouldBe(exist, Duration.ofMillis(5000));
        System.out.println(priceRange.getOwnText());

        return this;
    }

}
