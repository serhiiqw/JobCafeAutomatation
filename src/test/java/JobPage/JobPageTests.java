package JobPage;

import Pages.JobPage;
import Utils.UseCase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class JobPageTests extends UseCase {
    private static JobPage jobPage;

    @BeforeAll
    public static void classSetup() {
        jobPage = new JobPage();
    }

    @BeforeEach
    public void beforeTest() {
        jobPage.navigateJobPage();
    }

    @Test
    public void goJobPageTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(2000);

        jobPage.isJobPageHeaderExists();
    }

    @Test
    public void sendTextTorontoTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(1000);

        jobPage.locationOption();
        Thread.sleep(1000);

        jobPage.sendLocationCity("Toronto");
        jobPage.searchButtonClick();
        Thread.sleep(2000);
    }

    @Test
    public void sendTextTelAvivTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(1000);

        jobPage.locationOption();
        Thread.sleep(1000);

        jobPage.sendLocationCity("Tel-Aviv");
        jobPage.searchButtonClick();
        Thread.sleep(2000);
    }

    @Test
    public void sendTextChicagoTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(1000);

        jobPage.locationOption();
        Thread.sleep(1000);

        jobPage.sendLocationCity("Chicago");
        jobPage.searchButtonClick();
        Thread.sleep(2000);
    }

    @Test
    public void sendTextNewYorkTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(1000);

        jobPage.locationOption();
        Thread.sleep(1000);

        jobPage.sendLocationCity("New-York");
        jobPage.searchButtonClick();
        Thread.sleep(2000);
    }

    @Test
    public void sendTextQaTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(1000);

        jobPage.positionOption();
        Thread.sleep(1000);

        jobPage.sendPosition("QA");
        Thread.sleep(2000);
    }

    @Test
    public void sendTextDeveloperTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(1000);

        jobPage.positionOption();
        Thread.sleep(1000);

        jobPage.sendPosition("Developer");
        Thread.sleep(2000);
    }

    @Test
    public void sendTextProjectManagerTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(1000);

        jobPage.positionOption();
        Thread.sleep(1000);

        jobPage.sendPosition("Project Manager");
        Thread.sleep(2000);
    }

    @Test
    public void sendTextAppleTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(1000);

        jobPage.companyOption();
        Thread.sleep(1000);

        jobPage.sendCompany("Apple");
        Thread.sleep(2000);
    }

    @Test
    public void sendTextFacebookTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(1000);

        jobPage.companyOption();
        Thread.sleep(1000);

        jobPage.sendCompany("Facebook");
        Thread.sleep(2000);
    }

    @Test
    public void sendTextGoogleTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(1000);

        jobPage.companyOption();
        Thread.sleep(1000);

        jobPage.sendCompany("Google");
        Thread.sleep(2000);
    }

    @Test
    public void combinedSearchTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(1000);

        jobPage.positionOption();

        jobPage.sendPosition("Project Manager");

        jobPage.locationOption();

        jobPage.sendLocationCity("USA");

        jobPage.companyOption();

        jobPage.sendCompany("Google ");

        jobPage.searchButtonClick();
        Thread.sleep(1000);
    }

    @Test
    public void noResultTest() throws InterruptedException, IOException {
        jobPage.findJobButton();
        jobPage.positionOption();

        jobPage.sendPosition("adsasas");
        jobPage.searchButtonClick();
        Thread.sleep(2000);

        jobPage.takeScreenshot("no result");
    }

    @Test
    public void resetTest() throws InterruptedException {
        jobPage.findJobButton();
        Thread.sleep(1000);

        jobPage.positionOption();

        jobPage.sendPosition("Project Manager");

        jobPage.locationOption();

        jobPage.sendLocationCity("USA");

        jobPage.companyOption();

        jobPage.sendCompany("Google ");
        jobPage.searchButtonClick();
        Thread.sleep(2000);
        jobPage.resetButtonClick();
        Thread.sleep(2000);
    }


//    @ParameterizedTest
//    @ValueSource(strings = {"Toronto", "Tel-Aviv", "Chicago", "New-York"})
//    public void citiesTests(String city) throws InterruptedException {
//        jobPage.findJobButton();
//        Thread.sleep(2000);
//
//        jobPage.locationOption();
//        jobPage.sendLocation(city);
//    }



}

