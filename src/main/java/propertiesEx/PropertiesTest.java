package propertiesEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\AVINASH\\gitHub\\JavaPractise\\src\\main\\java\\propertiesEx\\config.properties");
        Properties prop = new Properties();
        prop.load(reader);
        System.out.println(prop.entrySet());
        System.out.println(prop.getProperty("browser"));
    }
}
