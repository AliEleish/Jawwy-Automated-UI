package PagesBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObjectBase {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public void clickOnElement(By locator){
        driver.findElement(locator).click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public WebElement findAnElement(By locator){
        return driver.findElement(locator);
    }

    public String getTextFromElement(WebElement element){
        return element.getText();
    }

    public void waitForElement(WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }




}
