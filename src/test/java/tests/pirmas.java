package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

public class pirmas {




    @Test
    public void pirmas() {

        String email = "testas@testas.com ";
        String password = "Testauskas10";
        WebElement private Object WebElement;
        String expectedErrorText = "Norėdami tęsti, privalote sutikti su taisyklėmis ir privatumo politika.";



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        waitMiliseconds(10000);
        driver.get("https://www.eurovaistine.lt");

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.cssSelector("a[href$='/login']")).click();


        boolean newLoginFormVisible = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/div[2]/div/a")).isDisplayed();
        boolean returningRegistrationFormVisible = driver.findElement(By.cssSelector(".header-user.collapse")).isDisplayed();
        Assert.assertTrue("Login form is not visible", newLoginFormVisible);
        Assert.assertTrue("Registration form is not visible", returningRegistrationFormVisible);

        
        driver.findElement(By.id("_username")).sendKeys(email);
        driver.findElement(By.name("_password")).sendKeys(password);
        WebElement = driver.findElement(By.id("_password"));
        WebElement check_box = driver.findElement(By.xpath("//*[@id=\"customer_registration_marketing_generalOffers\"]"));
        check_box.click();
        driver.findElement(By.xpath("//*[@id=\"customer_registration\"]/button")).click();


        String actualErrorText = driver.findElement(By.cssSelector("")).getText();
        Assert.assertEquals(actualErrorText,expectedErrorText, "Text was different than expected");






        driver.quit();

    }

    private void waitMiliseconds(int i) {
    }

}
