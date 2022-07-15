package PageObject;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    public SelenideElement
            registrationBtn = $(".register"),
            businessPerson = $(byXpath("//a[starts-with(@href, '#register-content-2')]")),
            typeOfBusiness = $("#lLegalForm"),
            selectTypeOfBusiness = $(byAttribute("value", "JSC")),
            nameOfBusiness = $("#lName"),
            tax = $("#lTaxCode"),
            datePicker = $("#registred"),
            addressBar = $("#lAddress"),
            countryName = $("#lCountryCode"),
            chooseCountry = $(byAttribute("value", "AF")),
            cityName = $("#lCity"),
            postCode = $("#lPostalCode"),
            webPage = $("#lWebSite"),
            bankOf = $("#lBank"),
            bankAccNum = $("#lBankAccount"),
            personEmail = $("#lContactPersonEmail"),
            personPassword = $("#lContactPersonPassword"),
            personFullName = $("#lContactPersonName"),
            genderInfo = $("#lContactPersonGender"),
            femaleInfo = $(byAttribute("value", "2")),
            bDayPicker = $("#birthday"),
            citizen = $("#lContactPersonCountryCode"),
            citizenValue = $(byAttribute("value", "AX")),
            IdNum = $("#lContactPersonPersonalID"),
            mobNum = $("#lContactPersonPhone");




}
