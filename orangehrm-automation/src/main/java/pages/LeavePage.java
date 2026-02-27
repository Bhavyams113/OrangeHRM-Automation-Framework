package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage extends BasePage {

    By leaveMenu = By.xpath("//span[text()='Leave']");
    By applyTab = By.xpath("//a[text()='Apply']");
    By leaveHeader = By.xpath("//h6[text()='Apply Leave']");

    public LeavePage(WebDriver driver) {
        super(driver);
    }

    public void clickLeaveMenu() {
        driver.findElement(leaveMenu).click();
    }

    public void clickApplyTab() {
        driver.findElement(applyTab).click();
    }

    public boolean isLeavePageDisplayed() {
        return driver.findElement(leaveHeader).isDisplayed();
    }
}