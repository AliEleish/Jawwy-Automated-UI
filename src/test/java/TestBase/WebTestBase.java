package TestBase;

import DataReaders.PropertiesFileReader;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class WebTestBase {

    protected WebDriver driver;
    protected HomePage homePageObj;;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String testWebsiteUrl = PropertiesFileReader.getPropertyValue("src/main/java/Properties/TestWebsites.properties"
                ,"jawwyWebsite");
        driver.get(testWebsiteUrl);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }

    }
