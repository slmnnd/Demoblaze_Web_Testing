package formulatrix.pages;

import formulatrix.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpLogin {
    private WebDriver driver;

    public SignUpLogin() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //signup
    @FindBy(xpath = "//a[@id='signin2']")
    private WebElement signUp;
    @FindBy(xpath = "//input[@id='sign-username']")
    private WebElement inputUsernameSignUp;
    @FindBy(xpath = "//input[@id='sign-password']")
    private WebElement inputPasswordSignUp;
    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    private WebElement btnSignUp;
    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")
    private WebElement btnCloseSignUp;
    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[1]/button/span")
    private WebElement btnXSignUp ;

    public void clickSignUp(){
        signUp.click();
    }
    public void setInputUsernameSignUp(String username){
        inputUsernameSignUp.sendKeys(username);
    }
    public void setInputPasswordSignUp(String password){
        inputPasswordSignUp.sendKeys(password);
    }
    public void clickBtnSignUp(){
        btnSignUp.click();
    }
    public void clickBtnCloseSignUp(){
        btnCloseSignUp.click();
    }
    public void clickBtnXSignUp(){
        btnXSignUp.click();
    }

    //login
    @FindBy(xpath = "//a[@id='login2']")
    private WebElement logIn;
    @FindBy(xpath = "//input[@id='loginusername']")
    private WebElement inputUsernameLogin;
    @FindBy(xpath = "//input[@id='loginpassword']")
    private WebElement inputPasswordLogin;
    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    private WebElement btnLogin;
    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")
    private WebElement btnCloseLogin;
    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[1]/button/span")
    private WebElement btnXLogin;
    @FindBy(xpath = "//*[@id=\"nameofuser\"]")
    private WebElement txtLogin ;

    public void clickLogin(){
        logIn.click();
    }
    public void setInputUsernameLogin(String username){
        inputUsernameLogin.sendKeys(username);
    }
    public void setInputPasswordLogin(String password){
        inputPasswordLogin.sendKeys(password);
    }
    public void clickBtnLogin(){
        btnLogin.click();
    }
    public void clickBtnCloseLogin(){
        btnCloseLogin.click();
    }
    public void clickBtnXLogin(){
        btnXLogin.click();
    }
    public String setTxtLogin(){
    return txtLogin.getText();
    }


}
