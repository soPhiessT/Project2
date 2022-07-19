package Utils;
import SQL.SQLConnection;
import SQL.SQLcreateDBnTable;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;


import static com.codeborne.selenide.Selenide.*;

public class Runner {
    @BeforeTest
    public static void setup(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1928x1033";
        open("https://www.swoop.ge/");
        Configuration.reopenBrowserOnFail = true;



    }

}