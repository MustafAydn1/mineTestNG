package M1W2D3_G9_POM_HardSoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*Bu sayfadaki elemanların driver ile baglantısı gerkiyordu.
Aşagıdaki constructor ile bu saglandı. İçine de
Page.initElements ile driver üzerinden bu(this) sayfadaki
bütün elemanlar ilişkilendirildi.
Böylece sayfadan nesne türetildiği zaman değil, kullanıldığı anda
elemanların kullanılması aktif oluyor.
Bu yöntemle bütün sayfalarda aynı isimde eleman varsa buradaki tanımlama
hepsi için gecerli oluyor.
Bu yapıya Page Object Model(POM) oluyor

 */

public class _3_PlaceOrderElements {



    public _3_PlaceOrderElements(WebDriver driver){

        PageFactory.initElements(driver,this);
    }


    @FindBy(css =".form-control.input-lg")
    public  WebElement inputSearch;
//Bu elemanın bulunabilmesi için gerekli herşeyi burada saklıyor

    @FindBy(css =".btn.btn-default.btn-lg" )
    public WebElement searchTikla;

    @FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
    public WebElement kartaEkle;

    @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[1]")
    public  WebElement shoppingCart;

    @FindBy(xpath = "//a[text()='Checkout']")
    public WebElement checkOut;

    @FindBy(id = "button-payment-address")
    public WebElement billingContiune;

    @FindBy(id = "button-shipping-address")
    public WebElement deliveryDetailsContinue;

    @FindBy(id = "button-shipping-method")
    public WebElement deliveryMethodContinue;

    @FindBy(css ="input[name='agree']" )
    public WebElement termsCondition;

    @FindBy(id = "button-payment-method")
    public WebElement paymentMethodContiune;

    @FindBy(id = "button-confirm")
    public WebElement confirmOrder;

    @FindBy(css ="div#content>h1" )
    public WebElement sonyazi;




//Burada belirlenen,tanımlanan elemanı artık heryerde kullanabilirsin.
//Developer bişey değiştirise bu sayfada degişikligi yapacagım.Ana kod değişmeyecek.
// Böylece html tarfıyla kod tarafını birbirinden ayırmış olacagım.
//Aynı elemanlar başka sayfada imiş hiç önemli değil.
// Aynı elemanı tekraren nıye bulayım ki...
// (Yani aynı buton yada giriş hep aynı kodlamı yazılıyor ki) ????

// ÖNEMLİ:: driver ın bu sayfa ile bir baglantısı lazım.
//Bunu constroctor ile saglıyoruz.  (extends yapıp saglayamazmıydık????)














}
