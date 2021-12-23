package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class AbstractTest {

    static WebDriver webDriver;

    @BeforeAll
    static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        options.setPageLoadTimeout(Duration.ofSeconds(10));
        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeEach
    void initMainPage(){
        Assertions.assertDoesNotThrow( ()-> webDriver.navigate().to("http://users.bugred.ru/"),
                "Страница недоступна");
    }
/*
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

    @Test
    void testSearch(){
        WebElement webElementName = webDriver.findElement(By.name("q"));
        webElementName.click();
        webElementName.sendKeys("testik888@yandex.ru");

        WebElement webElementSearchButton = webDriver.findElement(By.xpath("//button[@type='submit']"));
        webElementSearchButton.click();

    }

    @Test
    void testAuthorization(){

        WebElement webElementLoginButton = webDriver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/a"));
        webElementLoginButton.click();

        WebElement webElementEmail = webDriver.findElement(By.name("login"));
        webElementEmail.click();
        webElementEmail.sendKeys("testik888@yandex.ru");

        WebElement webElementPassword = webDriver.findElement(By.xpath("//input[@name='password']"));
        webElementPassword.click();
        webElementPassword.sendKeys("123321");

        WebElement webElementRegister = webDriver.findElement(By.xpath("//input[@value='Авторизоваться']"));
        webElementRegister.click();

    }

    @Test
    void testExit(){
        WebElement webElementLoginButton = webDriver.findElement(By.xpath("//div[@id='main-menu']/ul/li[2]/a"));
        webElementLoginButton.click();

        WebElement webElementEmail = webDriver.findElement(By.name("login"));
        webElementEmail.click();
        webElementEmail.sendKeys("testik888@yandex.ru");

        WebElement webElementPassword = webDriver.findElement(By.xpath("//input[@name='password']"));
        webElementPassword.click();
        webElementPassword.sendKeys("123321");

        WebElement webElementRegister = webDriver.findElement(By.xpath("//input[@value='Авторизоваться']"));
        webElementRegister.click();

        WebElement webElementDropdown = webDriver.findElement(By.xpath("//li[@id='fat-menu']/a"));
        webElementDropdown.click();

        WebElement webElementExit = webDriver.findElement(By.xpath("//a[contains(text(),'Выход')]"));
        webElementExit.click();

    }
*/
}
