package automationexercise.factory.seleniumfactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class SeleniumFactory {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public void initBrowser(String url){

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        driver.get(url);
        driver.manage().window().maximize();

    }

    public void scrollDownWebSite() throws InterruptedException{

        JavascriptExecutor js = (JavascriptExecutor) driver;
        sleep(1000);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public void scrollUpWebSite() throws InterruptedException{

        JavascriptExecutor js = (JavascriptExecutor) driver;
        sleep(1000);

        js.executeScript("window.scrollTo(0, 0);");
    }

    public void tearDown(){
        driver.close();
    }


}