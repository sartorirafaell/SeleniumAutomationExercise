package automationexercise.factory.seleniumfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elements extends SeleniumFactory {

    public static WebElement element(By by){
        return driver.findElement(by);
    }

    public static void esperarElemento(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void esperarElementoAlerta() {
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public static void esperarURLCorreta(String url){
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public static void visibilidadeElemento(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void visibilidadeDeTodosElementos(By by){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }
}
