package com.certificacion.HansJ.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    public static final Target SELECT_YOUR_TICKET = Target.the("Proceed to checkout button")
            .located(By.xpath("//h2[normalize-space()='Select your ticket type']"));

    public static final Target PROCEED_TO_CHECKOUT_SELECT_BUTTON = Target.the("Proceed to checkout button")
            .located(By.xpath("//span[normalize-space()='Select']"));

    public static final Target SUMMARY_SECTION = Target.the("Booking summary section")
            .located(By.id("booking-summary"));

    public static final Target CONTINUE_YOUR_DETAILS = Target.the("Booking summary section")
            .located(By.id("//button[@aria-label='Previously selected ticket type: Standard ticket COP367,680.45 Cheapest price , No need for flexibility – you're sure about your plans., Continue']//span[@class='Button-module__text___NUJeL'][normalize-space()='Continue']"));
}
