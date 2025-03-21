package com.certificacion.HansJ.app.drivers;

import com.epam.healenium.SelfHealingDriver;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomDriverSource implements DriverSource {

    @Override
    public WebDriver newDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--profile.content_settings.pattern_pairs.*.multiple-automatic-downloads=2");
        options.addArguments("--disable-extensions");
        options.addArguments("--test-type");
        options.addArguments("--user-agent=New User Agent");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-geolocation");
        options.addArguments("--profile.default_content_setting_values.automatic_downloads=1");
        WebDriver delegate = new ChromeDriver(options);
        return SelfHealingDriver.create(delegate);
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}