package pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SeleniumDevPage extends BasePage {

    private static final String DOCUMENTATION_BUTTON = "//*[@id=\"main_navbar\"]/ul/li[4]/a/span";

    public SeleniumDevPage(WebDriver driver) {
        super(driver);
    }

    public  void clickDocumentationButton(){
        driver.findElement(By.xpath(DOCUMENTATION_BUTTON)).click();
    }


}
