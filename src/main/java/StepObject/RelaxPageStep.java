package StepObject;

import PageObject.RelaxPage;
import io.qameta.allure.Step;

public class RelaxPageStep extends RelaxPage {
    @Step("Go to <<დასვენება>>")
    public RelaxPageStep goToRelax(){
        goToRelax.hover();
        return this;
    }

}
