package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

// bu classı firefox vb. extra browserlar uzerinden de çalışma yapabilmek için yaptık.

public class ParameterDriver {
    //WebDriver driver= new ChromeDriver();

   protected WebDriver driver; //aşagıdaki metodlarda ve her pakette görebilsin diye en uste koyduk.

//NEDEN protected:: Sadece bu class dan extends edilenler görsun diye... public i silip protected yazdık
/*

 Aşagıda Parameters; Bir testin içinde değil, bu class çalışmadan önce burayı çalıştır, demektir.
 İlgili testlerde zaten herhangi bir class ın içinde olmalıdır.

 <parameter name="browser"  value="firefox"></parameter>    ------>> BU YÜZDEN parameters("browser") yazıldı
 <parameter name="arananKelime"  value="samsung"></parameter>


 */
    @BeforeClass
    @Parameters("browser") // Bu kısım xml in içinde burayı görebilmesi için verildi.
  protected   void BeforeClass(String browser) throws InterruptedException {

        if(browser.equalsIgnoreCase("chrome")){

            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
            System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
            driver= new ChromeDriver();

        }
        else if (browser.equalsIgnoreCase("firefox")){

            System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");

            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null"); // kırmızı yazıları azaltmak için
              driver= new FirefoxDriver();

        }



        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("http://opencart.abstracta.us/index.php?route=account/login"); // hep bu sitede çalışcaz.

        //Login
        driver.findElement(By.name("email")).sendKeys("asd@gmail.com ");
        driver.findElement(By.name("password")).sendKeys("123qweasd");
        driver.findElement(By.cssSelector("input[value='Login']")).click();

      if(!browser.equalsIgnoreCase("firefox")) { // firefox da bu kısım çıkmayabiliyor.bunu aşmak için.

          //Güvenlik İşlemlerini Aşmak İçin
          WebDriverWait wait = new WebDriverWait(driver, 5);
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("details-button")));

          WebElement btnGelismis = driver.findElement(By.id("details-button"));
          btnGelismis.click();

          wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("proceed-link")));

          //  WebElement

          driver.findElement(By.id("proceed-link")).click();
      }



    }

    @AfterClass
    public  void AfterClass() throws InterruptedException {
       // Thread.sleep(15000);
        //driver.quit();
    }

}

//ÖNEMLİ ::: Buradaki try-catch kullanımı ögren heryerde lazım olabilir...!!!!
/* try-catch ile yapılan

   try {

            //Güvenlik işlemlerini aşmak için
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button[id='details-button']")));

            WebElement sitedonusBtn = driver.findElement(By.cssSelector("button[id='details-button']"));
            sitedonusBtn.click();

            WebElement btnSiteIlerleLinki = driver.findElement(By.id("proceed-link"));
            btnSiteIlerleLinki.click();
        }
        catch (Exception ex){}
 */