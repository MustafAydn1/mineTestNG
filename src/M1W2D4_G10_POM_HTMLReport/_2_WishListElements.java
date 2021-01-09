package M1W2D4_G10_POM_HTMLReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
// Bu sayfada html kısmını hallettik. Asıl iş POM da olacak.
public class _2_WishListElements {


    public _2_WishListElements(WebDriver driver){ //import ben yapacagım
        PageFactory.initElements(driver,this);
    }



//@FindBy ın buldugu elemanların hepsini al
//Gerektiğinde ayrı ayrı locatorlarla bulunan elemanlar
//tek bir list te bu şekılde birleştırılır.
//Süslü parantezli çok iş yapacaksınız.elınız alışsın.

    @FindAll({
            @FindBy(css = "div.caption>h4"),
//          @FindBy(css = "div.caption>h4")

    })
    public List<WebElement> searchProduct;


    @FindAll({
            @FindBy(xpath = "//button[@data-original-title='Add to Wish List']")
    })

    public List<WebElement> searchResultWishList;

    @FindBy(css = "#wishlist-total>i+span")
    public WebElement wishListBtn;

    @FindAll({
             @FindBy(xpath = "//table[@class='table table-bordered table-hover']//tbody//td[2]")
    })
    List<WebElement> tableNames;




}
