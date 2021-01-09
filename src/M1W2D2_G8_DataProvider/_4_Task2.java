package M1W2D2_G8_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.MetodDriver;
import utils.ParameterDriver;

import java.util.List;

/*
1-_4_Task1 deki testi Parameterdriver ile yapınız.
2-_4_Task1 deki testi ; M1W2D1_G6_Parameter\_1_ContactUs.java  için yapınız... birden fazla mesaj atınız.

 */
public class _4_Task2 extends ParameterDriver {


    @Test(dataProvider = "getData")
    public void searchFunctionality(String aranankelime) { // sendKeys ve Assert e uzanan parameter

        WebElement inputSearch = driver.findElement(By.name("search"));
        inputSearch.clear();
        inputSearch.sendKeys(aranankelime);                                 // değişen kısımlar

        driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();

        List<WebElement> itemNameList = driver.findElements(By.xpath("//h4/a"));

        for (WebElement itemName : itemNameList) {

            System.out.println(itemName.getText());

            // Assert.assertTrue(itemName.getText().contains(arananKelime));   // değişen kısımlar
            Assert.assertTrue(itemName.getText().toLowerCase().contains(aranankelime.toLowerCase()));
            //(arananKelime.toLowerCase()) bu kısmı yapınca  artık Mac-Samsung da çalışıyor.

        }

    }

    @DataProvider
    public Object [] getData(){

        Object [] data={
                "Mac",
                "Laptop"
        };

        return data;
    }


}
