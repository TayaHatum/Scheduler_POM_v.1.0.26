package com.telran;

import com.telran.config.BaseTest;
import com.telran.model.Credentials;
import com.telran.pageobject.SplashScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test
    public void loginTest() {
        boolean isFabPresent=
                new SplashScreen(driver)
                        .checkVersion("0.0.3")
                .fillEmail("john888@mail.com")
                .fillPassword("Bb123456$")
                .clickLogin()
                .skipWizard()
                .isFabButtonPresent();
        Assert.assertTrue(isFabPresent);

    }

    @Test
    public void loginComplexTest() {
        new SplashScreen(driver)
                .checkVersion("0.0.3")
                .complexLogin(Credentials.builder()
                        .username("john888@mail.com")
                        .password("Bb123456$")
                        .build())
                .skipWizard()
                .checkFabPresent();


    }
}
