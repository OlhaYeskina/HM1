package testSelenidePageObject;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
//import uitest.AbstractHangmanTest;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;


public class TestPage {

    private static final String DOCUMENTATION_BUTTON = "//*[@id=\"main_navbar\"]/ul/li[4]/a/span";
    private static final String JAVA_BUTTON = "tabs-1-0-tab";
    private static final String JAVA_CODE = "//*[@id=\"tabs-1-0\"]/div/div/pre/code";
    private String EXPECTED_JAVA_CODE = "import org.openqa.selenium.By;\n" +
            "import org.openqa.selenium.Keys;\n" +
            "import org.openqa.selenium.WebDriver;\n" +
            "import org.openqa.selenium.WebElement;\n" +
            "import org.openqa.selenium.firefox.FirefoxDriver;\n" +
            "import org.openqa.selenium.support.ui.WebDriverWait;\n" +
            "import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;\n" +
            "import java.time.Duration;\n" +
            "\n" +
            "public class HelloSelenium {\n" +
            "\n" +
            "    public static void main(String[] args) {\n" +
            "        WebDriver driver = new FirefoxDriver();\n" +
            "        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));\n" +
            "        try {\n" +
            "            driver.get(\"https://google.com/ncr\");\n" +
            "            driver.findElement(By.name(\"q\")).sendKeys(\"cheese\" + Keys.ENTER);\n" +
            "            WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector(\"h3\")));\n" +
            "            System.out.println(firstResult.getAttribute(\"textContent\"));\n" +
            "        } finally {\n" +
            "            driver.quit();\n" +
            "        }\n" +
            "    }\n" +
            "}\n" +
            "  ";



    @Test
    public void checkCorrespondCodeTextToJava() {
        open("https://www.selenium.dev/");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        $(By.xpath(DOCUMENTATION_BUTTON)).click();
        $(By.id(JAVA_BUTTON)).click();
        $(By.xpath(JAVA_CODE)).shouldHave(text(EXPECTED_JAVA_CODE));

    }

}
