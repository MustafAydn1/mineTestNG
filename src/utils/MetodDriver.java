package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class MetodDriver {
    //WebDriver driver= new ChromeDriver();

    public static WebDriver driver; //aşagıdaki metodlarda ve her pakette görebilsin diye en uste koyduk


    // direk bu class çağrıldığı anda canlı olması için static blok içine alındı.
    // DİKKAT AYNI ANDA TEK browser çalıştıracaksan static yaz,
    // firefox...vb paralel çalışacaksa static i sil


    @BeforeClass
  public static void BeforeClass()  {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("http://opencart.abstracta.us/index.php?route=account/login"); // hep bu sitede çalışcaz.

        driver.findElement(By.name("email")).sendKeys("asd@gmail.com ");
        driver.findElement(By.name("password")).sendKeys("123qweasd");
        driver.findElement(By.cssSelector("input[value='Login']")).click();


     WebDriverWait wait=new WebDriverWait(driver,5);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("details-button")));

        WebElement btnGelismis=  driver.findElement(By.id("details-button"));
        btnGelismis.click();

     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("proceed-link")));

     driver.findElement(By.id("proceed-link")).click();


    }


    @AfterClass
    public static void AfterClass() throws InterruptedException {
        Thread.sleep(15000);
        //driver.quit();
    }
}
