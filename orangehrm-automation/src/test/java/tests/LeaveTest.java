package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.LeavePage;

public class LeaveTest extends BaseTest {

    @Test
    public void verifyLeavePage() {

        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");
        login.waitForDashboard();

        LeavePage leave = new LeavePage(driver);
        leave.clickLeaveMenu();
        leave.clickApplyTab();

        Assert.assertTrue(leave.isLeavePageDisplayed(),
                "Leave page is NOT displayed");
    }
}
