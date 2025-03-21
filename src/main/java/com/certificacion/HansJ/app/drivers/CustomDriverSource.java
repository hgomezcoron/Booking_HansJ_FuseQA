package com.certificacion.HansJ.app.drivers;

import com.epam.healenium.SelfHealingDriver;
import net.serenitybdd.core.webdriver.driverproviders.ChromeDriverCapabilities;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomDriverSource implements DriverSource {

    @Override
    public WebDriver newDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");

        WebDriver delegate = new ChromeDriver(options);

        return SelfHealingDriver.create(delegate);
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
