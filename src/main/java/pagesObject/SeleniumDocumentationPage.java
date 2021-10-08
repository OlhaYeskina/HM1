package pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumDocumentationPage extends BasePage{

    private static final String JAVA_BUTTON = "tabs-1-0-tab";
    private static final String PYTHON_BUTTON = "tabs-1-1-tab";
    private static final String JAVA_CODE = "//*[@id=\"tabs-1-0\"]/div/pre/code";
    private static final String PYTHON_CODE = "//*[@id=\"tabs-1-0\"]/div/pre/code";



    public SeleniumDocumentationPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnJavaButton(){
        driver.findElement(By.id(JAVA_BUTTON)).click();
    }

    public void clickOnPythonButton(){
        driver.findElement(By.id(PYTHON_BUTTON)).click();
    }

    public String CodeTextJavaInHtml(){
       return driver.findElement(By.xpath(JAVA_CODE)).getAttribute("innerHTML");
    }

    public String CodeTextPythonInHtml(){
        return driver.findElement(By.xpath(PYTHON_CODE)).getAttribute("innerHTML");
    }
}
