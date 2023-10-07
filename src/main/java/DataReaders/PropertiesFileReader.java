package DataReaders;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {

    private static Properties properties;

    public static  String getPropertyValue(String propFilePath,String key) {
        properties = new Properties();
        try {
            FileInputStream file = new FileInputStream(propFilePath);
            properties.load(file);
            file.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        String value = properties.getProperty(key);
        System.out.println(value);
        return value;
    }
}
