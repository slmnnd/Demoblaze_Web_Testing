package formulatrix;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import formulatrix.pages.SignUpLogin;
import formulatrix.utils.Constant;
public class SignUpLoginTest {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static SignUpLogin SignUpLogin = new SignUpLogin();

    public SignUpLoginTest() {
        driver = formulatrix.Hooks.driver;
        extentTest = formulatrix.Hooks.extentTest;
    }

    @Given("User access link web")
    public void user_access_link_web() {
        delay(5);
        driver.get(Constant.URL);
        extentTest.log(LogStatus.PASS, "User access link web 'https://www.demoblaze.com/index.html'");
    }
    @When("User click Sign Up in the navbar")
    public void user_click_sign_up(){
        delay(5);
        SignUpLogin.clickSignUp();
        extentTest.log(LogStatus.PASS, "User click Sign Up in the navbar");
    }
    @And("Input valid username with 'alo123'")
    public void input_valid_username_sign_up(){
        delay(5);
        SignUpLogin.setInputUsernameSignUp("alo123");
        extentTest.log(LogStatus.PASS, "Input valid username with 'alo123'");
    }
    @And("Input valid password with 'alo123'")
    public void input_valid_password_sign_up(){
        delay(5);
        SignUpLogin.setInputPasswordSignUp("alo123");
        extentTest.log(LogStatus.PASS, "Input valid password with 'alo123'");
    }
    @And("Click Sign Up button")
    public void click_sign_up_button(){
        SignUpLogin.clickBtnSignUp();
        extentTest.log(LogStatus.PASS, "Click Sign Up button");
    }
    @Then("User successfully Sign Up with username and password with combination of letters and numbers")
    public void user_successfully_sign_up(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Sign up successful.");
        extentTest.log(LogStatus.PASS, "User successfully Sign Up with username and password with combination of letters and numbers");
    }

    @When("Input username with '23456123'")
    public void input_username_with_numbers(){
        SignUpLogin.setInputUsernameSignUp("23456123");
        extentTest.log(LogStatus.PASS, "Input valid username with '23456123'");
    }
    @And("Input password with '23456123'")
    public void input_password_with_numbers(){
        SignUpLogin.setInputPasswordSignUp("23456123");
        extentTest.log(LogStatus.PASS, "Input valid password with '23456123'");
    }
    @Then("User successfully Sign Up with username and password just numbers")
    public void user_successfully_sign_up_with_just_numbers(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Sign up successful.");
        extentTest.log(LogStatus.PASS, "User successfully Sign Up with username and password just numbers");
    }

    @When("Input username with '#$%%$#'")
    public void input_username_with_special(){
        SignUpLogin.setInputUsernameSignUp("#$%%$#");
        extentTest.log(LogStatus.PASS, "Input username with '#$%%$#'");
    }
    @And("Input password with '#$%%$#'")
    public void input_password_with_special(){
        SignUpLogin.setInputPasswordSignUp("#$%%$#");
        extentTest.log(LogStatus.PASS, "Input password with '#$%%$#'");
    }
    @Then("User can't Sign Up with username and password with special characters")
    public void user_cant_sign_up_with_special_characters(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Cannot Sign up successful.");
        extentTest.log(LogStatus.PASS, "User can't Sign Up with username and password with special characters");
    }

    @When("Input password with '123qwe'")
    public void input_password_only(){
        SignUpLogin.setInputPasswordSignUp("123qwe");
        extentTest.log(LogStatus.PASS, "Input password with '123qwe'");
    }
    @Then("User gets an error alert when Sign Up without username")
    public void error_sign_up_without_username(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Please fill out Username and Password.");
        extentTest.log(LogStatus.PASS, "User gets an error alert when Sign Up without username");
    }

    @When("Input username with '123qwe'")
    public void input_username_only(){
        SignUpLogin.setInputUsernameSignUp("123qwe");
        extentTest.log(LogStatus.PASS, "Input username with '123qwe'");
    }
    @Then("User gets an error alert when Sign Up without password")
    public void error_sign_up_without_password(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Please fill out Username and Password.");
        extentTest.log(LogStatus.PASS, "User gets an error alert when Sign Up without username");
    }

    @Then("User gets an error alert when Sign Up without username and password")
    public void error_sign_up_without_username_password(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Please fill out Username and Password.");
        extentTest.log(LogStatus.PASS, "User gets an error alert when Sign Up without username and password");
    }

    @Then("User gets an error alert when Sign Up with an existing username")
    public void error_sign_up_with_an_existing_username(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "This user already exist.");
        extentTest.log(LogStatus.PASS, "User gets an error alert when Sign Up with an existing username");
    }

    @When("Input username with 'a'")
    public void input_username_with_a(){
        SignUpLogin.setInputUsernameSignUp("a");
        extentTest.log(LogStatus.PASS, "Input username with 'a'");
    }
    @And("Input password with 'a'")
    public void input_password_with_a(){
        SignUpLogin.setInputPasswordSignUp("a");
        extentTest.log(LogStatus.PASS, "Input password with 'a'");
    }
    @Then("User can't signs up with just one letter in username and password")
    public void user_cant_sign_up_with_one_letter(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "This user already exist.");
        extentTest.log(LogStatus.PASS, "User can't signs up with just one letter in username and password");
    }

    @When("Input username with 'abcdefghijklmnopqrstuvwxyz'")
    public void input_username_with_all_letters(){
        SignUpLogin.setInputUsernameSignUp("abcdefghijklmnopqrstuvwxyz");
        extentTest.log(LogStatus.PASS, "Input username with 'abcdefghijklmnopqrstuvwxyz'");
    }
    @And("Input password with 'abcdefghijklmnopqrstuvwxyz'")
    public void input_password_with_all_letters(){
        SignUpLogin.setInputPasswordSignUp("abcdefghijklmnopqrstuvwxyz");
        extentTest.log(LogStatus.PASS, "Input password with 'abcdefghijklmnopqrstuvwxyz'");
    }
    @Then("User successfully signs up with all letters in username and password")
    public void user_can_sign_up_with_all_letters(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Sign up successful."); //This user already exist.
        extentTest.log(LogStatus.PASS, "User successfully signs up with all letters in username and password");
    }

    @When("Input username with 'abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz'")
    public void input_username_with_unlimited_letters(){
        SignUpLogin.setInputUsernameSignUp("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        extentTest.log(LogStatus.PASS, "Input username with 'abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz'");
    }
    @And("Input password with 'abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz'")
    public void input_password_with_unlimited_letters(){
        SignUpLogin.setInputPasswordSignUp("a");
        extentTest.log(LogStatus.PASS, "Input password with 'abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz'");
    }
    @Then("User can't signs up with unlimited letters in username and password")
    public void user_cant_sign_up_with_unlimited_letters(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "cannot Sign up successful.");
        extentTest.log(LogStatus.PASS, "User can't signs up with unlimited letters in username and password");
    }

    @When("Input username with '1234567890'")
    public void input_username_with_all_numbers(){
        SignUpLogin.setInputUsernameSignUp("1234567890");
        extentTest.log(LogStatus.PASS, "Input username with '1234567890'");
    }
    @And("Input password with '1234567890'")
    public void input_password_with_all_numbers(){
        SignUpLogin.setInputPasswordSignUp("1234567890");
        extentTest.log(LogStatus.PASS, "Input password with '1234567890'");
    }
    @Then("User can't signs up with all numbers in username and password")
    public void user_can_sign_up_with_all_numbers(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "cannot Sign up successful.");
        extentTest.log(LogStatus.PASS, "User can't signs up with all numbers in username and password");
    }

    @When("Input username with '12345678901234567890'")
    public void input_username_with_unlimited_numbers(){
        SignUpLogin.setInputUsernameSignUp("12345678901234567890");
        extentTest.log(LogStatus.PASS, "Input username with '12345678901234567890'");
    }
    @And("Input password with '12345678901234567890'")
    public void input_password_with_unlimited_numbers(){
        SignUpLogin.setInputPasswordSignUp("a");
        extentTest.log(LogStatus.PASS, "Input password with '12345678901234567890'");
    }
    @Then("User can't signs up with unlimited numbers in username and password")
    public void user_cant_sign_up_with_unlimited_numbers(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "cannot Sign up successful.");
        extentTest.log(LogStatus.PASS, "User can't signs up with unlimited letters in username and password");
    }


    //===========================================================================

    @When("User click Log In in the navbar")
    public void user_click_log_in(){
        delay(3);
        SignUpLogin.clickLogin();
        extentTest.log(LogStatus.PASS,"");
    }
    @And("Input valid username with 'asoy'")
    public void input_valid_username_asoy(){
        SignUpLogin.setInputUsernameLogin("asoy");
        extentTest.log(LogStatus.PASS, "Input valid username for login");
    }
    @And("Input valid password with 'asoy'")
    public void input_valid_password_asoy(){
        SignUpLogin.setInputPasswordLogin("asoy");
        extentTest.log(LogStatus.PASS, "Input valid password for login");
    }
    @And("Click Log In button")
    public void click_log_in_button(){
        SignUpLogin.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "Click Log In button");
    }
    @Then("User success login with valid username and password")
    public void user_success_login(){
        delay(5);
        Assert.assertEquals(SignUpLogin.setTxtLogin(), "Welcome asoy");
        extentTest.log(LogStatus.PASS, "User success login with valid username and password");
    }

    @And("Input password with 'asyo'")
    public void input_wrong_password(){
        SignUpLogin.setInputPasswordLogin("asoy");
        extentTest.log(LogStatus.PASS, "Input password with 'asyo'");
    }

    @Then("User can't Login with valid username and wrong password")
    public void user_cant_login_with_wrong_password(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Wrong password.");
        extentTest.log(LogStatus.PASS, "User can't Login with valid username and wrong password");
    }

    @When("Input username with 'asyo'")
    public void input_wrong_username(){
        SignUpLogin.setInputUsernameLogin("asyo");
        extentTest.log(LogStatus.PASS, "Input username with 'asyo'");
    }
    @Then("User can't Login with wrong username and valid password")
    public void user_cant_login_with_wrong_username(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "User does not exist.");
        extentTest.log(LogStatus.PASS, "User can't Login with wrong username and valid password");
    }

    @Then("User can't Login with just username without password")
    public void user_cant_login_with_just_username(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Please fill out Username and Password.");
        extentTest.log(LogStatus.PASS, "Please fill out Username and Password.");
    }

    @Then("User can't Login with just password without username")
    public void user_cant_login_with_just_password(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Please fill out Username and Password.");
        extentTest.log(LogStatus.PASS, "User can't Login with just password without username");
    }

    @Then("User can't Login without username and password")
    public void user_cant_login_without_both(){
        delay(3);
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Assert.assertEquals(alertMessage, "Please fill out Username and Password.");
        extentTest.log(LogStatus.PASS, "User can't Login without username and password");
    }



    static void delay(long detik) {
        try { //jeda sebelum close
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
