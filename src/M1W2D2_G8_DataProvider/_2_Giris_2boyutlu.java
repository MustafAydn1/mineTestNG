package M1W2D2_G8_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _2_Giris_2boyutlu {


    @Test(dataProvider= "getData")
    public void Username(String username,String password){
        System.out.println(username+" "+password);
    }




    @DataProvider
    public Object[][] getData()
    {

        Object [][] data={
                {"ahmet","abc"},
                {"ayse","xyz"},
                {"mehmet","bcd"}


        };

        return  data;
    }

}

/*
 Object [3][3] data={
                {"ahmet","abc","def"},
                {"ayse","xyz","klm"},
                {"mehmet","bcd","opr"}
                }

burasıda 2 boyutludur. [8][80] , satır,sutun...
 */