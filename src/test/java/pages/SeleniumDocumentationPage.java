package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumDocumentationPage extends BasePage{
    public SeleniumDocumentationPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnJavaButton(){
        driver.findElement(By.id("tabs-1-0-tab")).click();
    }

    public void clickOnPythonButton(){
        driver.findElement(By.id("tabs-1-1-tab")).click();
    }

    public String CodeTextJava(){
       return driver.findElement(By.xpath("//*[@id=\"tabs-1-0\"]/div/pre/code")).getAttribute("innerHTML");
    }

    public String CodeTextPython(){
        return driver.findElement(By.xpath("//*[@id=\"tabs-1-0\"]/div/pre/code")).getAttribute("innerHTML");
    }
}
