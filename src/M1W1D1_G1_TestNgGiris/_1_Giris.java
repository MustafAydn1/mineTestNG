package M1W1D1_G1_TestNgGiris;

import org.testng.annotations.Test;
//priorty::pariordi:: Öncelik

public class _1_Giris {

    //Eger test metodlarına sıralama verilmezse Alfabetik sırasına göre çalışır.

    @Test (priority = 1)
    void webSitesiAc(){

        System.out.println("Driver tanımlandı, ve web sitesi açıldı...");
    }

    @Test (priority = 2)
    void loginTest(){
        System.out.println("Login Test işlemleri yapıldı...");
    } //bunlar birer metod

    @Test (priority = 3)

    void driverKapat() {
        System.out.println("Driver kapatıldı ve Çıkıldı...");
    }





}


//başına @Test yazınca herbiri tekbaşına main gibi çalışıyor.
//Başında @ olanlara annotation   denir.
//Default Suite:: Testin tamamı demek.Yapılan işlemlerin tamamı
//priority  yazmazsam alfabetik sıraya göre yapar. 0 yada 1 den başlayabilir.
//priority ::pariordi:: Öncelik
//Aynı sayı varsa yinae alfabetik gider...
//Sayı yoksa ve alfabe de yoksa olmayanların default degerleri 0 dır
//Testlerin tamamı çalışmıyorsa en ustteki calıştırdan yapmamış olabılırsın.




/*
    Default Suite
    Total tests run: 3, Failures: 0, Skips: 0

    Varsayılan Süit
Toplam test sayısı: 3, Başarısızlıklar: 0, Atlamalar: 0
 */