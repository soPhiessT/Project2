package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RelaxPage {
    public SelenideElement
        goToRelax = $(byXpath("//*[@id=\"body\"]/div[9]/div/div/nav/ul/li[4]"));
}
