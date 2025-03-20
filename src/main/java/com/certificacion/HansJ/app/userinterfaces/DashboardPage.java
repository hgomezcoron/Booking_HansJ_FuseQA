package com.certificacion.HansJ.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage {

    public static final Target PROFILE_ICON = Target.the("User profile icon")
            .located(By.xpath("//button[@data-testid='profile-menu-trigger']"));

    public static final Target ACCOUNT_DETAILS = Target.the("Account details section")
            .located(By.xpath("//a[contains(@href, 'account-settings')]"));
}
