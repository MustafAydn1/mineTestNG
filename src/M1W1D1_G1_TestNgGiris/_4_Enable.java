package M1W1D1_G1_TestNgGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _4_Enable {

    //WebDriver driver= new ChromeDriver();

   public static WebDriver driver; //aşagıdaki metodlarda ve her pakette görebilsin diye en uste koyduk

    @BeforeClass
    void BeforeClass(){
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
         driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();

         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

         driver.get("http://opencart.abstracta.us/index.php?route=account/login"); // hep bu sitede çalışcaz.

        System.out.println("ne isteydisen onu yapacagım");
    }


    @AfterClass
    void AfterClass() throws InterruptedException {
        System.out.println("ne isteydisen onu yaptım.....");

        Thread.sleep(15000);
        driver.quit();
    }

    @Test
    void test1(){
        String u1=driver.getCurrentUrl();
        System.out.println(u1);
    }

    @Test(enabled = false,priority = 0) // test2 şimdilik çalışmasın demektir.birden çok sey yazabilirsin.
    void test2(){

        String u2=driver.getTitle();
        System.out.println(u2);
    }

    @Test
    void test3(){
        String u3= driver.getWindowHandle();
        System.out.println(u3);

    }


//enable= olanak vermek
//disable=engellendi

}
