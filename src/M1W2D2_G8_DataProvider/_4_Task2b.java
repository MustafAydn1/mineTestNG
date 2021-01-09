package M1W2D2_G8_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.MetodDriver;
import utils.ParameterDriver;

public class _4_Task2b extends ParameterDriver {


    @Test(dataProvider = "getDataMesaj")
   // @Parameters("enquiry") // bunu buraya yazma...
        //xml den alacağı parametrenin adı buraya yazıldı. .....1
   public void ContactUs(String enquiry) {  // parametre alabilir hale getirildi. .....2


        WebElement Contact = driver.findElement(By.linkText("Contact Us"));
        Contact.click();

        WebElement EnqryInput = driver.findElement(By.id("input-enquiry"));
        EnqryInput.clear();
        EnqryInput.sendKeys(enquiry);

        WebElement submitBtn = driver.findElement(By.cssSelector(".btn.btn-primary"));
        submitBtn.click();

        WebElement yazi = driver.findElement(By.cssSelector("div#content>p"));
        String yaziText = yazi.getText();

        Assert.assertTrue(yaziText.contains("successfully"));

    }

    @DataProvider
    public Object[] getDataMesaj() {

        Object[] data = {"cucumberli yolun sonu görunuyor",
                "Her doğruyu herkese heryerde sen söyleme", "Her istiğfar tevbe değildir"};

        return data;
    }

}



