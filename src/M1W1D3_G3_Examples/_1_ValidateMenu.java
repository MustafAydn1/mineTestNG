package M1W1D3_G3_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.MetodDriver;
import utils.Tools;

import java.util.ArrayList;
import java.util.List;
/*
      Senaryo;
      1- Siteyi açınız
      2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
   */
public class _1_ValidateMenu extends MetodDriver {

      @Test
    void Validate(){

          List<String > menuExpectedList=new ArrayList<>();
          menuExpectedList.add("Desktops");
          menuExpectedList.add("Laptops & Notebooks");
          menuExpectedList.add("Components");
          menuExpectedList.add("Tablets");
          menuExpectedList.add("Software");
          menuExpectedList.add("Phones & PDAs");
          menuExpectedList.add("Cameras");
          menuExpectedList.add("MP3 Players");


          By menu=By.cssSelector(".nav.navbar-nav>*"); // değişken tipi By oldu ... (ul.nav.navbar-nav>*)

          List<WebElement> menuActualist=driver.findElements(menu);

          Tools.compareToList(menuActualist,menuExpectedList);





      }



}


/*
          int i=0;
          for (WebElement eleman:menuActualist){
              Assert.assertEquals(eleman.getText(),menuExpectedList.get(i++));

             // if(!eleman.getText().equals(menuExpectedList.get(i++)) // burasını incele hoca != yaptı...doğru mu???
             // System.out.println("Menu bulunamadı");


          }



 */