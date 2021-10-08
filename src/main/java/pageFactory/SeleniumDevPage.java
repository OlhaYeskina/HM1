package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumDevPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"main_navbar\"]/ul/li[4]/a/span")
    private WebElement documentationButton;


    public SeleniumDevPage(WebDriver driver) {
        super(driver);
    }

    public void clickDocumentationButton() {
        documentationButton.click();
    }


}
