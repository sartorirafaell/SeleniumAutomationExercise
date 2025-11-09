package automationexercise.page;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private static final By btnLogin =
            By.cssSelector("#form  div div div.col-sm-4.col-sm-offset-1 div  form > button");

    private static final By btnSignUpLogin =
            By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");

    private static final By campoEmail =
            By.cssSelector("input[data-qa=\"login-email\"]");

    private static final By campoSenha =
            By.cssSelector("[data-qa=\"login-password\"]");

    private static final By textLogged =
            By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a");

    private static final By btnDelete =
            By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a");

    private static final By textDelete =
            By.cssSelector("#form > div > div > div > h2 > b");

    private static final By btnContinue =
            By.cssSelector("a[data-qa=\"continue-button\"]");


    private static final By textLoginInvalido =
            By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > p");


    public void preencherCampoEmail(String email) { preencherInput(campoEmail, email);}

    public void preencherCampoSenha(String senha) { preencherInput(campoSenha, senha);}

    public void clicarBtnSignUpLogin() {
        clicar(btnSignUpLogin);
    }

    public void clicarBtnLogin() {
        clicar(btnLogin);
    }

    public void clicarBtnContinue() {
        clicar(btnContinue);
    }

    public void clicarBtnDelete() {
        clicar(btnDelete);
    }


    public String validarTextoAccountLogged()  {
        return lerTexto(textLogged);
    }

    public String validarTextoAccountDeleted() {
        return lerTexto(textDelete);
    }

    public String validarTextoLoginInvalido() { return  lerTexto(textLoginInvalido);}
}
