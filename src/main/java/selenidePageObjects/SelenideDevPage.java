package selenidePageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SelenideDevPage {

    private SelenideElement letter(String letter) {
        return $(byText(letter));
    }

    private static final String DOCUMENTATION_BUTTON = "//*[@id=\"main_navbar\"]/ul/li[4]/a/span";

//    public SeleniumDevPage(WebDriver driver) {
//        super(driver);
//    }
//
//    public  void clickDocumentationButton(){
//        driver.findElement(By.xpath(DOCUMENTATION_BUTTON)).click();
//    }

}
