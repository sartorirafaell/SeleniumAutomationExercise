package automationexercise.factory.data;

import automationexercise.data.CadastroDto;
import automationexercise.util.DataFakerGenerator;

public class CadastroData {

    DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();

    public CadastroDto CadastroDadosDinamicos() {
        CadastroDto cadastroDto = new CadastroDto();

        cadastroDto.setNome(dataFakerGenerator.nomeFaker());
        cadastroDto.setEmail(dataFakerGenerator.emailFaker());
        cadastroDto.setPassword(dataFakerGenerator.passwordFaker());
        cadastroDto.setFirstName(dataFakerGenerator.firstNameFaker());
        cadastroDto.setLastName(dataFakerGenerator.lastNameFaker());
        cadastroDto.setAddress(dataFakerGenerator.addressFaker());
        cadastroDto.setState(dataFakerGenerator.stateFaker());
        cadastroDto.setCity(dataFakerGenerator.cityFaker());
        cadastroDto.setZipcode(dataFakerGenerator.zipcodeFaker());
        cadastroDto.setMobileNumber(dataFakerGenerator.mobileNumberFaker());

        return cadastroDto;
    }
}
