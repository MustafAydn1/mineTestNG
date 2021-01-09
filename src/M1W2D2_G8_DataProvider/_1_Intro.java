package M1W2D2_G8_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/**
 * Aşağıdaki ilki ile Dataproviderın içindeki bütün veriler tek tek test e gönderilerek
 * data sayısı kadar test çalıştırılı, dataların olduğu yere DataProvider annottion ı konur.
 * çalıştırılacak teste ise dataProvider = "getData"  bölümü eklenir.
 */
public class _1_Intro {



    @Test(dataProvider= "getData") //senin dataprovider in getData isimli metoddur.
    public void Username(String username){
        System.out.println(username);
    }

/*
//Data provider must return Object[][]/Object[] or Iterator<Object[]>/Iterator<Object>
Ya tek boyutlu olmalı yada 2 boyutlu olmalı..

 */
@DataProvider // bu metoda dataprovider görevi verildi. Test e data aktaran, bir DataProvider metodu.
public Object[] getData()  // dataProvider in tipi Object olmak zorundadır.Burayı String yap kızarır.
{

    Object [] data={
            "ahmet",
            "ayse",
            "mehmet",
            "fatma",

    };

    return  data;
}
    //***************************************************************************************************

    @Test(dataProvider= "usersDataProvider") //Dataprovider in ismi burada metod adı yerine kullanıldı.2 durumda olur
    public void UsernameTest2(String username){
        System.out.println(username);
    }

    /*
    //Data provider must return Object[][]/Object[] or Iterator<Object[]>/Iterator<Object>
    Ya tek boyutlu olmalıyada 2 boyutlu olmalı..

     */
    @DataProvider (name="usersDataProvider")// DataProvider a isim verdim.
    public Object[] getData2()  // dataProvider in tipi Object olmak zorundadır.Burayı String yap kızarır.
    {

        Object [] data={
                "ahmet2",
                "ayse2",
                "mehmet2",
                "fatma2",

        };

        return  data;
    }








}


//DataProvider::