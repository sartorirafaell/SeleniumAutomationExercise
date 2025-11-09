package automationexercise.test;

import automationexercise.factory.seleniumfactory.BrowserService;
import automationexercise.factory.seleniumfactory.SeleniumFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BrowserService {

    SeleniumFactory seleniumFactory = new SeleniumFactory();

    @BeforeMethod
    public void abrirNavegador(){
        seleniumFactory.initBrowser("https://www.automationexercise.com");
    }

    public void rolarSiteParaBaixo() throws InterruptedException{
        seleniumFactory.scrollDownWebSite();
    }

    public void rolarSiteParaCima() throws InterruptedException{
        seleniumFactory.scrollUpWebSite();
    }


    @AfterMethod
    public void fecharNavegador(){
        seleniumFactory.tearDown();
    }

}
