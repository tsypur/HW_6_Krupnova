package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationTest extends AbstractTest {
    @Test
    void testRegistration(){

        WebElement webElementLoginButton = webDriver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/a"));
        webElementLoginButton.click();

        WebElement webElementName = webDriver.findElement(By.name("name"));
        webElementName.click();
        webElementName.sendKeys("testik888");

        WebElement webElementEmail = webDriver.findElement(By.name("email"));
        webElementEmail.click();
        webElementEmail.sendKeys("testik888@yandex.ru");

        WebElement webElementPassword = webDriver.findElement(By.xpath("(//input[@name='password'])[2]"));
        webElementPassword.click();
        webElementPassword.sendKeys("123321");

        WebElement webElementRegister = webDriver.findElement(By.name("act_register_now"));
        webElementRegister.click();

    }
}
