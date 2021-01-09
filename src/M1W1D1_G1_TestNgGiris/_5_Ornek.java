package M1W1D1_G1_TestNgGiris;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MetodDriver;

/*
   Senaryo ;
     1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
     2- asd@gmail.com  ve 123qweasd   bilgileri ile login olan test metodunu yazınız.
     3- Login olup olmadığınızı assert ile kontrol ediniz.
     4- bir utils paketi açınız ve buraya beforeClass ve afterClass metdolarını yazarak
        genel kullanım için MetodWebDriver isimli test klasını tanımlayınız.
 */
public class _5_Ornek extends MetodDriver {



    @Test
    void loginTest() throws InterruptedException {


        driver.findElement(By.name("email")).sendKeys("asd@gmail.com ");
        driver.findElement(By.name("password")).sendKeys("123qweasd");
        driver.findElement(By.cssSelector("input[value='Login']")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("details-button")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("proceed-link")).click();
        Thread.sleep(2000);

        String title = driver.getTitle();
        System.out.println("Son sayfa Title i= "+title); // Son acilan kismin basligini yazdirdim.
        Assert.assertEquals(title, "My Account"); // olmasi gereken title ile son title i karsilastirdim.


    }

/*
 bazı sayfaların acılışında popuplar veya güvenlik uyarıları bazen çıkıp bazen çıkmıyorsa,
 try-catch e alırsın. Çıkarsa bunu yap,çıkmazsa da hata adını yazdır ve yoluna devam et... Ahmet a.den.

  Aslında bu if ile de saglanamaz mı? Şu eleman görunurse bunu yap.Görunmezse devam et.
  Farkı ne olur???

 */

















}





/*
Ömer Gökerdün 23:01
 driver.findElement(By.id("input-email")).sendKeys("asd@gmail.com");
     driver.findElement(By.id("input-password")).sendKeys("123qweasd");


      driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
Thread.sleep(2000);
        driver.findElement(By.cssSelector("button#details-button")).click();

        driver.findElement(By.cssSelector("#proceed-link")).click();
        Thread.sleep(2000);



      String sonuc=driver.findElement(By.xpath("//h2[text()='My Account']")).getText();



        Assert.assertEquals("My Account",sonuc);
bu sekilde yaptim o kismi geciyorum tiklayarak
AhmetTdün 23:07
public class Ornek extends MethodDriver {

    @Test
    public void login() {
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        driver.findElement(By.id("input-email")).sendKeys("asd@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("123qweasd");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.not(ExpectedConditions.titleIs("Account Login")));
        if (driver.getTitle().equals("Privacy error")){
            driver.findElement(By.id("details-button")).click();
            driver.findElement(By.id("proceed-link")).click();
        }
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.not(ExpectedConditions.titleIs("Privacy error")));

        String title = driver.getTitle();
        Assert.assertEquals(title, "My Account");

    }
}
 */
