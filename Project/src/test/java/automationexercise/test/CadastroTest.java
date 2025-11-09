package automationexercise.test;

import automationexercise.data.CadastroDto;
import automationexercise.factory.data.CadastroData;
import automationexercise.page.CadastroPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CadastroTest extends BaseTest{

    CadastroPage cadastroPage = new CadastroPage();

    @Test
    public void testDeveCadastrarComDadosDinamicos() {

        String nomeCadastrado = cadastroPage.criarContaComDadosDinamicos();
        String textLogged = cadastroPage.validarTextoAccountLogged();
        Assert.assertEquals(textLogged,"Logged in as " + nomeCadastrado);
        cadastroPage.clicarBtnDelete();
        String textDeleted = cadastroPage.validarTextoAccountDeleted();
        Assert.assertEquals(textDeleted,"ACCOUNT DELETED!");
        cadastroPage.clicarBtnContinue();
    }
}
