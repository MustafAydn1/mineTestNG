package M1W2D1_G6_Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.MetodDriver;

import java.nio.file.WatchEvent;

public class _1_ContactUs extends MetodDriver {



    @Test(groups={"Car"}) //PARAMETERI groups yapamazsın.
    @Parameters("enquiry") //xml den alacağı parametrenin adı buraya yazıldı. .....1
     void  ContactUs(String mesaj ){  // parametre alabilir hale getirildi. .....2

// 1 deki işlem:: XML ile alakayı kurmak için yapıldı.<parameter name="enquiry" ile aynı olmak zorunda....

// 2 deki işlem::Test Metoduna parametre verildi.Aranan kelimelerin yerine bu String adı yazılacak.

// 1 ve 2 birbirinin aynısı olmak zorunda değil.Ama Uzandıkları yerlerde aynı olmalılar.


    WebElement Contact=driver.findElement(By.linkText("Contact Us"));
    Contact.click();

    WebElement EnqryInput=driver.findElement(By.id("input-enquiry"));
    EnqryInput.sendKeys(mesaj);

    WebElement submitBtn=driver.findElement(By.cssSelector(".btn.btn-primary"));
    submitBtn.click();

    WebElement yazi=driver.findElement(By.cssSelector("div#content>p"));
    String yaziText=yazi.getText();

        Assert.assertTrue(yaziText.contains("successfully"));

    }


}

//enquiry::onkori:: Araştırma-Soruşturma-talep

//Niçin Yaptık:: Yollayacagımız metni metod uzerinden paramaetreye bağlamış olduk.
//Artık istediğin kadar, istediğin şeyi yolla dur.

//Ben bunu sendKeys in içini de değiştirip yapardım.Ne gerek var!!!
// Ama çoklu testlerde bu durum seni işin içinden çıkılmaz hale sokar.

//Artık Class daki Parameter testler çalışmaz.Sadece XML deki ile çalışır.