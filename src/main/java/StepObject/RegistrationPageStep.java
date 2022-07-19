package StepObject;

import DataObject.RegistrationData;
import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.util.Random;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPageStep extends RegistrationPage implements RegistrationData {
    Random rnd = new Random();
    @Step("Register for new account")
    public RegistrationPageStep registrationBtn(){
        executeJavaScript("arguments[0].click();", registrationBtn);
        return this;
    }
    @Step("Choose <<იურიდიული პირი>>")
    public RegistrationPageStep businessPerson(){
       // executeJavaScript("arguments[0].click();", businessPerson);
        businessPerson.click();
        return this;
    }
    @Step("")
    public RegistrationPageStep typeOfBusiness(){
        typeOfBusiness.click();
        selectTypeOfBusiness.should(Condition.exist).setSelected(true).click();
        return this;
    }
    public RegistrationPageStep nameOfBusiness(){
        nameOfBusiness.sendKeys(nameOfLTD);
        return this;
    }
    public RegistrationPageStep tax(){
        int number = rnd.nextInt(999999);
        String taxes = String.valueOf(number);
        tax.sendKeys(taxes);
        return this;
    }
    public RegistrationPageStep datePicker(){
        datePicker.sendKeys(registrationDay);
        return this;
    }
    public RegistrationPageStep addressBar(String value){

        executeJavaScript("window.scrollBy(0,200)");
        addressBar.sendKeys(address);
        return this;
    }
    public RegistrationPageStep countryName(){
        countryName.click();
        chooseCountry.shouldBe(Condition.visible).click();
        return this;
    }
    public RegistrationPageStep cityName(String value){
        cityName.sendKeys(city);
        return this;
    }
    public RegistrationPageStep postCode(String value){
        postCode.sendKeys(zip);
        return this;
    }
    public RegistrationPageStep webPage(){
        webPage.sendKeys(website);
        return this;
    }
    public RegistrationPageStep bankOf(){
        bankOf.sendKeys(myBank);
        executeJavaScript("window.scrollBy(0,200)");
        return this;
    }
    public RegistrationPageStep bankAccNum(){
        int bankAcc = rnd.nextInt(999999999);
        String BankAcc = String.valueOf(bankAcc);
        bankAccNum.sendKeys(BankAccFirst + BankAcc);
        return this;
    }
    public RegistrationPageStep personEmail(String value){
        int numbers = rnd.nextInt(99999);
        String BankAcc = String.valueOf(numbers);
        personEmail.sendKeys(numbers + email);
        return this;
    }
    public RegistrationPageStep personPassword(String value){
        personPassword.sendKeys(password);
        return this;
    }
    public RegistrationPageStep personFullName(String value){
        personFullName.sendKeys(firstName + lastName);
        return this;
    }
    public RegistrationPageStep genderInfo(){
        genderInfo.selectOption(1);
        executeJavaScript("window.scrollBy(0,200)");
        //femaleInfo.should(Condition.exist).click();
        return this;
    }
    public RegistrationPageStep bDayPicker(){
        bDayPicker.sendKeys(birthdayValue);
        executeJavaScript("window.scrollBy(0,500)");
        return this;
    }
    public RegistrationPageStep citizen(){
        citizen.click();
        citizenValue.should(Condition.exist).setSelected(true).click();
        return this;
    }
    public RegistrationPageStep IdNum(){
        int id = rnd.nextInt(999999999);
        String BankAcc = String.valueOf(id);
        IdNum.sendKeys(identifyNum + BankAcc);
        return this;
    }
    public RegistrationPageStep mobNum(String value){
        mobNum.sendKeys(phone);
        return this;
    }












}
