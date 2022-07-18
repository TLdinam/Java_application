import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesPage extends PageWithLeftMenu {

    @FindBy(id = "addNewRecordButton")
    WebElement addButton;

    WebDriver driver;
    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToElements() {
        elementsLeftItem.click();
    }
}