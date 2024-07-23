package Pages;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.logging.Level;

public class BasePage {

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    //Set web driver which will be extended from shared driver and use case base
    public void setWebDriver(WebDriver webDriver){
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(3));
    }

    //Create a method find element by xpath; made it protected; will able to use in Pages package
    protected WebElement findByXpath(String xpath){
        WebElement element;
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
        element = webDriver.findElement(By.xpath(xpath));
        return element;
    }

    //Create a method click an element which is found by xpath
    protected void clickByXpath(String xpath){
        findByXpath(xpath).click();
    }

    //Create a method send text
    protected void sendTextToElement(String xpath, String text){
        findByXpath(xpath).sendKeys(text);
    }

    //Create a method which will help to be sure that an element exists
    protected boolean isElementExists(String xpath){
        try{
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
            return webDriver.findElement(By.xpath(xpath)).isDisplayed();
        }
        catch (Exception error){
            return false;
        }
    }

    //Check if a browser has a severe errors in logs
    protected void logList(){
        LogEntries entries = webDriver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> logs = entries.getAll();
        for(LogEntry i: logs){
            System.out.println("Message: " + i.getMessage());
            System.out.println("Level: " + i.getLevel());
            Assertions.assertNotEquals(Level.SEVERE, i.getLevel());
        }
    }

    //Check size of element and compare
    public void sizeOfElement(String xpath, int expectedHeight, int expectedWidth){
        WebElement element = webDriver.findElement(By.xpath(xpath));
        int actualHeight = element.getRect().getDimension().getHeight();
        int actualWidth = element.getRect().getDimension().getWidth();
        System.out.println("Real size : " + actualHeight + "x" + actualWidth);

        if(actualHeight == expectedHeight && actualWidth == expectedWidth){
            System.out.println("The size is correct: " + actualHeight + "x" + actualWidth);
        }else{
            System.out.println("The size is incorrect. Expected: " + expectedHeight + "x" + expectedWidth);
        }
    }

    public void takeScreenshot(String name) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationalFile = new File("Screenshots/" + name + ".png");
        FileUtils.copyFile(file, destinationalFile);
    }

}
