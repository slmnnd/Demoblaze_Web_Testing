package formulatrix;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Product;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import formulatrix.pages.ProductList;
import formulatrix.utils.Constant;

public class ProductListTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static ProductList ProductList = new ProductList();

    public ProductListTest() {
        driver = formulatrix.Hooks.driver;
        extentTest = formulatrix.Hooks.extentTest;
    }

    @Given("User access link web Demoblaze")
    public void user_access_link_web_demoblaze() {
        delay(5);
        driver.get(Constant.URL);
        extentTest.log(LogStatus.PASS, "User access link web 'https://www.demoblaze.com/index.html'");
    }
    @When("User clicks 'Samsung galaxy s6' product")
    public void user_clicks_samsung_s6(){
        ProductList.clickSamsungS6();
        extentTest.log(LogStatus.PASS, "User clicks 'Samsung galaxy s6' product");
    }
    @Then("User successfully views the details of the product")
    public void user_successfully_views_the_details(){
        Assert.assertEquals(ProductList.setTxtDetailProduct(), "Samsung galaxy s6");
        extentTest.log(LogStatus.PASS, "User successfully views the details of the product");
    }

    @And("User clicks Add to Cart button")
    public void user_clicks_add_to_cart_button(){
        ProductList.clickBtnAddToCart();
        extentTest.log(LogStatus.PASS, "User clicks Add to Cart button");
    }
    @Then("User successfully Added to Cart the product")
    public void user_successfully_added_to_cart(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Product added.");
        extentTest.log(LogStatus.PASS, "User successfully Added to Cart the product");
    }

    @And("User clicks OK button on alert 'Product added.'")
    public void user_clicks_ok_button(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Product added.");
        extentTest.log(LogStatus.PASS, "User clicks OK button on alert 'Product added.'");
    }
    @Then("User successfully Added to Cart 2 products")
    public void user_added_2_products(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Product added.");
        extentTest.log(LogStatus.PASS, "User successfully Added to Cart 2 products");
    }


    @When("User clicks Phones in category list")
    public void user_clicks_phones_category(){
        ProductList.clickCategoryOfPhones();
        extentTest.log(LogStatus.PASS, "User clicks Phones in category list");
    }
    @And("Scroll down")
    public void scroll_down(){
        scrollByPixels(driver,0,400);
        extentTest.log(LogStatus.PASS, "Scroll down");
    }
    @Then("User can views all the products phones in the displayed product")
    public void all_the_products_phones(){
        Assert.assertEquals(ProductList.setTxtPhones(), "Nokia lumia 1520");
        extentTest.log(LogStatus.PASS, "User can views all the products phones in the displayed product");
    }

    @When("User clicks Laptops in category list")
    public void user_clicks_laptops_category(){
        ProductList.clickCategoryOfLaptops();
        extentTest.log(LogStatus.PASS, "User clicks Laptops in category list");
    }
    @Then("User can views all the products laptops in the displayed product")
    public void all_the_products_laptops(){
        Assert.assertEquals(ProductList.setTxtLaptops(), "Sony vaio i5");
        extentTest.log(LogStatus.PASS, "User can views all the products laptops in the displayed product");
    }


    @When("User clicks Monitors in category list")
    public void user_clicks_monitors_category(){
        ProductList.clickCategoryOfMonitors();
        extentTest.log(LogStatus.PASS, "User clicks Monitors in category list");
    }
    @Then("User can views all the products monitors in the displayed product")
    public void all_the_products_monitors(){
        Assert.assertEquals(ProductList.setTxtMonitors(), "Apple monitor 24");
        extentTest.log(LogStatus.PASS, "User can views all the products monitors in the displayed product");
    }

    public static void scrollByPixels(WebDriver driver,int x, int y) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy({ top: " + y + ", behavior: 'smooth' });");
        System.out.println("Scrolling smooth To Target with Pixels");
    }
    static void delay(long detik) {
        try { //jeda sebelum close
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
