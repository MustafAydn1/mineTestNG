package M1W2D4_G10_POM_HTMLReport;
/*Senaryo;

1.Test

1- Siteye gidiniz
2-ipod ürününü aratınız
3-çıkan elemanlardan ilkini Add Wish butonuna tıklayınız
4-Daha sonra Wishlist e tıklayınız
5-burada cıkan urun ile ilk tıklanan urunun aynı olup olmaıgını dogrulayınız

2.Test
1-WishList i boşaltınız



 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.MetodDriver;
import utils.ParameterDriver;
import utils.Tools;

import java.util.List;

public class _1_WishList_ParameterDriver extends ParameterDriver {


    @Test                                // ipod yazılıyken::
    @Parameters("itemName")             //tName yazdım xml çalıştı... bu ne iş...<parameter name="itemName"  value="ipod"></parameter> yokkende calıştı
    public  void addToWishList(String itemName){    //String itemName yazmadım  xml çalıştı



        WebElement inputSearch=driver.findElement(By.cssSelector(".form-control.input-lg"));
        inputSearch.sendKeys(itemName);

        WebElement searchTikla= driver.findElement(By.cssSelector(".btn.btn-default.btn-lg"));
        searchTikla.click();


        List<WebElement>searchProduct=driver.findElements(By.cssSelector("div.caption>h4"));//Urunlerin isim listesi
        int RandumNumber= Tools.RandomNumberGenerator(searchProduct.size());// üretilen random sayı
        String searchProductItemName=searchProduct.get(RandumNumber).getText();//Random tıklanan urunun adı

        System.out.println("1-"+ searchProductItemName);//

        List<WebElement> searchResultWishList=driver.findElements(By.xpath("//button[@data-original-title='Add to Wish List']"));//bulunan WishList
// burada yanlış yeri buldum. bunu nasıl anlayacagım???? i.fa.fa-heart... en içteki kalp ile kare arasındaki farkı nasıl anlarım


        searchResultWishList.get(RandumNumber).click(); //Random tıklanan Wishlist kalp işaretlisi


        WebElement wishListBtn=driver.findElement(By.cssSelector("#wishlist-total>i+span"));
        wishListBtn.click();

        List<WebElement> tableNames=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//td[2]")); //Listeyi bi görelim bakalım.

        for(WebElement items:tableNames) {
            System.out.println(items.getText());
        }

      //Listedeki urunler ile tıklanan urunu karşılaştırdık.
       Tools.ListContainsString(tableNames,searchProductItemName);










    }













}
/*
        M1W2D1_G6_Parameter._4_searchFunctionality_Firefox searchTest=new _4_searchFunctionality_Firefox();

        searchTest.searchFunctionality(itemName);
 buna sen ugras bakalım

 */