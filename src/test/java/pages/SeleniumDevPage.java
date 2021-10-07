package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SeleniumDevPage extends BasePage {



    public SeleniumDevPage(WebDriver driver) {
        super(driver);
    }

    public  void clickDocumentationButton(){
        driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[4]/a/span")).click();
    }


}
