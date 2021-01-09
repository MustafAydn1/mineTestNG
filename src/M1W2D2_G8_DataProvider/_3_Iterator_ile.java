package M1W2D2_G8_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _3_Iterator_ile {

    @Test(dataProvider= "getData") //Dikkat:: Aşagıdaki DataProvider,burası ise dataProvider ...
    public void LoginTest(String userName){
        System.out.println(userName);

    }

    @DataProvider // bu kısım test değil, sadece Test e data aktaran, bir DataProvider metodu.
    public Iterator<Object> getData(){ // bu kısımda Object ten başkası olamaz.

        List<Object> data =new ArrayList<>(); // Return tipi Iterator AMA List yapılır...
        data.add("Ahmet");
        data.add("Ayşe");
        data.add(234);
        data.add(45.456);

        return data.iterator(); // yazılışa dikkat:: Ustteki Iterator, returndaki iterator--> data.iterator. NEDEN????

    }

    //**********************************************************************
    //               2 Boyutlu

    @Test( dataProvider= "getData2")
    public void loginTest2(String username,String password){
        System.out.println(username+ " " +password);

    }

    @DataProvider
    public Iterator<Object[]> getData2(){

       List<Object []> data= new ArrayList<>(); //Elemanları Object dizi olan bir List

       data.add(new Object[]{"Ali","xyz"});// List in herbir elemanı object dizi oldugu için Object dizisi eklendi
       data.add(new Object[]{"Veli","klm"});
       data.add(new Object[]{"Mehmet","abc"});


        return data.iterator();
    }

}
//giden her bir bilgi için bir test yaptıgına dikkat et....

//iterator konusuna detaylı bi şekilde bakmalısın...
//Kullanım yerleri*** Alanları***Syntax ı ...
