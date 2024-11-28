package com.Apidemo.apidemo.basepage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URL;

import com.aoidemo.apidemo.helpers.ConfigLoader;
public class BasePage {
	
    public static AndroidDriver driver;

    public static void setup() {
    	
    	
        try {
        	String environment = System.getProperty("env", "staging");
            ConfigLoader.loadConfig(environment);
            
            String appiumServerUrl = ConfigLoader.getConfig("appium_server_url");
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName(ConfigLoader.getConfig("platform_name"));
            options.setAutomationName(ConfigLoader.getConfig("Automation_Name"));
            options.setDeviceName(ConfigLoader.getConfig("device_name"));
            options.setApp(ConfigLoader.getConfig("App_path"));

            driver = new AndroidDriver(new URL(appiumServerUrl), options);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
