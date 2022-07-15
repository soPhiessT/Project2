package PageObject;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SkiNSnowPage {
    public SelenideElement
    goToSkiAndSnow = $(byXpath("//a[starts-with(@href, '/category/805/Ski--Snow')]"));
}
