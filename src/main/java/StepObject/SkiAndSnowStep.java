package StepObject;

import PageObject.SkiNSnowPage;
import io.qameta.allure.Step;

public class SkiAndSnowStep extends SkiNSnowPage {
    @Step("Choose <<Ski&Snow>>")
    public SkiAndSnowStep goToSkiAndSnow(){
        goToSkiAndSnow.click();
        return this;
    }
}
