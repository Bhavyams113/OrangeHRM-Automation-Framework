package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage extends BasePage {

    By recruitmentMenu = By.xpath("//span[text()='Recruitment']");
    By addBtn = By.xpath("//button[normalize-space()='Add']");
    By pageHeader = By.xpath("//h6[text()='Recruitment']");

    public RecruitmentPage(WebDriver driver) {
        super(driver);
    }

    public void addCandidate() {
        driver.findElement(recruitmentMenu).click();
        driver.findElement(addBtn).click();
    }

    public boolean isRecruitmentPageDisplayed() {
        return driver.findElement(pageHeader).isDisplayed();
    }
}