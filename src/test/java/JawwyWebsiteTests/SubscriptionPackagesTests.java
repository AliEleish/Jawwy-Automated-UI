package JawwyWebsiteTests;

import DataReaders.PropertiesFileReader;
import DataWriters.NotepadWriter;
import Pages.HomePage;
import TestBase.WebTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscriptionPackagesTests extends WebTestBase {

    @Test
    public void validateSubscriptionPackagesForEgypt(){
        homePageObj = new HomePage(driver);
        homePageObj.clickOnCurrentCountryBtn();
        homePageObj.selectEgyptAsCountry();
        Assert.assertEquals(homePageObj.verifyLitePackage()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        , "LitePackage"));
        Assert.assertEquals(homePageObj.verifyClassicPackage()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                , "ClassicPackage"));
        Assert.assertEquals(homePageObj.verifyPremiumPackage()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                , "PremiumPackage"));
        Assert.assertEquals(homePageObj.verifyLitePackage_Price()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                , "Egypt_LitePackage_Price"));
        Assert.assertEquals(homePageObj.verifyClassicPackage_Price()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                , "Egypt_ClassicPackage_Price"));
        Assert.assertEquals(homePageObj.verifyPremiumPackage_Price()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        , "Egypt_PremiumPackage_Price"));
        Assert.assertEquals(homePageObj.verifyLitePackage_PriceUnit()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                , "Packages_UnitPrice"));
        Assert.assertEquals(homePageObj.verifyClassicPackage_PriceUnit()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        , "Packages_UnitPrice"));
        Assert.assertEquals(homePageObj.verifyPremiumPackage_PriceUnit()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        , "Packages_UnitPrice"));
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyLitePackage());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyClassicPackage());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyPremiumPackage());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyLitePackage_Price());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyClassicPackage_Price());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyPremiumPackage_Price());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyLitePackage_PriceUnit());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyClassicPackage_PriceUnit());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyPremiumPackage_PriceUnit());

    }

    @Test
    public void validateSubscriptionPackagesForUAE(){
        homePageObj = new HomePage(driver);
        homePageObj.clickOnCurrentCountryBtn();
        homePageObj.selectUAEAsCountry();
        Assert.assertEquals(homePageObj.verifyLitePackage()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        ,"LitePackage"));
        Assert.assertEquals(homePageObj.verifyClassicPackage()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        ,"ClassicPackage"));
        Assert.assertEquals(homePageObj.verifyPremiumPackage()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        ,"PremiumPackage"));
        Assert.assertEquals(homePageObj.verifyLitePackage_Price()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        ,"UAE_LitePackage_Price"));
        Assert.assertEquals(homePageObj.verifyClassicPackage_Price()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        ,"UAE_ClassicPackage_Price"));
        Assert.assertEquals(homePageObj.verifyPremiumPackage_Price()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        ,"UAE_PremiumPackage_Price"));
        Assert.assertEquals(homePageObj.verifyLitePackage_PriceUnit()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        , "Packages_UnitPrice"));
        Assert.assertEquals(homePageObj.verifyClassicPackage_PriceUnit()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        , "Packages_UnitPrice"));
        Assert.assertEquals(homePageObj.verifyPremiumPackage_PriceUnit()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        , "Packages_UnitPrice"));
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyLitePackage());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyClassicPackage());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyPremiumPackage());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyLitePackage_Price());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyClassicPackage_Price());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyPremiumPackage_Price());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyLitePackage_PriceUnit());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyClassicPackage_PriceUnit());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyPremiumPackage_PriceUnit());
    }

    @Test
    public void validateSubscriptionPackagesForAlgeria(){
        homePageObj = new HomePage(driver);
        homePageObj.clickOnCurrentCountryBtn();
        homePageObj.selectAlgeriaAsCountry();
        Assert.assertEquals(homePageObj.verifyLitePackage()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        ,"LitePackage"));
        Assert.assertEquals(homePageObj.verifyClassicPackage()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        ,"ClassicPackage"));
        Assert.assertEquals(homePageObj.verifyPremiumPackage()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        ,"PremiumPackage"));
        Assert.assertEquals(homePageObj.verifyLitePackage_Price()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        ,"Algeria_LitePackage_Price"));
        Assert.assertEquals(homePageObj.verifyClassicPackage_Price()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        ,"Algeria_ClassicPackage_Price"));
        Assert.assertEquals(homePageObj.verifyPremiumPackage_Price()
                , PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        ,"Algeria_PremiumPackage_Price"));
        Assert.assertEquals(homePageObj.verifyLitePackage_PriceUnit()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        , "Packages_UnitPrice"));
        Assert.assertEquals(homePageObj.verifyClassicPackage_PriceUnit()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        , "Packages_UnitPrice"));
        Assert.assertEquals(homePageObj.verifyPremiumPackage_PriceUnit()
                ,PropertiesFileReader.getPropertyValue("src/main/java/Properties/ExpectedValues.properties"
                        , "Packages_UnitPrice"));
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyLitePackage());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyClassicPackage());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyPremiumPackage());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyLitePackage_Price());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyClassicPackage_Price());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyPremiumPackage_Price());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyLitePackage_PriceUnit());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyClassicPackage_PriceUnit());
        NotepadWriter.printTestValuesToNotepad("src/main/java/OutputFiles/TestsOutputValues.txt"
                ,homePageObj.verifyPremiumPackage_PriceUnit());
    }

}
