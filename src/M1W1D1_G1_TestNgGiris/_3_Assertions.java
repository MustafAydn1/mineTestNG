package M1W1D1_G1_TestNgGiris;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _3_Assertions {


    @Test
    void equalOrnek(){
    String s1="Mehmet";
    String s2="Ali";
        Assert.assertEquals(s1,s2,"testNG de message sona yazılır"); //içerikleri aynı olursa gecer.

    }

    @Test
    void TrueOrnek(){
        int a=5;
        int b=7;

        a=b; // burada b degerini a ya atar. nehirdeki alabalık
        System.out.println(a);
        System.out.println(b);
        Assert.assertTrue(a==b); // a=b demeseydik testi gecemezdi. hafızadaki referans isimlerine bakar.
    }


    String s; //şeklinde classın gövdesinde bu ifadeyi yazarsam(tanımlama),metodun içinde hiçbirsey yazmadan assert yap
//Yani bir başlangıc degeri verince test metodun içinde o kullanılır.BUradaki başlangıç degeri null dur.



    @Test
    void nullOrnek(){
       // String s;            // 1 bu şekilde yaparsa assert bile kabul etmedi. kızardı.Doğmamış ama adı olan çocuk.
       // String s="";         // 2 bu şekilde içi null değil dedi.
       String s=null;         // 3 bu şekilde kabul etti.
        Assert.assertNull(s);    // BUNLARIN NEDENLERİNİ HATIRLAYAMADIM.?????


    }
}
// null vermesi için s=null demeliyim.

//Assertions::Assörşins::iddialar...