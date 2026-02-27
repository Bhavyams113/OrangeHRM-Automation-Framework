package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.RecruitmentPage;

public class RecruitmentTest extends BaseTest {

    @Test
    public void addCandidateTest() {

        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");
        login.waitForDashboard();

        RecruitmentPage recruit = new RecruitmentPage(driver);
        recruit.addCandidate();

        Assert.assertTrue(recruit.isRecruitmentPageDisplayed(),
                "Recruitment page is NOT displayed");
    }
}