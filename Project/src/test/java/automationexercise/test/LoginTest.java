package automationexercise.test;

import automationexercise.data.CadastroDto;
import automationexercise.factory.data.CadastroData;
import automationexercise.page.CadastroPage;
import automationexercise.page.LoginPage;
import automationexercise.util.LoginConstants;
import automationexercise.util.Manipulation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    LoginPage loginPage = new LoginPage();
    CadastroPage cadastroPage = new CadastroPage();
    CadastroData cadastroData = new CadastroData();

    @Test
    public void testDeveFazerLoginComSucesso() {

        cadastroPage.verificarExistenciaConta();
        loginPage.clicarBtnSignUpLogin();
        loginPage.preencherCampoEmail(Manipulation.getEmail());
        loginPage.preencherCampoSenha(Manipulation.getSenha());
        loginPage.clicarBtnLogin();
        String textLogged = loginPage.validarTextoAccountLogged();
        Assert.assertEquals(textLogged,LoginConstants.TXT_LOGGED_IN);
        loginPage.clicarBtnDelete();
        String textDeleted = loginPage.validarTextoAccountDeleted();
        Assert.assertEquals(textDeleted,LoginConstants.TXT_ACCOUNT_DELETED);
        loginPage.clicarBtnContinue();
    }


    @Test
    public void testTentarFazerLoginComDadosInvalidos() {

        CadastroDto usuario = cadastroData.CadastroDadosDinamicos();
        String email = usuario.getEmail();
        String password = usuario.getPassword();
        loginPage.clicarBtnSignUpLogin();
        loginPage.preencherCampoEmail(email);
        loginPage.preencherCampoSenha(password);
        loginPage.clicarBtnLogin();
        String textLoginInvalido = loginPage.validarTextoLoginInvalido();
        Assert.assertEquals(textLoginInvalido, LoginConstants.TXT_WRONG_ACCOUNT);
    }
}
