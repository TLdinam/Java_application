import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ShopPage {
    WebDriver driver;
    Actions actionBuilder;
    public ShopPage(WebDriver driver) {
        this.driver = driver;
        actionBuilder = new Actions(driver);
    }

    public void moveToItemByTitleAndHover(String title) {
        String itemXPath = String.format(
                "//a[text()='%s']/../a[@class='product-primary__media-wrap']/img", title);
        WebElement dressImage = driver.findElement(By.xpath(itemXPath));
        this.actionBuilder.moveToElement(dressImage).build().perform();
    }

    public String clickOnThumbAndReturnSource(String title, int thumbNumber) {
        String thumbsXPath = String.format(
                "//a[text()='%s']/../div[@class='product-primary__thumb']/div/img", title);
        List<WebElement> thumbNails = driver.findElements(By.xpath(thumbsXPath));
        actionBuilder.moveToElement(thumbNails.get(thumbNumber)).build().perform();
        thumbNails.get(thumbNumber).click();
        return thumbNails.get(thumbNumber).getAttribute("data-src");
    }

    public String getItemMainImageSource(String title) {
        String itemXPath = String.format(
                "//a[text()='%s']/../a[@class='product-primary__media-wrap']/img", title);
        WebElement dressImage = driver.findElement(By.xpath(itemXPath));
        return dressImage.getAttribute("src");
    }
}