package formulatrix;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import formulatrix.pages.NavigationBar;
import formulatrix.pages.ProductList;
import formulatrix.pages.SignUpLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NavigationBarTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static NavigationBar NavigationBar = new NavigationBar();
    private static ProductList ProductList = new ProductList();
    private static SignUpLogin SignUpLogin = new SignUpLogin();

    public NavigationBarTest() {
        driver = formulatrix.Hooks.driver;
        extentTest = formulatrix.Hooks.extentTest;
    }

    @Given("User clicks Home in the navbar")
    public void user_clicks_home(){
        NavigationBar.clickMenuHome();
        extentTest.log(LogStatus.PASS, "User clicks Home in the navbar");
    }
    @When("Scroll down")
    public void scroll_down(){
        scrollByPixels(driver,0,400);
        extentTest.log(LogStatus.PASS, "Scroll down");
    }
    @Then("User successfully access Home Page and views the displayed products")
    public void user_successfully_access_home_page(){
        Assert.assertEquals(NavigationBar.setTxtHome(), "Samsung galaxy s6");
        extentTest.log(LogStatus.PASS, "User successfully access Home Page and views the displayed products");
    }

    @When("User clicks Contact in the navbar")
    public void user_clicks_contact(){
        NavigationBar.clickMenuContact();
        extentTest.log(LogStatus.PASS, "User clicks Contact in the navbar");
    }
    @And("User inputs contact email with 'aishazelnut@gmail.com'")
    public void user_inputs_contact_email(){
        NavigationBar.setInputContactEmail("aishazelnut@gmail.com");
        extentTest.log(LogStatus.PASS, "User inputs contact email with 'aishazelnut@gmail.com'");
    }
    @And("User inputs contact name with 'Aisha'")
    public void user_inputs_contact_name(){
        NavigationBar.setInputContactName("Aisha");
        extentTest.log(LogStatus.PASS, "User inputs contact name with 'Aisha'");
    }
    @And("User inputs message with 'how can i buy this one?'")
    public void user_inputs_message (){
        NavigationBar.setInputMessage("how can i buy this one?");
        extentTest.log(LogStatus.PASS, "User inputs message with 'how can i buy this one?'");
    }
    @And("User clicks Send Message button")
    public void user_clicks_send_message_button(){
        NavigationBar.clickBtnSendMessage();
        extentTest.log(LogStatus.PASS, "User clicks Send Message button");
    }
    @Then("User successfully send message in the Contact menu")
    public void user_successfully_send_message(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Thanks for the message!!");
        extentTest.log(LogStatus.PASS, "User successfully send message in the Contact menu");
    }

    @Given("User clicks Contact in the navbar")
    public void user_clicks_contact_in_the_navbar(){
        NavigationBar.clickMenuContact();
        extentTest.log(LogStatus.PASS, "User clicks Contact in the navbar");
    }
    @When("User inputs contact email with 'aishazelnut'")
    public void user_inputs_contact_email_without_com(){
        NavigationBar.setInputContactEmail("aishazelnut");
        extentTest.log(LogStatus.PASS, "User inputs contact email with 'aishazelnut'");
    }
    @And("User inputs message with 'hehehehehe'")
    public void user_inputs_message_hehe (){
        NavigationBar.setInputMessage("hehehehehe");
        extentTest.log(LogStatus.PASS, "User inputs message with 'hehehehehe'");
    }
    @Then("User can't send message in the Contact menu")
    public void user_cant_send_message(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "an error required.");
        extentTest.log(LogStatus.PASS, "User can't send message in the Contact menu");
    }

    @And("User inputs contact name with '123412341234'")
    public void user_inputs_contact_name_number(){
        NavigationBar.setInputContactName("123412341234");
        extentTest.log(LogStatus.PASS, "User inputs contact name with '123412341234'");
    }

    @Given("User clicks Cart in the navbar")
    public void user_clicks_Cart(){
        NavigationBar.clickMenuCart();
        extentTest.log(LogStatus.PASS, "User clicks Cart in the navbar");
    }
    @When("User clicks Place Order button")
    public void user_clicks_place_order(){
        NavigationBar.clickBtnPlaceOrder();
        extentTest.log(LogStatus.PASS, "User clicks Place Order button");
    }
    @And("User inputs name with 'aisha'")
    public void user_inputs_name(){
        NavigationBar.setInputName();
        extentTest.log(LogStatus.PASS, "User inputs name with 'aisha'");
    }
    @And("User inputs country with 'indonesia'")
    public void user_inputs_country(){
        NavigationBar.setInputCountry();
        extentTest.log(LogStatus.PASS, "User inputs country with 'indonesia'");
    }
    @And("User inputs city with 'jakarta'")
    public void user_inputs_city(){
        NavigationBar.setInputCity();
        extentTest.log(LogStatus.PASS, "User inputs city with 'jakarta'");
    }
    @And("User inputs credit card with '12345'")
    public void user_inputs_credit_card(){
        NavigationBar.setInputCreditCard();
        extentTest.log(LogStatus.PASS, "User inputs credit card with '12345'");
    }
    @And("User inputs month with 'march'")
    public void user_inputs_month(){
        NavigationBar.setInputMonth();
        extentTest.log(LogStatus.PASS, "User inputs month with 'march'");
    }
    @And("User inputs year with '2024'")
    public void user_inputs_year(){
        NavigationBar.setInputYear();
        extentTest.log(LogStatus.PASS, "User inputs year with '2024'");
    }
    @And("User clicks Purchase button")
    public void user_clicks_purchase(){
        NavigationBar.clickBtnPurchase();
        extentTest.log(LogStatus.PASS, "User clicks Purchase button");
    }
    @Then("User can't order without product")
    public void user_cant_order_without_product(){
        Assert.assertEquals(NavigationBar.setTxtOrderProduct(), "an error required.");
        extentTest.log(LogStatus.PASS, "User can't order without product");
    }

    @Given("User clicks OK button on the modal")
    public void user_clicks_ok_modal(){
        NavigationBar.clickBtnOkModal();
        extentTest.log(LogStatus.PASS, "User clicks OK button on the modal");
    }
    @Then("User successfully placed an order one product")
    public void user_successfully_order_one_product(){
        Assert.assertEquals(NavigationBar.setTxtOrderProduct(), "Thank you for your purchase!");
        extentTest.log(LogStatus.PASS, "User successfully placed an order one product");
    }

    @Then("User successfully placed an order 2 products")
    public void user_successfully_order_two_product(){
        Assert.assertEquals(NavigationBar.setTxtOrderProduct(), "Thank you for your purchase!");
        extentTest.log(LogStatus.PASS, "User successfully placed an order 2 products");
    }

    @Then("User gets an error must fill out the form")
    public void user_gets_an_error(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Please fill out Name and Creditcard.");
        extentTest.log(LogStatus.PASS, "User gets an error must fill out the form");
    }

    @Given("User clicks OK button on the alert")
    public void user_clicks_ok_alert(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        extentTest.log(LogStatus.PASS, "User clicks OK button on the alert");
    }
    @Then("User gets an error by being required to fill out a more complete form")
    public void user_gets_an_error_by_being_required_to_fill_out(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Please fill out number phone and adress.");
        extentTest.log(LogStatus.PASS, "User gets an error by being required to fill out a more complete form");
    }

    @And("User clicks Laptops category")
    public void user_clicks_laptops_category(){
        ProductList.clickCategoryOfLaptops();
        extentTest.log(LogStatus.PASS, "User clicks Laptops category");
    }
    @And("User clicks 'Sony vaio i5' product")
    public void user_clicks_sony_vaio(){
    NavigationBar.clickSonyVaio();
        extentTest.log(LogStatus.PASS, "User clicks 'Sony vaio i5' product");
    }
    @And("User clicks Monitors category")
    public void user_clicks_monitors_category(){
        ProductList.clickCategoryOfMonitors();
        extentTest.log(LogStatus.PASS, "User clicks Monitors category");
    }
    @And("User clicks 'ASUS Full HD' product")
    public void user_clicks_asus(){
    NavigationBar.clickAsusFull();
        extentTest.log(LogStatus.PASS, "User clicks 'ASUS Full HD' product");
    }

    @Then("User successfully placed an order 3 products")
    public void user_successfully_order_three_products(){
        Assert.assertEquals(NavigationBar.setTxtOrderProduct(), "Thank you for your purchase!");
        extentTest.log(LogStatus.PASS, "User successfully placed an order 3 products");
    }

    @When("User clicks Login in the navbar")
    public void user_clicks_login_in_the_navbar(){
        SignUpLogin.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User clicks Login in the navbar");
    }
    @And("User inputs username with 'asoy'")
    public void user_inputs_username_with_asoy(){
        SignUpLogin.setInputUsernameLogin("asoy");
        extentTest.log(LogStatus.PASS, "User inputs username with 'asoy'");
    }
    @And("User inputs password with 'asoy'")
    public void user_inputs_password_with_asoy(){
        SignUpLogin.setInputPasswordLogin("asoy");
        extentTest.log(LogStatus.PASS, "User inputs password with 'asoy'");
    }
    @And("User clicks Login Button")
    public void user_clicks_login_button(){
        SignUpLogin.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User clicks Login Button");
    }
    @And("User clicks Log Out in the navbar")
    public void user_clicks_log_out_in_the_navbar(){
        NavigationBar.clickMenuLogOut();
        extentTest.log(LogStatus.PASS, "User clicks Log Out in the navbar");
    }
    @Then("User successfully log out from the account")
    public void user_successfully_log_out(){
        Assert.assertEquals(NavigationBar.setTxtLogOut(), "Sign Up");
        extentTest.log(LogStatus.PASS, "User successfully log out from the account");
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
