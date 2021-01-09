package M1W2D1_G6_Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MetodDriver;

import java.util.List;
/*
        Senaryo-2
        1- Siteye gidiniz
        2- Specials tiklayiniz
        3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz

     */

public class _2_Specials extends MetodDriver {

    @Test
    void specials(){
        WebElement specialClick=driver.findElement(By.linkText("Specials"));
        specialClick.click();

        List<WebElement> oldPrice=driver.findElements(By.cssSelector("span.price-old"));

        List<WebElement> items=driver.findElements(By.cssSelector("div.product-thumb")); // bu urun sayısını verir.!!!
// bu urun sayısını verir.!!! Bunu hem urunleri sayarak hemde kodu sayarak anlarsın
        Assert.assertTrue(oldPrice.size()==items.size());



// Class ı old price      olanlar
// Class ı product-thumb  olanlar  ... List ler GENELDE class ÜZERİNDEN  BULUNUYORLAR.





    }
}
// Affiliate::affilii:: bağlı şirket... ortaklık
//Bunu class ın, parameter ile ilgisi ne
