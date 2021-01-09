package M1W2D3_G9_POM_HardSoftAssert;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MetodDriver;
/* Page Object Model (POM) Avantajları
1- Tüm sayfalardaki isimleri aynı olan elemanları 1 kez tanımlamak yetiyor.
Böylece tekrarlanan elemanlar Reusable oluyor.

2-Html kodları ayrıldıgından kodların okunabilirliği artıyor.
3-Developer kodlarda bi değişiklik yaptıgı zaman asıl kodlarda değişiklik olmuyor.
sadece locatorları değiştiriyoruz.

41. dakikada kaldım. 3. video
 */







public class _4_PlaceOrderPOM extends MetodDriver {
//page object model
    @Test
    public void ProceedToCheckOut()  {
    _3_PlaceOrderElements placeOrderElements=new _3_PlaceOrderElements(driver); //0

    placeOrderElements.inputSearch.sendKeys("ipod");
    placeOrderElements.searchTikla.click();
    placeOrderElements.kartaEkle.click();
    placeOrderElements.shoppingCart.click();
    placeOrderElements.checkOut.click();
    placeOrderElements.billingContiune.click();
    placeOrderElements.deliveryDetailsContinue.click();
    placeOrderElements.deliveryMethodContinue.click();

        WebDriverWait wait=new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.termsCondition)).click();//1

     placeOrderElements.paymentMethodContiune.click();

    wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.confirmOrder)).click();

    wait.until(ExpectedConditions.urlContains("succes"));

        Assert.assertTrue(placeOrderElements.sonyazi.getText().contains("Your order has been placed!"));






    }

/*
0'daki driver _3. sayfadan dolayı geldi oraya. Constructor dan dolayı...
1' de artık locator degil, Webelement olanını(elementToClickable()) tıklıyacaz. iki farklısı var.
Yanı eleman klik yapılabibilir oluncaya kadar bekle demektir.


//Bu cumle ne demek??? 3. ders: 25. dak.
eleman bulma aşamaların da hata verme olasılıkları minimize ediyor.
Nesneyi tanımladıgında degilde, kullanma anınada buluyor elemanı...
Hangi sayfada oldugunun bi kıymeti kalmıyor???
Yani ilk başta bulmuyor.
böylece bu elemanı heryerde kullanıyorsun.

 */

}
