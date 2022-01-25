package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ru.И;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.ParameterType;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepDef {
    public WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @ParameterType(".*")
    public Category category(String category) {
        return Category.valueOf(category);
    }

    @ParameterType(".*")
    public Sort sort(String sort) {
        return Sort.valueOf(sort);
    }

    @Пусть("открыт ресурс авито")
    public void openTargetSite() {
        driver.get("https://www.avito.ru/");
    }

    @И("в выпадающем списке категорий выбрана {category}")
    public void enterCategory(Category category) {
        Select select = new Select(driver.findElement(By.cssSelector("#category")));
        select.selectByValue(category.getValue());
    }

    @И("в поле поиска введено значение {word}")
    public void enterProduct(String s) {
        driver.findElement(By.cssSelector("[data-marker='search-form/suggest']")).sendKeys(s);
    }

    @Тогда("кликнуть по выпадающему списку региона")
    public void chooseCity() {
        driver.findElement(By.cssSelector("[data-marker='search-form/region']")).click();
    }

    @Тогда("в поле регион введено значение {word}")
    public void enterCity(String s) {
        driver.findElement(By.cssSelector("[data-marker='popup-location/region/input']")).sendKeys(s);
        driver.findElement(By.xpath("//div[@data-marker='popup-location/region']//li[@data-marker='suggest(0)']//strong[text()='" + s + "']")).click();
    }

    @И("нажата кнопка показать объявления")
    public void showAds() {
        driver.findElement(By.cssSelector("[data-marker='popup-location/save-button']")).click();
    }

    @Тогда("открылась страница результаты по запросу {word}")
    public void shouldOpenPageWithAds(String s) {
        Assert.assertTrue(driver.getTitle().matches("^" + s + ".*"));
    }

    @И("активирован чекбокс только с фотографией")
    public void selectPhotographyCheckbox() {
        WebElement checkBox = driver.findElement(By.xpath("//span[text()=\"только с фото\"]"));
        if (!checkBox.isSelected())
            checkBox.click();
    }

    @И("в выпадающем списке сортировки выбрано значение {sort}")
    public void chooseSort(Sort s) {
        driver.findElement(By.cssSelector("[data-marker='search-filters/submit-button']")).click();
        driver.findElement(By.xpath("//option[text()='" + s.getValue() + "']")).click();
    }

    @И("в консоль выведено значение названия и цены {int} первых товаров")
    public void writeAdsInConsole(int n) {
        List<WebElement> texts = driver.findElements(By.cssSelector("[data-marker='catalog-serp'] [itemprop='name']"));
        List<WebElement> prices = driver.findElements(By.cssSelector("[data-marker='catalog-serp'] [itemprop='price']"));
        for (int i = 0; i < n; i++) {
            System.out.print(texts.get(i).getText() + " - ");
            System.out.println(prices.get(i).getAttribute("content") + " рублей");
        }
    }
}
