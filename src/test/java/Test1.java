import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test1 {
    WebDriver webDriver;
    Actions actionsBuilder;

//    public Test1(){
//        webDriver.get("https://demoqa.com/webtables");
//        PageFactory.initElements(webDriver,this);
//    }
    public Test1 FillTheField (String firstNameValue, String lastNameValue,String emailAdressValue,String ageValue,
            String salaryValue,String departmentValue){

        webTables.click();
        addButton.click();
        firstNameInputField.click();
        firstNameInputField.sendKeys(firstNameValue);
        lastNameInputField.click();
        lastNameInputField.sendKeys(lastNameValue);
        emailAdress.click();
        emailAdress.sendKeys(emailAdressValue);
        age.click();
        age.sendKeys(ageValue);
        salary.click();
        salary.sendKeys(salaryValue);
        department.click();
        department.sendKeys(departmentValue);
        submitButton.click();


        return this;
    }

    @BeforeClass
    public void setUp() {
        System.clearProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver", "C:\\Course\\Java_application\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        webDriver = new ChromeDriver(option);
        webDriver.manage().window().maximize();
        actionsBuilder = new Actions(webDriver);
    }

    @FindBy(xpath = "//*[@id=\"item-4\"]/*[text()='Buttons']")
    public WebElement buttonInList;

    @FindBy(id = "TLwph")
    public WebElement clickMeButton;

    @FindBy(id = "dynamicClickMessage")
    public WebElement dynamicClickMessage;

    @FindBy(xpath = "//*[@id=\"item-3\"]/*[text()='Web Tables']")
    public WebElement webTables;

    @FindBy(id = "//*[@id=\"addNewRecordButton\"]")
    public WebElement addButton;

    @FindBy(id = "//*[@id=\"firstName\"]")
    public WebElement firstNameInputField;

    @FindBy(id = "//*[@id=\"lastName\"]")
    public WebElement lastNameInputField;

    @FindBy(id = "//*[@id=\"userEmail\"]")
    public WebElement emailAdress;

    @FindBy(id = "//*[@id=\"age\"]")
    public WebElement age;

    @FindBy(id = "//*[@id=\"salary\"]")
    public WebElement salary;

    @FindBy(id = "//*[@id=\"department\"]")
    public WebElement department;

    @FindBy(id = "//*[@id=\"submit\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@class=\"rt-tr -even\"]/*[text()='tarasl@gmail.com']")
    public WebElement myStringAFterAdding;

    @Test
    public void OpenBrowser() {
        webDriver.navigate().to("https://demoqa.com/elements");

    }


    @Test
    public void TestClickMe() {
        buttonInList.click();
        clickMeButton.click();
        dynamicClickMessage.getText();
        webDriver.quit();
    }

    @Test
    public void FilltheFieldAndSubmitForm() {

        webDriver.navigate().to("https://demoqa.com/webtables");
        String firstName = "Taras";
        String lastName = "Lytobcehnko";
        String email = "tarsfl@gmail.com";
        String age = "23";
        String salary = "123";
        String department = "IT";
        Test1 test1 = new Test1();
        test1.FillTheField(firstName,lastName,email,age,salary,department);
        webDriver.findElement(By.xpath("//*[@class=\"rt-tr -even\"]/*[text()='tarasl@gmail.com']"));
        

    }
    @AfterTest
    public void CloseAll() {
        webDriver.close();
        webDriver.quit();
    }
}