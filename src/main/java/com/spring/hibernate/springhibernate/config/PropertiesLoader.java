package com.spring.hibernate.springhibernate.config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

    private static Properties properties = null;

    public static synchronized Properties loadPropertiesFile() throws Exception {
        if(properties == null){
            properties = new Properties();
            InputStream in = new FileInputStream("src/main/resources/application.properties");
            properties.load(in);
            in.close();
        }
        return properties;
    }
}
