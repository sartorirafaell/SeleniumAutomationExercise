package automationexercise.util;


import java.util.Locale;

public class DataFakerGenerator {

    static net.datafaker.Faker faker = new net.datafaker.Faker(new Locale("PT-BR"));

    public String nomeFaker(){
        return faker.name().fullName();
    }

    public String emailFaker(){
        return faker.internet().emailAddress();
    }

    public String passwordFaker(){
        return faker.internet().password();
    }

    public String firstNameFaker(){
        return faker.name().firstName();
    }

    public String lastNameFaker(){
        return faker.name().lastName();
    }

    public String addressFaker(){
        return faker.address().streetAddress();
    }

    public String stateFaker(){
        return faker.address().state();
    }

    public String cityFaker(){
        return faker.address().city();
    }

    public String zipcodeFaker(){
        return faker.address().zipCode();
    }

    public String mobileNumberFaker(){
        return faker.phoneNumber().phoneNumber();
    }

    public String subjectFaker(){
        return faker.lorem().characters(10,30);
    }

    public String messageFaker(){
        return faker.lordOfTheRings().toString();
    }

}
