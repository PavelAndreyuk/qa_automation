import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AvitoTest {

    private static WebDriver driver;

    @BeforeClass(description = "Set up driver and its properties")
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass(description = "Close the driver")
    public void tearDown() {
        driver.quit();
    }

    @Step("Open target site")
    public void openTargetSite() {
        driver.get("https://www.avito.ru/");
        getScreenshot();
    }

    @Step("Enter a category")
    public void enterCategory() {
        Select select = new Select(driver.findElement(By.cssSelector("#category")));
        select.selectByVisibleText("Оргтехника и расходники");
        driver.findElement(By.cssSelector("[data-marker='search-form/suggest']")).sendKeys("Принтер");
        getScreenshot();
    }

    @Step("Enter a city")
    public void enterCity() {
        driver.findElement(By.cssSelector("[data-marker='search-form/region']")).click();
        driver.findElement(By.cssSelector("[data-marker='popup-location/region/input']")).sendKeys("Владивосток");
        driver.findElement(By.xpath("//div[@data-marker='popup-location/region']//li[@data-marker='suggest(0)']//strong[text()='Владивосток']")).click();
        driver.findElement(By.cssSelector("[data-marker='popup-location/save-button']")).click();
        getScreenshot();
    }

    @Step("Select delivery checkbox")
    public void selectDeliveryCheckbox() {
        WebElement checkBox = driver.findElement(By.cssSelector("[data-marker='delivery-filter/text']"));
        if (!checkBox.isSelected()) {
            checkBox.click();
        }
        getScreenshot();
    }

    @Step("Sort by price")
    public void sortByPrice() {
        driver.findElement(By.cssSelector("[data-marker='search-filters/submit-button']")).click();
        driver.findElement(By.xpath("//option[text()='Дороже']")).click();
        getScreenshot();
    }

    @Step("Write results into console")
    public void writeResultsIntoConsole() {
        List<WebElement> name = driver.findElements(By.cssSelector("[data-marker='catalog-serp'] [itemprop='name']"));
        List<WebElement> price = driver.findElements(By.cssSelector("[data-marker='catalog-serp'] [itemprop='price']"));
        for (int i = 0; i < 3; i++) {
            System.out.println("Название " + (i + 1) + "го принтера: " + name.get(i).getText());
            System.out.println("Цена " + (i + 1) + "го принтера: " + price.get(i).getAttribute("content") + " рублей");
        }
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] getScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Test
    public void AvitoTest() {
        openTargetSite();
        enterCategory();
        enterCity();
        selectDeliveryCheckbox();
        sortByPrice();
        writeResultsIntoConsole();
    }
}
