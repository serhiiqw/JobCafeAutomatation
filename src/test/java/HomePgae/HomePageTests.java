package HomePgae;
import static org.junit.jupiter.api.Assertions.*;
import Pages.BasePage;
import Pages.HomePage;
import Utils.UseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.text.StyledEditorKit;

public class HomePageTests extends UseCase {
    private static HomePage homePage;

    @BeforeAll
    public static void classSetup(){
        homePage = new HomePage();
    }

    @BeforeEach
    public void beforeTest(){
        homePage.navigateHomePage();
    }

    @Test
    public void loadHomePageTest(){
        Boolean homeLogo = homePage.isMainLogoExists();
        assertTrue(homeLogo);
    }

    @Test
    public void allButtonsTest(){
        Boolean aboutUsButtonExists = homePage.isAboutUsButtonExists();
        assertTrue(aboutUsButtonExists);

        Boolean postJobButtons = homePage.isPostJobButtonExists();
        assertTrue(postJobButtons);

        Boolean findJobButton = homePage.isFindJobButtonExists();
        assertTrue(findJobButton);

        Boolean loginButton = homePage.isLoginButtonExists();
        assertTrue(loginButton);
    }

    @Test
    public void sizeMainLogoTest(){
        homePage.sizeMainLogo();
    }

    @Test
    public void aboutUsPageTest() throws InterruptedException {
        homePage.clickAboutUsButton();
        Thread.sleep(1000);
        homePage.isAboutUsLogoExists();
    }

    @Test
    public void findJobButtonTest() throws InterruptedException {
        homePage.findJobButton();
        Thread.sleep(2000);
    }

}
