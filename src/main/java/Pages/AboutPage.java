package Pages;

import Consts.Consts;

import java.io.IOException;

public class AboutPage extends BasePage{
    private static final String LOGO_ABOUT_US_PAGE = "//img[@class='img-fluid']";
    private static final String ABOUT_US_LOGO = "//img[@src='/img/about.jpg']";
    private static final String ABOUT_US_BUTTON = "//*[@name='About Us']";

    //Navigate to about us page
    public void navigateToAboutUsPage(){
        webDriver.get(Consts.HOME_PAGE);
    }

    //Click about us button
    public void goToAboutUsPage(){
        findByXpath(ABOUT_US_BUTTON).click();
    }

    //Ensure that about us page opened by findening the logo
    public boolean isAboutUsLogoExists(){
        return isElementExists(ABOUT_US_LOGO);
    }

    //Can't test the about page.
    //The page has 404 Error
    //Create a method to take a screenshot
//    public void aboutPageScreenshot(){
//        try {
//            takeScreenshot("About Page");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

}
