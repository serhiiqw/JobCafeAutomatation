package Pages;
import Consts.Consts;

public class HomePage extends BasePage {

    //Main logo on the home page
    private static final String MAIN_LOGO = "//img[@alt='coming soon']";
    private static final String ABOUT_US_BUTTON = "//*[@name='About Us']";
    private static final String POST_JOB_BUTTON = "//*[@name='Post Job']";
    private static final String FIND_JOB_BUTTON = "//a[@id = 3]";
    private static final String LOGIN_BUTTON = "//*[@name='Log in/Register']";
    private static final String LOGO_ABOUT_US_PAGE = "//img[@class='img-fluid']";

    //Navigate to home page
    public void navigateHomePage(){
        webDriver.get(Consts.HOME_PAGE);
    }

    //Check if main logo exists
    public boolean isMainLogoExists(){
        return isElementExists(MAIN_LOGO);
    }


    //Check if the home page has all buttons (About us, Post job, Find job, Log in)
    public boolean isAboutUsButtonExists(){
        return isElementExists(ABOUT_US_BUTTON);
    }
    public boolean isPostJobButtonExists(){
        return isElementExists(POST_JOB_BUTTON);
    }
    public boolean isFindJobButtonExists(){
        return isElementExists(FIND_JOB_BUTTON);
    }
    public boolean isLoginButtonExists(){
        return isElementExists(LOGIN_BUTTON);
    }


    // The size of logo is 799x1296 and we can check size and compare
    public void sizeMainLogo(){
        sizeOfElement(MAIN_LOGO, 799, 1296);

    }
    //Click on the about us menu button
    public void clickAboutUsButton(){
        clickByXpath(ABOUT_US_BUTTON);
    }

    //Ensure that about us page opened by findening the logo
    public boolean isAboutUsLogoExists(){
        return isElementExists(LOGO_ABOUT_US_PAGE);
    }

    //Choose the find job button
    public void findJobButton(){
        findByXpath(FIND_JOB_BUTTON).click();
    }
}
