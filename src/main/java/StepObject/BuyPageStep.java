package StepObject;

import PageObject.BuyPage;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class BuyPageStep extends BuyPage{
    public BuyPageStep totalQuantity(){
        System.out.println(totalQuantity.getOwnText());
        return this;
    }
    public BuyPageStep totalPrice(){
        System.out.println(totalPrice.getOwnText());
        return this;
    }
    public BuyPageStep clickOnBuy(){
        executeJavaScript("arguments[0].click();", finalBuy);
        return this;
    }
}
