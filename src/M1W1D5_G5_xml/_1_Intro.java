package M1W1D5_G5_xml;

import org.testng.annotations.*;

public class _1_Intro {

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


    @BeforeSuite
    public void bSuite(){ System.out.println("Before Suite"); }

    @BeforeTest
    public void bTest(){ System.out.println("Before Test"); } // TÜM TESTLERDEN ÖNCEKİ KISIM,birçok farklı test içerir.

    @BeforeGroups
    public void bGroups(){System.out.println("Before Groups"); } // BİRÇOK CLASSI BİR ARADA YAPABİLİRSİN


    @BeforeClass
    public void bClass(){ System.out.println("Before Class"); }// burası tam olarak neresidir? işlevi nedir?


//butun before lara pre-condition
//butun after lara post-condition


    @BeforeMethod
    public void bMethod(){ System.out.println("Before Method"); }

    @Test
    public void TestIntro1(){ System.out.println("Test1111"); }

    @Test
    public void TestIntro2(){ System.out.println("Test2222"); }

    @AfterMethod
    public void aMethod(){ System.out.println("After Method"); }

    @AfterClass
    public void aClass(){ System.out.println("After Class"); }

    @AfterGroups
    public void aGroups(){System.out.println("After Groups"); }

    @AfterTest
    public void aTest(){ System.out.println("After Test"); }

    @AfterSuite
    public void aSuite(){ System.out.println("After Suite"); }

}

/*
Suite:: sui :: Maiyyet, Takım...

Orijinal olarak  arka arkaya çalınacak bir dizi enstrümantal beste.

bir hükümdarın ya da yüksek rütbeli başka bir kişinin katıldığı bir grup insan.

 */

