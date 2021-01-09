package M1W1D5_G5_xml;

import org.testng.annotations.Test;

public class _3_Groups {

//Regression -->> Sistemin Genelini kontrol eden testlere denir.
    @Test(groups="Regression")
    public  void Test1(){ System.out.println("Test -- 1 Regression"); }

    @Test(groups="Regression")
    public  void Test2(){ System.out.println("Test -- 2 Regression"); }

    @Test(groups="Regression")
    public  void Test7(){ System.out.println("Test -- 7 Regression"); }

    @Test(groups="Regression")
    public  void Test5(){ System.out.println("Test -- 5 Regression"); }


    //SmokeTest -->> Sistemin En genel Haliyle Çalışılırlığının testi.
    @Test (groups="SmokeTest")
    public  void Test3(){ System.out.println("Test -- 3 SmokeTest"); }

    @Test(groups="SmokeTest")
    public  void Test4(){ System.out.println("Test -- 4 SmokeTest"); }

    @Test
    public  void Test6(){ System.out.println("Test -- 6"); }
//Groups olarak çalıştırılıdıgında grubu olmayanlar çalısmayacak.

}



/*
Buradaki grup isimlerini biz verdik. Başka isimlerde olabilirdi.

Regression:: regreşin:: Gerileme,Geri çekilme...

Regression -->> Sistemin Genelini kontrol eden testlere denir. ???
SmokeTest -->> Sistemin En genel Haliyle Çalışılırlığının testi.???

 */