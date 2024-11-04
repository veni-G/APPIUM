package org.appium;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class appiumAutomation {

	public static void main(String[] args) throws MalformedURLException {
		
		new AppiumServiceBuilder.withAppiumJS("")

		UiAutomator2Options UiAutomator2Options = new UiAutomator2Options();
		UiAutomator2Options.setCapability("deviceName", "Veni");
		UiAutomator2Options.setCapability("app",
				"C:\\Users\\venip\\eclipse-workspace\\Appium\\src\\test\\resources\\ApiDemos-debug.apk");
		

		AndroidDriver driver = new AndroidDriver(new URL(" http://127.0.0.1:4723/"), UiAutomator2Options);

	}

}
