package M1W1D3_G3_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.MetodDriver;
import utils.Tools;

/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.
  3- Newsletter  üyelik işlemini, üye ise , üyelikten çıkma, değilse ekleme şeklinde yapınız.
 */
public class _2_Subscribe extends MetodDriver {

   /*
    Bu bölgede değişken tanımlayabilirsiniz.
    Ama kendi başına kod çalıştıramazsınız.
     */

   WebElement subscribeTikla;

    @Test (priority = 0)
    void Sucribe(){
         subscribeTikla=driver.findElement(By.xpath("//a[text()='Subscribe / unsubscribe to newsletter']"));
        subscribeTikla.click();

        WebElement yesRadioButton=driver.findElement(By.xpath("//input[@value='1']"));
        yesRadioButton.click();

        WebElement continueButton=driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();

        Tools.successMessageValidation(driver);
/*
        WebElement yazi=driver.findElement(By.cssSelector(".alert.alert-success"));
        String yaziActual=yazi.getText();
        String yaziExpected="Success: Your newsletter subscription has been successfully updated!";

       // Assert.assertEquals(yaziActual,yaziExpected);
        Assert.assertTrue(yaziActual.contains("Success"));


 */
        System.out.println("Subcribe olundu");


//Burayı defalarca yapamadım cünkü..Açıklama aşagıda...

    }


    @Test(priority = 1)
    void unSucribe(){
         subscribeTikla=driver.findElement(By.xpath("//a[text()='Subscribe / unsubscribe to newsletter']"));
        subscribeTikla.click();
        WebElement noRadioButton =driver.findElement(By.cssSelector("input[value='0']"));
        noRadioButton.click();
        WebElement continueButton=driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();


        Tools.successMessageValidation(driver);

/*
        WebElement yazi=driver.findElement(By.cssSelector(".alert.alert-success"));
        String yaziActual=yazi.getText();
        String yaziExpected="Success: Your newsletter subscription has been successfully updated!";
        //Assert.assertEquals(yaziActual,yaziExpected);
          Assert.assertTrue(yaziActual.contains("Success"));

         */
        System.out.println("UnSubcribe oldu");

    }

    String b="ali";

    @Test(priority = 2)
 void subscribeFunctionForBoth() throws InterruptedException {
         WebElement subscribeTikla=driver.findElement(By.xpath("//a[text()='Subscribe / unsubscribe to newsletter']"));
//WebElement hem burada hem en üstte var neden hata vermiyor.???
        subscribeTikla.click();

        WebElement noRadioButton =driver.findElement(By.cssSelector("input[value='0']"));

        WebElement yesRadioButton=driver.findElement(By.xpath("//input[@value='1']"));

        Thread.sleep(1000);
        if(yesRadioButton.isSelected()){
            noRadioButton.click();
        }
        else yesRadioButton.click();



        System.out.println(b);

        //if(noRadioButton.isSelected()){ // Başka yapacak alternatif yoksa sadece else de ve geç...
        //    yesRadioButton.click();


        WebElement continueButton=driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();

        Tools.successMessageValidation(driver);
/*
        WebElement yazi=driver.findElement(By.cssSelector(".alert.alert-success"));
        String yaziActual=yazi.getText();
        String yaziExpected="Success: Your newsletter subscription has been successfully updated!";

        Assert.assertTrue(yaziActual.contains("Success"));

        //Assert.assertEquals(yaziActual,yaziExpected);

 */
        System.out.println("bothSubcribe oldu");
    }






}

/*
SORUDAN ÖĞRENDİKLERİM:
TESTLERİN DIŞINDA ::
WebElement subscribeTikla=driver.findElement(By.xpath("//a[text()='Subscribe / unsubscribe to newsletter']"));
İFADESİ YAZILAMAZ. AMA ;; WebElement subscribeTikla;  YAZILABİLİR.


TESTİN İÇİNDE :: Altalta olarak
WebElement subscribeTikla=driver.findElement(By.xpath("//a[text()='Subscribe / unsubscribe to newsletter']"));
WebElement yesRadioButton=driver.findElement(By.xpath("//input[@value='1']"));
   subscribeTikla.click();
   yesRadioButton.click();
formatında yazılamaz. herbir click kendi elementinin hemen altına yazılmalı. toplu halde olamaz.(Neden????)






 */