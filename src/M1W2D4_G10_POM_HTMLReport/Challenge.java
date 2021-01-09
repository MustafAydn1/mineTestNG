package M1W2D4_G10_POM_HTMLReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseStaticDriver;
import utils.MetodDriver;

import java.util.concurrent.TimeUnit;

public class Challenge  {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.autotrader.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        //STEP-1: On the home page, verify that the following types of elements are present:

        //Browse by Make
        WebElement browseByMake = driver.findElement(By.xpath("(//div[@class='display-inline-block'])[1]"));
        Assert.assertTrue(browseByMake.getText().contains("Browse by Make"));


    }
}




/*
Kodlama Egzersizi:
Otomasyonunuz için Chrome tarayıcısını kullanarak www.autotrader.com adresine gidin ve
aşağıdaki adımlar.
• Ana sayfada, aşağıdaki öğe türlerinin mevcut olduğunu doğrulayın:
o Bağlantılar: Markaya Göre Göz At, Stile Göre Göz At, Gelişmiş Arama
o Düğmeler: Ara
o Açılır menüler: Marka, Model
• Ana sayfadaki "Gelişmiş Arama" bağlantısını tıklayın ve aşağıdakileri yapın:
o "Posta kodu" metin kutusuna 30004 girin
o "Koşul" altındaki "Onaylı" onay kutusunu seçin
o "Stil" altındaki "Dönüştürülebilir" onay kutusunu seçin
o "Yıl" açılır menülerini şu şekilde güncelleyin: 2017'den itibaren olarak seçin ve
Yıl olarak 2020
o Marka, Model ve Döşeme bölümünde 'BMW' olarak Yap'ı seçin
• Sayfanın altındaki "Ara" düğmesini tıklayın
• Sonraki sayfada bazı sonuçlar / listeler göreceksiniz
• Sonuçlar sayfasında yalnızca BMW otomobilleri gördüğünüzü iddia edin
• Konsola giriş yapın, sonuçlar sayfasında gördüğünüz toplam araba / liste sayısı
*******************************************************

Coding Exercise:http://www.autotrader.com/
Using Chrome browser for your automation, go to www.autotrader.com and automate the
following steps.
• On the home page, verify that the following types of elements are present:
o Links: Browse by Make, Browse by Style, Advanced Search
o Buttons: Search
o Drop downs: Make, Model
• Click on the ‘Advanced Search’ link on the home page and do the following:
o Enter 30004 in the ‘Zip code’ text box
o Select the ‘Certified’ check box under ‘Condition’
o Select the ‘Convertible’ check box under ‘Style’
o Update the ‘Year’ drop down menus as follows: select 2017 as From year and select
2020 as To year
o Select Make as ‘BMW’ under Make, Model & Trim section
• Click the button ‘Search’ at the bottom of the page
• You will see some results/listings in the next page
• Assert that you see only BMW cars in the results page
• Log to the console, the total number of cars/listings you see in the results page

 */