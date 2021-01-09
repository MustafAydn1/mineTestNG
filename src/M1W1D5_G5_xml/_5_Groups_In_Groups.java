package M1W1D5_G5_xml;

import org.testng.annotations.Test;

public class _5_Groups_In_Groups {


        @Test(groups= {"Smoke"})
        public void test1()
        {
            System.out.println("Bu bir Smoke  Testidir");
        }


        @Test(groups= {"Regression"})
        public void test2()
        {
            System.out.println("Bu bir Regression Testidir");
        }


        @Test(groups= {"unknow"})
        public void test3()
        {
            System.out.println("Bu bir unknow Testidir");
        }
}
