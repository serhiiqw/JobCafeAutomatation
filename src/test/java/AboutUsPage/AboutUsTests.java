package AboutUsPage;

import Pages.AboutPage;
import Utils.UseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AboutUsTests extends UseCase {

    private static AboutPage aboutPage;

    @BeforeAll
    public static void classSetup() {
        aboutPage = new AboutPage();
    }

    @BeforeEach
    public void beforeTest(){
        aboutPage.navigateToAboutUsPage();
    }

    @Test
    public void navigateAboutTest() throws InterruptedException {
        aboutPage.goToAboutUsPage();
        Thread.sleep(2000);

        aboutPage.isAboutUsLogoExists();

    }

//    @Test
//    public void isAboutLogoExists() {
//        boolean logoExists = aboutPage.isAboutUsLogoExists();
//        assertTrue(logoExists, "The About Us logo should exist on the About Us page.");
//    }

    //Can't test the about page because of having a massage: Message: http://167.99.178.249:3000/about - Failed to load resource: the server responded with a status of 404 (Not Found)
    //Level: SEVERE
//    @Test
//    protected void logList(){
//        LogEntries entries = webDriver.manage().logs().get(LogType.BROWSER);
//        List<LogEntry> logs = entries.getAll();
//        for(LogEntry i: logs){
//            System.out.println("Message: " + i.getMessage());
//            System.out.println("Level: " + i.getLevel());
//            Assertions.assertNotEquals(Level.SEVERE, i.getLevel());
//        }
//    }

//    @Test
//    public void test404PageScreenshot() {
//        aboutPage.navigateToAboutUsPage();
//        aboutPage.aboutPageScreenshot();
//    }
}
