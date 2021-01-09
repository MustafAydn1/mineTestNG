package M1W1D5_G5_xml;

import org.testng.annotations.Test;

public class _4_BelongsToMultipleGroups {


    @Test(groups= {"Group ABC"})
    public void testcase1()
    {
        System.out.println("Test case belonging to Group ABC");
    }


    @Test(groups= {"Group ABC","Group DEF"})
    public void testcase2()
    {
        System.out.println("Test case belonging to both Group ABC and Group DEF");
    }

    @Test(groups= {"Group DEF"})
    public void testcase3()
    {
        System.out.println("Test case belonging to Group DEF");

    }

    @Test(groups= {"Group DEF GHJ"})
    public void testcase4()
    {
        System.out.println("Test case belonging to Group DEF GHJ");

    }


}
