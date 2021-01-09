package M1W2D1_G6_Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.MetodDriver;

import java.util.List;
/*
      Senaryo ;
      1- Siteyi açınız.
      2- mac kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.

    */
public class _3_searchFunctionality extends MetodDriver {



    @Test
    @Parameters("arananKelime") // XML e uzanan name
    public void searchFunctionality(String kelimeGir){ // sendKeys ve Assert e uzanan parameter. value nin degeridir?

        WebElement inputSearch=driver.findElement(By.name("search"));
        inputSearch.sendKeys(kelimeGir);                                 // değişen kısımlar

        driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();

        List<WebElement> itemNameList=driver.findElements(By.xpath("//h4/a"));

        for(WebElement itemName :itemNameList){

            System.out.println(itemName.getText());

           // Assert.assertTrue(itemName.getText().contains(arananKelime));   // değişen kısımlar
            Assert.assertTrue(itemName.getText().toLowerCase().contains(kelimeGir.toLowerCase()));
          //  System.out.println(itemName.getText());


// to Lower bunun farkı nedir?mac zaten kucuk... diğer tarafın tamamını mı kucultuyor...
// Evet, toLowerCase ekleyince koddan gelenyazıyı da kucultuyor,benimkinin hepsi zaten kucuk...

        }
    }
}


// :: Eacial:: iş yapma metodolojisi,tekniği...iş akışı...yapılacaklar... organizasyon planı...

