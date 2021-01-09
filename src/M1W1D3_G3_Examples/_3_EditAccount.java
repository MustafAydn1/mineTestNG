package M1W1D3_G3_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.MetodDriver;
import utils.Tools;

/*
     1- Siteyi açınız.
     2- Edit Account a tıklatınız.
     3- Yeni isim ve soyisim göndererek Continue yapınız.
     4- İşlem sonucunu kontrol ediniz.
     5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
    */
public class _3_EditAccount extends MetodDriver {



//Testin içini dışarıdan bir metodla yaptık
    @Test
    void editAccount(){
        AccountEdit("Mustafa","Aydin");
        System.out.println("Ad ve Soyad değiştirildi");

        AccountEdit("asd123","asd");
        System.out.println("Ad ve Soyad eski halını aldı");


    }

    void AccountEdit(String name,String surname){

        WebElement editAccBtn=driver.findElement(By.linkText("Edit Account"));
        editAccBtn.click();

        WebElement firstName =driver.findElement(By.id("input-firstname"));
        //String  name =firstName.getAttribute("value");  // Eger ilk degeri tutup kullanmak istersen önce böyle al.
        firstName.clear();
        firstName.sendKeys(name);

        WebElement lastname=driver.findElement(By.id("input-lastname"));
        //String oldlastname=lastname.getAttribute("value");// Eger ilk degeri tutup kullanmak istersen önce böyle al.
        lastname.clear();
        lastname.sendKeys(surname);

        driver.findElement(By.cssSelector(".btn.btn-primary")).click();

        Tools.successMessageValidation(driver); // Assert i de metodun içinde yapabilirsin.Testin içi sade kalır.

      //  WebElement yazi=driver.findElement(By.cssSelector(".alert.alert-success"));
      //  Assert.assertTrue(yazi.getText().contains("Success"));
    }


}
/*
Burada metodda neden stattic yazmadık?
aynı classda aoldugu için değil,
bu metod herhangi bir (static yazılı) yerde çalışmayacagı için yazmadık.

main:::  public static void main(String[] args)  burada static ifade var.Testlerde ise yok.

Demek ki main olmaksızın Sadece Testin dışında class da metodlar yapılabilir
Çağırılıp testin içinde çalıştırılabilir

 */