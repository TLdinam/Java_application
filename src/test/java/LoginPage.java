import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "userName")
    private WebElement userNameInput;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordInput;

    //    @FindBy(how = How.)
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillUserNameAndPassword(String username, String password) {
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void logIn(String username, String password) {
        fillUserNameAndPassword(username, password);
        clickLoginButton();
    }
}