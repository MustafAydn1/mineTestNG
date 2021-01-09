package Proje_testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.*;
import java.util.concurrent.TimeUnit;

/*
Task 2)
Step 1) Siteye gidin    http://demowebshop.tricentis.com/
Step 2) email ve password girin.
Step 3) Apparel & Shoes ‘ a tıklayın.
Step 4) Blue and green Sneaker ‘e tıklayın.( Green and blue olan değil, 	‘Blue and green sneaker olana tıklayın !!’ )
Step 5) Wishliste ekleyin.
Step 6) Ürünlerin olduğu sayfaya geri gelin. (Step 3 teki sayfaya)
Step 7) 50’s Rockabilly Polka Dot Top JR Plus Size ürününe tıklayın ve wishlist’e  ekleyin.
Step 8) Wishlist sayfasına gidin.
Step 9) Eklediğimiz ürünlerin, wishlist sayfasında gözüküp gözükmediğini doğrulayın.

 */
public class Task2 {


    @Test
    @Parameters({"username", "password"})
// sıralama önemli... 1. yi 1. Stringe,2.yi 2. stringe atıyor...
    public void task1_elements(String userna, String password) { //userna bıraktık ki farkı anlayalım.

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://demowebshop.tricentis.com/");

        projeListElements1 projeElements1 = new projeListElements1(driver);

        projeElements1.Login.click();
        projeElements1.email.sendKeys(userna);
        projeElements1.password.sendKeys(password);
        projeElements1.loginClick.click();
        projeElements1.apprShoes.click();
        projeElements1.addToCart.click();
        String product1=projeElements1.product1.getText();
        projeElements1.apprShoeswishListClick.click();

        driver.navigate().back();

        projeElements1._50sAddCart.click();
        String product2=projeElements1.product2.getText();
        projeElements1._50sWishList.click();
        projeElements1.wishListClick.click();

        boolean bulundu=false;
        for(WebElement el:projeElements1.wishTotallist ){

            if(el.getText().contains(product1)){
                bulundu=true;
                break;
            }
        }

        Assert.assertTrue(bulundu,"Aranan Eleman Bulunamadı");


        boolean bulundu1=false;
        for(WebElement el:projeElements1.wishTotallist ){

            if(el.getText().contains(product2)){
                bulundu1=true;
                break;
            }
        }

        Assert.assertTrue(bulundu,"Aranan Eleman Bulunamadı");



            }

        }


















/*
        int i=0;
        boolean bulunabildi=false;
      for(WebElement el: projeElements1.wishTotallist){  // Set yada map yada dizi yap kısa yolunu bul
        if ( el.getText().contains(urunler.get(i++))){
            bulunabildi=true;
        }

          Assert.assertTrue(bulunabildi);
      }

//************************************************************************************************************
        ArrayList<String > urunler=new ArrayList<>(List.of(product1,product2));

     //   boolean bulunabildi=false;
        for (int i = 0; i <urunler.size() ; i++) {

            for (int j = 0; j <projeElements1.wishTotallist.size(); j++) {

                Assert.assertTrue(urunler.get(i).equalsIgnoreCase(projeElements1.wishTotallist.get(i).getText()));
                   // bulunabildi=true;
                    //break;

 */

















/*

        boolean bulundu=false;
        for(WebElement el:projeElements1.wishTotallist ){

            if(el.getText().contains(product1)){
                bulundu=true;
                break;
            }
        }

        Assert.assertTrue(bulundu,"Aranan Eleman Bulunamadı");


        boolean bulundu1=false;
        for(WebElement el:projeElements1.wishTotallist ){

            if(el.getText().contains(product2)){
                bulundu1=true;
                break;
            }
        }

        Assert.assertTrue(bulundu,"Aranan Eleman Bulunamadı");
 */