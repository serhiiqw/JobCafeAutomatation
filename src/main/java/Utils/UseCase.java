package Utils;

import Pages.BasePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

//Main test which will help all tests
public class UseCase {
public static WebDriver webDriver;
private static BasePage page;

    //All tests will do before all and after
    @BeforeAll
    public static void setupMain(){
    page = new BasePage();
    webDriver = SharedDriver.getWebDriver();
    page.setWebDriver(webDriver);
    }

    @AfterAll
    public static void closeDownMain(){
    SharedDriver.closeWebDriver();
    webDriver=null;
    }
}
