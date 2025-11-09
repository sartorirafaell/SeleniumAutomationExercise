package automationexercise.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Manipulation {

    private static Properties getProp() {
        Properties props = new Properties();
        try {
            FileInputStream file = new FileInputStream("src/main/resources/application.properties");
            props.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }

    public static String getEmail() {
        return getProp().getProperty("EMAIL");
    }
    public static String getSenha(){
        return getProp().getProperty("SENHA");
    }

}
