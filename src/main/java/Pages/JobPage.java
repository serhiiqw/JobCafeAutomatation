package Pages;

import Consts.Consts;

public class JobPage extends BasePage{
    private static final String JOBS_HEADER = "//*[text()='Jobs']";
    private static final String FIND_JOB_BUTTON = "//a[@id = 3]";
    private static final String LOCATION_FILTER = "//input[@name = 'location']";

    //Navigate to the job page
    public void navigateJobPage(){
        webDriver.get(Consts.HOME_PAGE);
    }

    //Click to the search button
    public void searchButtonClick(){
        findByXpath("//button[text() = 'search']").click();
    }

    //Click to the reset button
    public void resetButtonClick(){
        findByXpath("//button[text() = 'reset']").click();
    }

    //Choose the find job button
    public void findJobButton(){
        findByXpath(FIND_JOB_BUTTON).click();
    }

    //Ensure that we're on the job's page
    public boolean isJobPageHeaderExists(){
        return isElementExists(JOBS_HEADER);
    }

    //Find the location input filter
    public void locationOption(){
        findByXpath(LOCATION_FILTER).click();
    }

    //Send key city
    public void sendLocationCity(String city) {
        sendTextToElement("//input[@name = 'location']", city);
    }

    //Find the position input filter
    public void positionOption(){
        findByXpath("//input[@name = 'position']").click();
    }

    //Send key position
    public void sendPosition(String position) {
        sendTextToElement("//input[@name = 'position']", position);
    }

    //Find the company input filter
    public void companyOption(){
        findByXpath("//input[@name = 'company']").click();
    }

    //Send key company
    public void sendCompany(String company) {
        sendTextToElement("//input[@name = 'company']", company);
    }

}
