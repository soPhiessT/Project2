import DataObject.RegistrationData;
import SQL.InsertDataSQL;
import SQL.SQLSelect;
import SQL.SQLcreateDBnTable;
import StepObject.*;
import Utils.Runner;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.sql.SQLException;

@Epic("three different test methods for the Swoop.Ge")
@Feature("Swoop.Ge Test Automation via DataBase")
@Listeners(Utils.ListenerClass.class)

public class TestClass extends Runner {
    RelaxPageStep relax = new RelaxPageStep();
    SkiAndSnowStep step = new SkiAndSnowStep();
    HotelsPageStep act = new HotelsPageStep();
    FunPageStep Step = new FunPageStep();
    HappyMealPageStep Step1 = new HappyMealPageStep();
    BuyPageStep Step2 = new BuyPageStep();
    RegistrationPageStep Step3 = new RegistrationPageStep();
    SQLSelect data = new SQLSelect();
    SQLcreateDBnTable tbl = new SQLcreateDBnTable();
    InsertDataSQL insert = new InsertDataSQL();

    @BeforeClass
    public void GenerateDataBase() throws SQLException{
        data.SQLSelect();
        tbl.createDB();
        insert.insert();

    }

    @Test (groups = {"Registration1"} )
    @Severity(SeverityLevel.CRITICAL)
    @Description("from the page of REST we go to SkiAndSnow to find a good offer with maximum price = 100 ")
    @Story("this method is to check if the returned elements are in 100 Gel range")
    public void Rest() {
        relax
                .goToRelax();
        step
                .goToSkiAndSnow();
        act
                .priceRate()
                .submitBtn()
                .scrollUp()
                .priceRange();
    }
    @Test (groups = {"Registration1"} )
    @Severity(SeverityLevel.CRITICAL)
    @Description("we need to go to fun page to get the very first offer and after this, we will see all the pictures from the offer")
    @Story("this method is to check if we can see first element and it's all images dynamically")
    public void Fun(){

        Step
                .goToFunPage()
                .getFirst()
                .mainImage()
                .allPics()
                .checkImages();
    }
    @Test (groups = {"Registration2"})
    @Severity(SeverityLevel.MINOR)
    @Description("this method is created to go to food page and get very first offer, buy increased value and register via database")
    @Story("all the mandatory steps are in this method, it contains Registration")
    public void HappyMeal() throws SQLException {



        Step1
                .goToFood()
                .getFirst()
                .increaseCount()
                .quantity()
                .buttonQuantity()
                .clickOnBuy();

        Step2
                .totalQuantity()
                .totalPrice()
                .clickOnBuy();

        Step3
                .registrationBtn()
                .businessPerson()
                .typeOfBusiness()
                .nameOfBusiness()
                .tax()
                .datePicker()
                .addressBar(data.address)
                .countryName()
                .cityName(data.city)
                .postCode(data.zip)
                .webPage()
                .bankOf()
                .bankAccNum()
                .personEmail(data.email)
                .personPassword(data.password)
                .personFullName(data.firstName + data.lastName)
                .genderInfo()
                .bDayPicker()
                .citizen()
                .IdNum()
                .mobNum(data.phone);

    }

}
