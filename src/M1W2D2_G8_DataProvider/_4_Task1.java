package M1W2D2_G8_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.MetodDriver;

import java.util.List;

public class _4_Task1 extends MetodDriver {
    /**
     * Daha önceki derslerde yaptıgımız(M1W2D1_G6_Parameter\_3_searchFunctionality.java) search fonksiyonu
     * Mac ve Laptop için DataProvider ile yapınız
     * Kodları kopyalayıp alınız.

     */





    @Test(dataProvider = "getData")
    public void searchFunctionality(String arananKelime) { // sendKeys ve Assert e uzanan parameter

         WebElement inputSearch = driver.findElement(By.name("search"));
         inputSearch.clear();
         inputSearch.sendKeys(arananKelime);                                 // değişen kısımlar

         driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();

         List<WebElement> itemNameList = driver.findElements(By.xpath("//h4/a"));

         for (WebElement itemName : itemNameList) {

             System.out.println(itemName.getText());

             // Assert.assertTrue(itemName.getText().contains(arananKelime));   // değişen kısımlar
             Assert.assertTrue(itemName.getText().toLowerCase().contains(arananKelime.toLowerCase()));
             //(arananKelime.toLowerCase()) bu kısmı yapınca  artık Mac-Samsung da çalışıyor.
         }
     }
    @DataProvider
     public Object [] getData(){

        Object [] data={
                "Mac",
                "Laptop"
        };

        return data;
     }


}

// neden ParameterDriver değil de MetodDriver ile çalıştırdık... Çünkü...

/*
 Bunu xml uzeriden de aynı şekilde yaptık. Farkı nedir?
 1-) daha kısa ve öz. extradan xml dosyası açmana  gerek yok.
 2-) XML aCSAN BİLE::
  xml de her test her arama için bir test syntax ı hazırlaman gerek.
 altalta olmuyor.M1W2D1_G6_Parameter\_4_searchFunctionality.xml bu dosyaya bak görursun.
 Burada ise listeden yuzlerce yollarsın.
 */
