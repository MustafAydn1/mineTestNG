package M1W2D3_G9_POM_HardSoftAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MetodDriver;

import java.util.List;

public class _2_PlaceOrder extends MetodDriver {


@Test
       public void ProceedToCheckOut()  {

    WebDriverWait wait=new WebDriverWait(driver,10);

    WebElement inputSearch=driver.findElement(By.cssSelector(".form-control.input-lg"));
    inputSearch.sendKeys("ipod");

    WebElement searchTıkla= driver.findElement(By.cssSelector(".btn.btn-default.btn-lg"));
    searchTıkla.click();


   List<WebElement> kartaEkle= driver.findElements(By.xpath("//span[text()='Add to Cart']"));

   kartaEkle.get(0).click();

   WebElement shoppingCart=driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[1]"));
    shoppingCart.click();

   WebElement checkOut= driver.findElement(By.xpath("//a[text()='Checkout']"));
   checkOut.click();

   WebElement billingContinue= driver.findElement(By.id("button-payment-address"));
   billingContinue.click();

   WebElement deliveryDetailsContinue=driver.findElement(By.id("button-shipping-address"));
   deliveryDetailsContinue.click();

   WebElement deliveryMethodContinue= driver.findElement(By.id("button-shipping-method"));
   deliveryMethodContinue.click();

    WebElement termsCondition=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='agree']")));
    termsCondition.click();

// wait ile birlikte Webelement i ilk defa birlikte yazdın.öğren


   WebElement paymentMethodContiune=driver.findElement(By.id("button-payment-method"));
   paymentMethodContiune.click();

   WebElement confirmOrder=wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("button-confirm"))));

   confirmOrder.click();


    wait.until(ExpectedConditions.urlContains("success"));

  WebElement sonyazi=driver.findElement(By.cssSelector("div#content>h1"));

    Assert.assertTrue(sonyazi.getText().contains("Your order has been placed!"));

  //  driver.findElement(By.id("button-shipping-method")).click();



}

}
// Malik h. burada cıkan sorundan dolayı bişeyin içini clear yapsak dedi ne idi????