package Pages;

import DataReaders.PropertiesFileReader;
import PagesBase.PageObjectBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends PageObjectBase {

    private By currentCountryBtnBy = By.xpath("//a[@id='country-btn']");
    private By countryNameBy = By.id("country-name");
    private By egyptBtnBy = By.id("eg");
    private By uaeBtnBy = By.id("ae");
    private By algeriaBtnBy = By.id("dz");
    private By litePackageBy = By.id("name-lite");
    private By classicPackageBy = By.id("name-classic");
    private By premiumPackageBy = By.id("name-premium");
    private By litePackagePriceBy = By.xpath("//div[@id='currency-lite']/b");
    private By classicPackagePriceBy = By.xpath("//div[@id='currency-classic']/b");
    private By premiumPackagePriceBy = By.xpath("//div[@id='currency-premium']/b");
    private By litePackagePriceUnitBy = By.xpath("//div[@id='currency-lite']/i");
    private By classicPackagePriceUnitBy = By.xpath("//div[@id='currency-classic']/i");
    private By premiumPackagePriceUnitBy = By.xpath("//div[@id='currency-classic']/i");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnCurrentCountryBtn(){
        clickOnElement(currentCountryBtnBy);
    }

    public void selectEgyptAsCountry() {
        clickOnElement(egyptBtnBy);
        waitForElement(findAnElement(countryNameBy));
        Assert.assertEquals(getTextFromElement(findAnElement(countryNameBy)
        ), PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                , "HomePage_EgyptCurrentCountry"));

    }

    public void selectUAEAsCountry()
    {
        clickOnElement(uaeBtnBy);
        waitForElement(findAnElement(countryNameBy));
        Assert.assertEquals(getTextFromElement(findAnElement(countryNameBy)
        ), PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                , "HomePage_UAECurrentCountry"));
    }

     public void selectAlgeriaAsCountry(){
                clickOnElement(algeriaBtnBy);
                waitForElement(findAnElement(countryNameBy));
                waitForElement(findAnElement(countryNameBy));
                Assert.assertEquals(getTextFromElement(findAnElement(countryNameBy)
                ), PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        , "HomePage_AlgeriaCurrentCountry"));
        }

     public String verifyLitePackage(){
         return getTextFromElement(findAnElement(litePackageBy));
     }

     public String verifyClassicPackage(){
        return getTextFromElement(findAnElement(classicPackageBy));
     }

    public String verifyPremiumPackage(){
        return getTextFromElement(findAnElement(premiumPackageBy));
    }

    public String verifyLitePackage_Price(){
        return getTextFromElement(findAnElement(litePackagePriceBy));
    }
    public String verifyClassicPackage_Price(){
        return getTextFromElement(findAnElement(classicPackagePriceBy));
    }
    public String verifyPremiumPackage_Price(){
        return getTextFromElement(findAnElement(premiumPackagePriceBy));
    }

    public String verifyLitePackage_PriceUnit(){
      return  getTextFromElement(findAnElement(litePackagePriceUnitBy));
    }

    public String verifyClassicPackage_PriceUnit(){
        return  getTextFromElement(findAnElement(classicPackagePriceUnitBy));
    }

    public String verifyPremiumPackage_PriceUnit(){
        return  getTextFromElement(findAnElement(litePackagePriceUnitBy));
    }
}

