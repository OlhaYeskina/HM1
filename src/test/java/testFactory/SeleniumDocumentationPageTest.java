package testFactory;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SeleniumDocumentationPageTest extends BaseTest {

    private String EXPECTED_JAVA_CODE = "" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">org.openqa.selenium.By</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">org.openqa.selenium.Keys</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">org.openqa.selenium.WebDriver</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">org.openqa.selenium.WebElement</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">org.openqa.selenium.firefox.FirefoxDriver</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">org.openqa.selenium.support.ui.WebDriverWait</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import static</span> <span style=\"color:#000\">org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">java.time.Duration</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "\n" +
            "<span style=\"color:#204a87;font-weight:700\">public</span> <span style=\"color:#204a87;font-weight:700\">class</span> <span style=\"color:#000\">HelloSelenium</span> <span style=\"color:#ce5c00;font-weight:700\">{</span>\n" +
            "\n" +
            "    <span style=\"color:#204a87;font-weight:700\">public</span> <span style=\"color:#204a87;font-weight:700\">static</span> <span style=\"color:#204a87;font-weight:700\">void</span> <span style=\"color:#000\">main</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">String</span><span style=\"color:#ce5c00;font-weight:700\">[]</span> <span style=\"color:#000\">args</span><span style=\"color:#ce5c00;font-weight:700\">)</span> <span style=\"color:#ce5c00;font-weight:700\">{</span>\n" +
            "        <span style=\"color:#000\">WebDriver</span> <span style=\"color:#000\">driver</span> <span style=\"color:#ce5c00;font-weight:700\">=</span> <span style=\"color:#204a87;font-weight:700\">new</span> <span style=\"color:#000\">FirefoxDriver</span><span style=\"color:#ce5c00;font-weight:700\">();</span>\n" +
            "        <span style=\"color:#000\">WebDriverWait</span> <span style=\"color:#000\">wait</span> <span style=\"color:#ce5c00;font-weight:700\">=</span> <span style=\"color:#204a87;font-weight:700\">new</span> <span style=\"color:#000\">WebDriverWait</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">driver</span><span style=\"color:#ce5c00;font-weight:700\">,</span> <span style=\"color:#000\">Duration</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">ofSeconds</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">10</span><span style=\"color:#ce5c00;font-weight:700\">));</span>\n" +
            "        <span style=\"color:#204a87;font-weight:700\">try</span> <span style=\"color:#ce5c00;font-weight:700\">{</span>\n" +
            "            <span style=\"color:#000\">driver</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">get</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#4e9a06\">\"https://google.com/ncr\"</span><span style=\"color:#ce5c00;font-weight:700\">);</span>\n" +
            "            <span style=\"color:#000\">driver</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">findElement</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">By</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">name</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#4e9a06\">\"q\"</span><span style=\"color:#ce5c00;font-weight:700\">)).</span><span style=\"color:#c4a000\">sendKeys</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#4e9a06\">\"cheese\"</span> <span style=\"color:#ce5c00;font-weight:700\">+</span> <span style=\"color:#000\">Keys</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">ENTER</span><span style=\"color:#ce5c00;font-weight:700\">);</span>\n" +
            "            <span style=\"color:#000\">WebElement</span> <span style=\"color:#000\">firstResult</span> <span style=\"color:#ce5c00;font-weight:700\">=</span> <span style=\"color:#000\">wait</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">until</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">presenceOfElementLocated</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">By</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">cssSelector</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#4e9a06\">\"h3\"</span><span style=\"color:#ce5c00;font-weight:700\">)));</span>\n" +
            "            <span style=\"color:#000\">System</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">out</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">println</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">firstResult</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">getAttribute</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#4e9a06\">\"textContent\"</span><span style=\"color:#ce5c00;font-weight:700\">));</span>\n" +
            "        <span style=\"color:#ce5c00;font-weight:700\">}</span> <span style=\"color:#204a87;font-weight:700\">finally</span> <span style=\"color:#ce5c00;font-weight:700\">{</span>\n" +
            "            <span style=\"color:#000\">driver</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">quit</span><span style=\"color:#ce5c00;font-weight:700\">();</span>\n" +
            "        <span style=\"color:#ce5c00;font-weight:700\">}</span>\n" +
            "    <span style=\"color:#ce5c00;font-weight:700\">}</span>\n" +
            "<span style=\"color:#ce5c00;font-weight:700\">}</span>\n" +
            "  ";

    private String EXPECTED_PYTHON_CODE = "" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">org.openqa.selenium.By</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">org.openqa.selenium.Keys</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">org.openqa.selenium.WebDriver</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">org.openqa.selenium.WebElement</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">org.openqa.selenium.firefox.FirefoxDriver</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">org.openqa.selenium.support.ui.WebDriverWait</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import static</span> <span style=\"color:#000\">org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "<span style=\"color:#204a87;font-weight:700\">import</span> <span style=\"color:#000\">java.time.Duration</span><span style=\"color:#ce5c00;font-weight:700\">;</span>\n" +
            "\n" +
            "<span style=\"color:#204a87;font-weight:700\">public</span> <span style=\"color:#204a87;font-weight:700\">class</span> <span style=\"color:#000\">HelloSelenium</span> <span style=\"color:#ce5c00;font-weight:700\">{</span>\n" +
            "\n" +
            "    <span style=\"color:#204a87;font-weight:700\">public</span> <span style=\"color:#204a87;font-weight:700\">static</span> <span style=\"color:#204a87;font-weight:700\">void</span> <span style=\"color:#000\">main</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">String</span><span style=\"color:#ce5c00;font-weight:700\">[]</span> <span style=\"color:#000\">args</span><span style=\"color:#ce5c00;font-weight:700\">)</span> <span style=\"color:#ce5c00;font-weight:700\">{</span>\n" +
            "        <span style=\"color:#000\">WebDriver</span> <span style=\"color:#000\">driver</span> <span style=\"color:#ce5c00;font-weight:700\">=</span> <span style=\"color:#204a87;font-weight:700\">new</span> <span style=\"color:#000\">FirefoxDriver</span><span style=\"color:#ce5c00;font-weight:700\">();</span>\n" +
            "        <span style=\"color:#000\">WebDriverWait</span> <span style=\"color:#000\">wait</span> <span style=\"color:#ce5c00;font-weight:700\">=</span> <span style=\"color:#204a87;font-weight:700\">new</span> <span style=\"color:#000\">WebDriverWait</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">driver</span><span style=\"color:#ce5c00;font-weight:700\">,</span> <span style=\"color:#000\">Duration</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">ofSeconds</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">10</span><span style=\"color:#ce5c00;font-weight:700\">));</span>\n" +
            "        <span style=\"color:#204a87;font-weight:700\">try</span> <span style=\"color:#ce5c00;font-weight:700\">{</span>\n" +
            "            <span style=\"color:#000\">driver</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">get</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#4e9a06\">\"https://google.com/ncr\"</span><span style=\"color:#ce5c00;font-weight:700\">);</span>\n" +
            "            <span style=\"color:#000\">driver</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">findElement</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">By</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">name</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#4e9a06\">\"q\"</span><span style=\"color:#ce5c00;font-weight:700\">)).</span><span style=\"color:#c4a000\">sendKeys</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#4e9a06\">\"cheese\"</span> <span style=\"color:#ce5c00;font-weight:700\">+</span> <span style=\"color:#000\">Keys</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">ENTER</span><span style=\"color:#ce5c00;font-weight:700\">);</span>\n" +
            "            <span style=\"color:#000\">WebElement</span> <span style=\"color:#000\">firstResult</span> <span style=\"color:#ce5c00;font-weight:700\">=</span> <span style=\"color:#000\">wait</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">until</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">presenceOfElementLocated</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">By</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">cssSelector</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#4e9a06\">\"h3\"</span><span style=\"color:#ce5c00;font-weight:700\">)));</span>\n" +
            "            <span style=\"color:#000\">System</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">out</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">println</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#000\">firstResult</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">getAttribute</span><span style=\"color:#ce5c00;font-weight:700\">(</span><span style=\"color:#4e9a06\">\"textContent\"</span><span style=\"color:#ce5c00;font-weight:700\">));</span>\n" +
            "        <span style=\"color:#ce5c00;font-weight:700\">}</span> <span style=\"color:#204a87;font-weight:700\">finally</span> <span style=\"color:#ce5c00;font-weight:700\">{</span>\n" +
            "            <span style=\"color:#000\">driver</span><span style=\"color:#ce5c00;font-weight:700\">.</span><span style=\"color:#c4a000\">quit</span><span style=\"color:#ce5c00;font-weight:700\">();</span>\n" +
            "        <span style=\"color:#ce5c00;font-weight:700\">}</span>\n" +
            "    <span style=\"color:#ce5c00;font-weight:700\">}</span>\n" +
            "<span style=\"color:#ce5c00;font-weight:700\">}</span>\n" +
            "  ";
    private String EXPECTED_CSHARP_CODE = "";
    private String EXPECTED_RUBY_CODE = "";
    private String EXPECTED_JAVASCRIPT_CODE = "";
    private String EXPECTED_KOTLIN_CODE = "";


    @Test
    public void checkCorrespondCodeTextToJava(){

        getSeleniumDevPage().clickDocumentationButton();
        getSeleniumDocumentationPage().clickOnJavaButton();

//        System.out.println(getSeleniumDocumentationPage().CodeTextJavaInHtml());
        assertEquals(getSeleniumDocumentationPage().CodeTextJavaInHtml(),EXPECTED_JAVA_CODE);
    }


    @Test
    public void checkCorrespondCodeTextToPython(){
        getSeleniumDevPage().clickDocumentationButton();
        getSeleniumDocumentationPage().clickOnPythonButton();

        assertEquals(getSeleniumDocumentationPage().CodeTextPythonInHtml(),EXPECTED_PYTHON_CODE);
    }

}
