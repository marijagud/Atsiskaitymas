package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.omg.CORBA.Object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class antras {

    @Test(dataProvider = "products")
    public void antras(String productToAdd) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        waitMiliseconds(10000);
        driver.get("https://www.eurovaistine.lt");

        CommonPage commonPage = new CommonPage(driver);
        pages.CategoryPage categoryPage = new pages.CategoryPage(driver);


        String categoryToOpen = "Gripex, plėvele dengtos tabletės, N12";
        String subCategoryToOpen = "Gripex, plėvele dengtos tabletės, N24";
        String expectedMessage = "Success: You have added " + productToAdd + " to your shopping cart!";

        commonPage.expandMainCategory(categoryToOpen);
        commonPage.openSubCategory(subCategoryToOpen);

        @DataProvider(name = "products");
        public new Object[][]{
                {"Gripex, plėvele dengtos tabletės, N12"},
                {"Gripex, plėvele dengtos tabletės, N24"},


        @Test driver.findElement(By.id("onetrust-accept-btn-handler")).click();


    }

}

    private void waitMiliseconds(int i) {
    }
