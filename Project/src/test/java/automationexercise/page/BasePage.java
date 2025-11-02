package automationexercise.page;

import automationexercise.factory.seleniumfactory.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Elements {

    static void preencherInput(By by, String text) {
        esperarElemento(by);
        element(by).sendKeys(text);
    }

    static void clicar(By by) {
        esperarElementoClicavel(by);
        element(by).click();
    }

    protected static String lerTexto(By by) {
        return element(by).getText();
    }

    public static void esperarElementoClicavel(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    protected static void selecionoTab(By by, String texto) {
        esperarElemento(by);
        element(by).sendKeys(texto);
    }

    public void esperarURL(String url) {
        esperarURLCorreta(url);
    }

    static boolean visibilidadeDeElemento(By by) {
        try {
            visibilidadeElemento(by);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    static void visibilidadeDosElementos(By by) {
        visibilidadeDeTodosElementos(by);
    }
}
