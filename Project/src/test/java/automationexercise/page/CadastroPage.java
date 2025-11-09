package automationexercise.page;

import automationexercise.data.CadastroDto;
import automationexercise.factory.data.CadastroData;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CadastroPage extends BasePage{

    CadastroData cadastroData = new CadastroData();

    private static final By btnSignUpLogin =
            By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");

    private static final By textNewUser =
            By.cssSelector("#form > div > div > div:nth-child(3) > div > h2");

    private static final By campoNome =
            By.cssSelector("input[data-qa=\"signup-name\"]");

    private static final By campoEmail =
            By.cssSelector("input[data-qa=\"signup-email\"]");

    private static final By btnSignUp =
            By.cssSelector("button[data-qa=\"signup-button\"]");


    private static final By optGender1 =
            By.cssSelector("#id_gender1");

    private static final By optGender2 =
            By.cssSelector("#id_gender2");

    private static final By campoPassword =
            By.cssSelector("input[data-qa=\"password\"]");

    private static final By campoDias =
            By.cssSelector("select[data-qa=\"days\"]");

    private static final By optDia3 =
            By.cssSelector("select[data-qa=\"days\"] option:nth-child(4)");

    private static final By campoMes =
            By.cssSelector("select[data-qa=\"months\"]");

    private static final By mesJaneiro =
            By.xpath("//select[@data-qa=\"months\"]/option[text()=\"January\"]");

    private static final By campoAno =
            By.cssSelector("select[data-qa=\"years\"]");

    private static final By ano2003 =
            By.xpath("//select[@data-qa=\"years\"]/option[text()=\"2003\"]");

    private static final By campoFirstName =
            By.xpath("//input[@data-qa=\"first_name\"]");

    private static final By campoLastName =
            By.cssSelector("input[data-qa=\"last_name\"]");

    private static final By campoAddress =
            By.cssSelector("input[data-qa=\"address\"]");

    private static final By campoCountry =
            By.cssSelector("select[data-qa=\"country\"]");

    private static final By countryCanada =
            By.cssSelector("select[data-qa=\"country\"] option:nth-child(3)");

    private static final By campoState =
            By.cssSelector("input[data-qa=\"state\"]");

    private static final By campoCity =
            By.cssSelector("input[data-qa=\"city\"]");

    private static final By campoZipCode =
            By.cssSelector("input[data-qa=\"zipcode\"]");

    private static final By campoMobilePhone =
            By.cssSelector("input[data-qa=\"mobile_number\"]");

    private static final By btnCreateAccount =
            By.cssSelector("button[data-qa=\"create-account\"]");

    private static final By textAccount =
            By.cssSelector("#form > div > div > div > h2 > b");

    private static final By btnContinue =
            By.cssSelector("a[data-qa=\"continue-button\"]");

    private static final By textLogged =
            By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a");

    private static final By btnDelete =
            By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a");

    private static final By textDelete =
            By.cssSelector("#form > div > div > div > h2 > b");

    private static final By textEmailEmUso =
            By.cssSelector("#form > div > div > div:nth-child(3) > div > form > p");


    // Ações (clicar, escrever etc)

    public void preencherCampoNome(String nome) {
        preencherInput(campoNome, nome);
    }

    public void preencherCampoEmail(String email) {
        preencherInput(campoEmail, email);
    }

    public void preencherCampoPassword(String password) {
        preencherInput(campoPassword, password);
    }

    public void preencherCampoFirstName(String firstName) {
        preencherInput(campoFirstName, firstName);
    }

    public void preencherCampoLastName(String lastName) {
        preencherInput(campoLastName, lastName);
    }

    public void preencherCampoAddress(String address) {
        preencherInput(campoAddress, address);
    }

    public void preencherCampoState(String state) {
        preencherInput(campoState, state);
    }

    public void preencherCampoCity(String city) {
        preencherInput(campoCity, city);
    }

    public void preencherCampoZipCode(String zipcode) {
        preencherInput(campoZipCode, zipcode);
    }

    public void preencherCampoMobilePhone(String mobilePhone) {
        preencherInput(campoMobilePhone, mobilePhone);
    }

    public void clicarBtnSignUpLogin() {
        clicar(btnSignUpLogin);
    }

    public void clicarBtnSignUp() {
        clicar(btnSignUp);
    }

    public void clicarBtnCreateAccount() {
        clicar(btnCreateAccount);
    }

    public void clicarBtnContinue() {
        clicar(btnContinue);
    }

    public void clicarBtnDelete() {
        clicar(btnDelete);
    }

    public void clicarOptGender1() {
        clicar(optGender1);
    }

    public void clicarOptGender2() {
        clicar(optGender2);
    }

    public void clicarCampoDias() {
        clicar(campoDias);
    }

    public void clicarCampoMes() {
        clicar(campoMes);
    }

    public void clicarCampoAno() {
        clicar(campoAno);
    }

    public void clicarCampoCountry() {
        clicar(campoCountry);
    }

    public void selecionarDiaTres() {
        clicar(optDia3);
    }

    public void selecionarMesJaneiro() {
        clicar(mesJaneiro);
    }

    public void selecionarAno2003() {
        clicar(ano2003);
    }

    public void selecionarCountryCanada() {
        clicar(countryCanada);
    }

    public String validarTextoNewUser() {
        return lerTexto(textNewUser);
    }

    public String validarTextoAccountCreated() {
        return lerTexto(textAccount);
    }

    public String validarTextoAccountLogged() {
        return lerTexto(textLogged);
    }

    public String validarTextoAccountDeleted() {
        return lerTexto(textDelete);
    }

    public String validarTextoEmailEmUso() {return lerTexto(textEmailEmUso);}

    public void verificarExistenciaConta() {
        clicarBtnSignUpLogin();
        String textNewUser = validarTextoNewUser();
        Assert.assertEquals(textNewUser,"New User Signup!");
        preencherCampoNome("testes");
        preencherCampoEmail("testesgrupo4@qa.com");
        clicarBtnSignUp();
        try {
            validarTextoEmailEmUso();
        } catch (Exception e) {
            criarContaTestes();
        }
    }

    public void criarContaTestes() {
        System.out.println("Executando ação alternativa...");
        CadastroDto cadastro = cadastroData.CadastroDadosDinamicos();
        preencherCampoNome(cadastro.getNome());
        preencherCampoEmail(cadastro.getEmail());
        clicarOptGender1();
        preencherCampoPassword("testes");
        clicarCampoDias();
        selecionarDiaTres();
        clicarCampoMes();
        selecionarMesJaneiro();
        clicarCampoAno();
        selecionarAno2003();
        preencherCampoFirstName(cadastro.getFirstName());
        preencherCampoLastName(cadastro.getLastName());
        preencherCampoAddress(cadastro.getAddress());
        clicarCampoCountry();
        selecionarCountryCanada();
        preencherCampoState(cadastro.getState());
        preencherCampoCity(cadastro.getCity());
        preencherCampoZipCode(cadastro.getZipcode());
        preencherCampoMobilePhone(cadastro.getMobileNumber());
        clicarBtnCreateAccount();
        clicarBtnContinue();
    }

    public String criarContaComDadosDinamicos() {

        CadastroDto cadastro = cadastroData.CadastroDadosDinamicos();
        clicarBtnSignUpLogin();
        preencherCampoNome(cadastro.getNome());
        preencherCampoEmail(cadastro.getEmail());
        clicarBtnSignUp();
        clicarOptGender1();
        preencherCampoPassword(cadastro.getPassword());
        clicarCampoDias();
        selecionarDiaTres();
        clicarCampoMes();
        selecionarMesJaneiro();
        clicarCampoAno();
        selecionarAno2003();
        preencherCampoFirstName(cadastro.getFirstName());
        preencherCampoLastName(cadastro.getLastName());
        preencherCampoAddress(cadastro.getAddress());
        clicarCampoCountry();
        selecionarCountryCanada();
        preencherCampoState(cadastro.getState());
        preencherCampoCity(cadastro.getCity());
        preencherCampoZipCode(cadastro.getZipcode());
        preencherCampoMobilePhone(cadastro.getMobileNumber());
        clicarBtnCreateAccount();
        String textCreated = validarTextoAccountCreated();
        Assert.assertEquals(textCreated,"ACCOUNT CREATED!");
        clicarBtnContinue();

        return cadastro.getNome();
    }
}
