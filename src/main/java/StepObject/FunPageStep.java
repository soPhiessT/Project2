package StepObject;

import PageObject.FunPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class FunPageStep extends FunPage {
    @Step("Go to <<გართობა>>")
    public FunPageStep goToFunPage(){
        goToFunPage.shouldBe(Condition.enabled, Duration.ofMillis(3000)).click();
        return this;
    }
    @Step("Click on first returned element")
    public FunPageStep getFirst(){
        getFirst.click();
        return this;
    }
    @Step("Click on first image")
    public FunPageStep mainImage(){
        mainImage.click();
        return this;
    }
    @Step("move on another images until you meet the last image")
    public FunPageStep allPics(){
        int count = nextButton.size()-1;
        System.out.println(count + "++++++");
        for (int j = 0; j < count; j++) {
            nextImg.click();
        }
        return this;
    }
    @Step("Identify last image with text <<Image n of n>>")
    public FunPageStep checkImages(){
        System.out.println(checkImg.getOwnText());
        return this;
    }
}
