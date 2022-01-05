import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AvitoTest {
    private static WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void avitoTest() {
        driver.get("https://www.avito.ru/");

        Select select = new Select(driver.findElement(By.cssSelector("#category")));
        select.selectByVisibleText("Оргтехника и расходники");

        driver.findElement(By.cssSelector("[data-marker='search-form/suggest']")).sendKeys("Принтер");

        driver.findElement(By.cssSelector("[data-marker='search-form/region']")).click();
        driver.findElement(By.cssSelector("[data-marker='popup-location/region/input']")).sendKeys("Владивосток");
        driver.findElement(By.xpath("//div[@data-marker='popup-location/region']//li[@data-marker='suggest(0)']//strong[text()='Владивосток']")).click();
        driver.findElement(By.cssSelector("[data-marker='popup-location/save-button']")).click();

        WebElement checkBox = driver.findElement(By.cssSelector("[data-marker='delivery-filter/text']"));
        if (!checkBox.isSelected()) {
            checkBox.click();
        }

        driver.findElement(By.cssSelector("[data-marker='search-filters/submit-button']")).click();
        driver.findElement(By.xpath("//option[text()='Дороже']")).click();

        List<WebElement> name = driver.findElements(By.cssSelector("[data-marker='catalog-serp'] [itemprop='name']"));
        List<WebElement> price = driver.findElements(By.cssSelector("[data-marker='catalog-serp'] [itemprop='price']"));
        for (int i = 0; i < 3; i++) {
            System.out.println("Название " + (i + 1) + "го принтера: " + name.get(i).getText());
            System.out.println("Цена " + (i + 1) + "го принтера: " + price.get(i).getAttribute("content") + " рублей");
        }
    }
}
