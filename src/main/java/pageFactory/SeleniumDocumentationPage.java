package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumDocumentationPage extends BasePage{

    @FindBy(id = "tabs-1-0-tab")
    private WebElement javaButton;

    @FindBy(id = "tabs-1-1-tab")
    private WebElement pythonButton;

    @FindBy(xpath = "//*[@id=\"tabs-1-0\"]/div/pre/code")
    private WebElement javaCode;

    @FindBy(xpath = "//*[@id=\"tabs-1-0\"]/div/pre/code")
    private WebElement pythonCode;



    public SeleniumDocumentationPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnJavaButton(){
        javaButton.click();
    }

    public void clickOnPythonButton(){
        pythonButton.click();
    }

    public String CodeTextJavaInHtml(){
        return javaCode.getAttribute("innerHTML");
    }

    public String CodeTextPythonInHtml(){
        return pythonCode.getAttribute("innerHTML");
    }


}
