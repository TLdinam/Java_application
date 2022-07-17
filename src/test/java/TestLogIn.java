import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestLogIn {
//    @Test
//    public void testWebDriver() {
//        System.clearProperty("webdriver.chrome.driver");
//        System.setProperty("webdriver.chrome.driver","/Users/taraskarpenko/Engineering/playground/QA-Automation/lesson_23/chromedriver");
////        System.clearProperty("webdriver.gecko.driver");
////        System.setProperty("webdriver.gecko.driver","/Users/taraskarpenko/Engineering/playground/QA-Automation/lesson_23/geckodriver");
//
////        FirefoxOptions options = new FirefoxOptions();
//        ChromeOptions option = new ChromeOptions();
////        option.addArguments("--headless");
//        WebDriver driver = new ChromeDriver(option);
////        WebDriver driver = new FirefoxDriver(options);
////        ChromeOptions option = new ChromeOptions();
////        option.addArguments("--headless");
////        WebDriver driver = new ChromeDriver(option);
//        driver.manage().window().maximize();
//        driver.navigate().to("https://demoqa.com/login");
////        LoginPage loginPage = new LoginPage(driver);
////        loginPage.fillUserNameAndPassword("Taras", "123456");
//
//        WebElement userNameInput = driver.findElement(By.id("userName"));
//
//        userNameInput.sendKeys("Hello");
//
//        WebElement userPwdInput = driver.findElement(By.id("password"));
//        userPwdInput.sendKeys("Hello2");
//        userNameInput.clear();
//        userNameInput.sendKeys("Bye");
//
//        WebElement loginButton = driver.findElement(
//                By.id("login")
//        );
//
//        WebElement leftMenu = driver.findElement(By.className("left-pannel"));
//
//        List<WebElement> wels = driver.findElements(By.xpath(""));
//
//        Select sel = new Select(leftMenu);
//
//
////        Actions builder = new Actions(driver);
////
////        Action mouseParty = builder.moveToElement(userPwdInput).click().moveToElement(loginButton).click().build();
////        mouseParty.perform();
//
//
//        Action act = new Actions(driver)
//                .moveToElement(loginButton)
//                .pause(5000)
//                .contextClick()
//                .pause(5000)
//                .moveByOffset(200, 200)
//                .click()
//                .build();
//        act.perform();
//
////        loginButton.click();
////        System.out.println(loginButton.getTagName());
////
////        WebElement registerButton = driver.findElement(By.id("newUser"));
////        registerButton.sendKeys("Proceed");
////        registerButton.click();
////        WebElement userForm = driver.findElement(By.id("userForm"));
////        WebElement firstNameInput = userForm.findElement(By.name());
////        WebElement lastNameInput = driver.findElement(By.id("lastname"));
////        WebElement userNameInput = driver.findElement(By.id("userName"));
////        WebElement passwordInput = driver.findElement(By.id("password"));
//
////
////        firstNameInput.sendKeys("Taras");
////        lastNameInput.sendKeys("Karpenko");
////        userNameInput.sendKeys("TarKar");
////        passwordInput.sendKeys("123TarKar");
////
////        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
////        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-border"))).click();
////        driver.switchTo().defaultContent();
////        driver.navigate().to("https://demoqa.com/select-menu");
////        WebElement selectElement = driver.findElement(By.id("cars"));
////        selectElement.getText();
////        selectElement.getAttribute("attribute");
////        Select select = new Select(selectElement);
////        select.selectByVisibleText("Volvo");
////        select.getOptions();
////        select.getAllSelectedOptions();
////        select.getFirstSelectedOption()
////        select.selectByValue("1");
////        select.selectByIndex(5);
////        select.isMultiple()
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.quit();
//    }

    WebDriver driver;
    Actions actionsBuilder;

    @BeforeClass
    public void setUp(){
        System.clearProperty("webdriver.chrome.driver");
        System.setProperty("webdriver.chrome.driver","/Users/taraskarpenko/Engineering/playground/QA-Automation/lesson_23/chromedriver");
        ChromeOptions option = new ChromeOptions();
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        actionsBuilder = new Actions(driver);
    }

    @Test
    public void testLogin() {
        driver.navigate().to("https://demoqa.com/login");
        LoginPage page = new LoginPage(driver);
        page.logIn("Taras", "password");

        Alert al = driver.switchTo().alert();

    }
}