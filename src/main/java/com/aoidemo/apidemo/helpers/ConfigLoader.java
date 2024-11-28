package com.aoidemo.apidemo.helpers;
import org.json.simple.parser.JSONParser;

import org.json.simple.JSONObject;
import java.io.FileReader;

public class ConfigLoader {
	
    private static JSONObject config;

    
    public static void loadConfig(String environment) {
        try {
        	System.out.println("Working Directory: " + System.getProperty("user.dir"));
        	String configFilePath = System.getProperty("user.dir") + "/src/main/resources/config/"+environment+".json";
        	System.out.println("Config File Path: " + configFilePath);
            System.out.println(configFilePath);
            FileReader reader = new FileReader(configFilePath);
            JSONParser jsonParser = new JSONParser();
            config = (JSONObject) jsonParser.parse(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Retrieve configuration value by key
    public static String getConfig(String key) {
        return (String) config.get(key);
    }
}
