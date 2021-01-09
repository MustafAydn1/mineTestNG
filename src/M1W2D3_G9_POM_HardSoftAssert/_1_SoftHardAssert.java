package M1W2D3_G9_POM_HardSoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _1_SoftHardAssert {

    @Test
    public void hardAssert(){
        String s1="Merhaba";

        Assert.assertEquals("Merhaba123",s1);

        System.out.println("Kod bitti");

    }


    @Test
    public void softAssert(){

        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert _softAssert=new SoftAssert();
// BUNU SAKIN EN USTE YAPIP HEPSİNDE KULLANMA HER Test İÇİN AYRI NESNE OLUŞTUR.??? doğrumu .OMER_BY\TestNG\DataProvider\softHardAssert.java
// yoksa alta false olarak gecip Assert true bile false yaptırır.????

        _softAssert.assertEquals("www.facebook.com/homepage",strHomePage);
        System.out.println("Assert1");

        _softAssert.assertEquals("www.facebook.com/profile",strCartPage);
        System.out.println("Assert2");

        _softAssert.assertEquals("www.facebook.com/settings",strEditAccount);
        System.out.println("Assert3");

        _softAssert.assertAll(); // üstteki assertlerin çalışmasını bu kod sağlar.
//Bunu çalıştırmazsan üsttekiler hiç çalışmaz.hata da vermez.Assert yapmaz...Sadece cıktıları görursun.

//Testlerde hata veren yerler den dolayı kesilme olmaz devam eder.
//Ama  assertAll ın altına  inmez.orada kesilir.

        System.out.println("kod bitişi");















    }



}
