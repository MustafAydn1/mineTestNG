package M1W1D1_G1_TestNgGiris;

import org.testng.annotations.*;

/*
      @BeforeClass      -> Her Classdan önce çalışacaklar buraya yazılıyor.
         @BeforeMethod  -> Her metod çalışmadan önce yapılacakları buraya yazıyoruz
                  @Test  -> testimiz
                  @Test
         @AfterMethod   -> Her metod çalıştıktan sonra yapılacakları buraya yazıyoruz.
      @AfterClass       -> Her class dan sonra yapıalcaklar buraya yazılıyor.
 */
public class _2_Annotations {

    @BeforeClass
    void beforeClass(){
        System.out.println("class tan önce çalışacak bölüm : before Class");

    }

    @AfterClass
    void afterClass(){
        System.out.println("classtan sonra çalışacak bölüm : after Class");
    }




    @BeforeMethod
    void beforeMethod(){
        System.out.println("her metoddan önce çalışacak : Before Method");
    }

    @AfterMethod
    void afterMethod(){

        System.out.println("Her method dan sonra çalışacak : After Method");
    }



    @Test
    void test1(){
        System.out.println("Burası Test1");
    }


    @Test
    void test2(){
        System.out.println("Burası Test2");
    }




}

//Annotations:Anoteyşıns:: Ek Açıklamalar
//Bunların yazılımındaki sıra önemli değil kendisi uygun çıktıyı veriyor.
//herbiri yetki alanının sınırlarında yazılması gereken yere konumlanıyor.
//metod<metod öncesi ve sonrası<class öncesi ve sonrası
//test1 ve test2 yı tek başına çalıştırabilirsin.
//METODLARIN HEPSİ ÇALİŞSIN SONRA BU ÇALIŞSIN dersen: afterbeforeClass ile yapacaksın. sonra dene.

/*
@BeforeSuit
             @BeforeTest
                @BeforeGroups
                    @BeforeClass
                       @BeforeMethod
                           @Test
                           @Test
                       @AfterMEthod
                    @AfterClass
                @AfterGroups
            @AfterTest
         @AfterSuit
 */














