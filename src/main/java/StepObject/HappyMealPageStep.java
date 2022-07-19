package StepObject;

import PageObject.HappyMealPage;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HappyMealPageStep extends HappyMealPage {
    SoftAssert softAssert = new SoftAssert();
    @Step("Go to <<კვება>>")
    public HappyMealPageStep goToFood(){
        goToFood.click();
        return this;
    }
    @Step("Click on first returned element")
    public HappyMealPageStep getFirst(){
        getFirst.click();
        return this;
    }
    @Step("Increase item count by 1")
    public HappyMealPageStep increaseCount(){
        increaseCount.click();
        return this;
    }
    @Step("check that total amount")
    public HappyMealPageStep quantity(){
        System.out.println(quantity.getValue());
        return this;
    }
    @Step("check that total amount, which is visible on <<ყიდვა>> button is correct")
    public HappyMealPageStep buttonQuantity(){
        System.out.println(buttonQuantity.getOwnText());
        return this;
    }
    @Step("Click on <<ყიდვა>> button")
    public HappyMealPageStep clickOnBuy(){
        buyButton.click();
        return this;
    }


}
