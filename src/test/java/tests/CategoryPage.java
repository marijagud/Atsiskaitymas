package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class CategoryPage {
    WebDriver driver;
    public CategoryPage(WebDriver driver) {
        this.driver = driver;
    }
    //--------------Locators----------------
    By categoryName = By.cssSelector("a[href$='/login'");
    By listViewButton = By.cssSelector("");
    By productTitle = By.tagName("");
    By addToCartButton = By.xpath("");
    //--------------Methods-----------------
    public String getCategoryName() {
        return driver.findElement(categoryName).getText();
    }
    public void changeToListView() {
        driver.findElement(listViewButton).click();
    }
    public void addProductToBasket(String productToAdd) {
        private void getAllProducts for (WebElement product : getAllProducts()) {
            String productName = product.findElement(productTitle).getText();
            if (productName.equals(productToAdd)) {
                product.findElement(addToCartButton).click();
                break;
            }
        }

        () {
        }

    private void getAllProducts() {
    }
