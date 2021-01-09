package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class Tools {

    //iki list in elemanlarını birbiri ile karşılaştırma...
    public static void compareToList(List<WebElement> menuActualist, List<String> menuExpectedList) {

        int i = 0; // bu sayede fori ye gerek kalmadan foreach ile indexli compare yaparsın.
        for (WebElement eleman : menuActualist) {
            Assert.assertEquals(eleman.getText(), menuExpectedList.get(i++));
        }
    }



 public static  void successMessageValidation(WebDriver driver){ // driver bir metodun parametresi olabiliyormuş.
// yazi kısmına ulaşmak için driver buraya gelmeliydi.yoksa elemanı bulamam ve kullanamam...

     WebElement yazi=driver.findElement(By.cssSelector(".alert.alert-success"));
     String yaziActual=yazi.getText();
     Assert.assertTrue(yaziActual.contains("uccess"));

 }

 public static  void selecByIndex(WebElement dropdownName){


        Select _select=new Select(dropdownName);
        _select.selectByIndex(RandomNumberGenerator(_select.getOptions().size()));

 }


 public  static int RandomNumberGenerator(int max){

     Random rnd=new Random();

     int RandomNumber=rnd.nextInt(max-1)+1;
     return RandomNumber;

    // int aa=(int)(Math.random()*(max-min)+min);

//  int RandomNumber=rnd.nextInt(10); --->> 0,1,2,...9 a kadar uretir.
//  max-1 ile (0,8) olur... (max-1)+1 ile (1,9) oldu.

//Aslında biz:: rnd.nextInt(max-min)+min; yapmış olduk. (10-1)+1
// böylece 0 dahil olmuyor. yani select yazısı dahşl değil.
//   012345678
//   123456789
 }


 public static  void ListContainsString(List<WebElement> menuActualList,String expectedString){ // güzel bir metod oldu

        boolean bulundu=false;
        for(WebElement el: menuActualList){

            if(el.getText().contains(expectedString)){
                bulundu=true;
                break;
            }
        }

        Assert.assertTrue(bulundu,"Aranan Eleman Bulunamadı");
 }



}