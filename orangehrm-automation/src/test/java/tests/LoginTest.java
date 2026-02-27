package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");
        login.waitForDashboard();

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),
                "Login Failed");
    }
}