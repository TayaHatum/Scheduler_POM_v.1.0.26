package com.telran;

import com.telran.config.BaseTest;
import com.telran.model.Credentials;
import com.telran.model.Event;
import com.telran.pageobject.SplashScreen;
import org.testng.annotations.Test;

public class EventTest extends BaseTest {

    @Test
    public void eventCreationTest() throws InterruptedException {

        new SplashScreen(driver)
                .checkVersion("0.0.3")
                .complexLogin(Credentials.builder()
                        .username("john888@mail.com")
                        .password("Bb123456$")
                        .build())
                .skipWizard()
                .checkFabPresent()
                .initCreationNew()
                .fillCreationForm(Event.builder()
                        .title("new Event")
                        .type("event")
                        .breaks(2)
                        .ammount(50)
                        .build())
                .confirmCreation()
        .checkFabPresent();
        Thread.sleep(5000);
    }
}
