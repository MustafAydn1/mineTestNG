package M1W2D1_G6_Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.MetodDriver;
import utils.ParameterDriver;

import java.util.List;

/*
      Senaryo ;
      1- Siteyi açınız.
      2- samsung kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda samsung kelimesinin geçtiğini doğrulayınız.

    */
public class _4_searchFunctionality_Firefox extends ParameterDriver {



    @Test
    @Parameters("arananKelime")
    public void searchFunctionality(String arananKelime){

        WebElement inputSearch=driver.findElement(By.name("search"));
        inputSearch.sendKeys(arananKelime);                                          // değişti

        driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();

        List<WebElement> itemNameList=driver.findElements(By.xpath("//h4/a"));

        for(WebElement itemName :itemNameList){

            System.out.println(itemName.getText());

            //Assert.assertTrue(itemName.getText().contains(arananKelime));
           Assert.assertTrue(itemName.getText().toLowerCase().contains(arananKelime));   // değişti


        }
    }
}
//Eacial:: iş yapma metodolojisi,tekniği...iş akışı...yapılacaklar... organizasyon planı...










/*
    @Test
    @Parameters("arananKelime")
    public void SearchFunction(String searchText)
    {
        //String searchText="mac";

        WebElement searchInput=driver.findElement(By.cssSelector("input[name='search']"));
        searchInput.sendKeys(searchText);

        WebElement searchButton=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> itemNameList = driver.findElements(By.cssSelector("h4>a"));

        for(WebElement itemName : itemNameList)
        {
            System.out.println(itemName.getText());
            Assert.assertTrue(itemName.getText().toLowerCase().contains(searchText));
        }
    }
 */