package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractPage {

    @FindBy (xpath = "//div[@id='main-menu']/ul/li[2]/a")
    private WebElement LoginButton;

    @FindBy (name = "name")
    private WebElement Name;
    
    @FindBy (name = "email")
    private WebElement Email;
    
    @FindBy (xpath = "(//input[@name='password'])[2]")
    private WebElement Password;
    
    @FindBy (name = "act_register_now")
    private WebElement Register;

    public RegistrationPage (WebDriver driver) {
        super(driver);
    }
    public void RegistrationPage() {this.submit.click(); }
}
