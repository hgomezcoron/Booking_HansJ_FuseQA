package com.certificacion.HansJ.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target EMAIL_FIELD = Target.the("Email field")
            .located(By.id("username"));

    public static final Target CONTINUE_BUTTON = Target.the("Continue button")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target PASSWORD_FIELD = Target.the("Password field")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target ERROR_MESSAGE = Target.the("Login error message")
            .located(By.cssSelector(".bui-alert"));
}
