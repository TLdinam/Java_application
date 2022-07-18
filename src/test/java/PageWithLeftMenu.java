import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class PageWithLeftMenu {
    @FindBy(xpath = "//*[text()='Elements']")
    WebElement elementsLeftItem;

    @FindBy(xpath = "//*[text()='Web Tables']")
    WebElement webTablesLeftItem;
}