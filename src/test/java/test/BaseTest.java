package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.SeleniumDevPage;
import pages.SeleniumDocumentationPage;

public class BaseTest {

    private WebDriver driver;
    private static final String SELENIUM_DEV = "https://www.selenium.dev/";


    @BeforeTest
    public void profileSetUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dreyk\\IdeaProjects\\HM1\\chromedriver.exe");
//        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(SELENIUM_DEV);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public SeleniumDevPage getSeleniumDevPage() {
        return new SeleniumDevPage(getDriver());
    }

    public SeleniumDocumentationPage getSeleniumDocumentationPage() {
        return new SeleniumDocumentationPage(getDriver());
    }



}
