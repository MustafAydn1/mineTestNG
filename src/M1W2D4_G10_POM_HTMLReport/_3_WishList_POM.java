package M1W2D4_G10_POM_HTMLReport;

import M1W2D3_G9_POM_HardSoftAssert._3_PlaceOrderElements;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ParameterDriver;
import utils.Tools;

public class _3_WishList_POM extends ParameterDriver { //bir driver extends yapmazsan driver kızarır.

    @Test
    @Parameters("itemName")
    public void addToWishList(String itemName) {

        M1W2D3_G9_POM_HardSoftAssert._3_PlaceOrderElements paceplaceOrderElements = new M1W2D3_G9_POM_HardSoftAssert._3_PlaceOrderElements(driver);

        paceplaceOrderElements.inputSearch.sendKeys(itemName);
        paceplaceOrderElements.searchTikla.click();

        _2_WishListElements wishListElements=new _2_WishListElements(driver);

        int RandumNumber= Tools.RandomNumberGenerator(wishListElements.searchProduct.size());
//wishListElements class ında belirlenen searchProduct List in size ından random numara uret.
//Bunu en uste koyamazsın.Random un max degeri için size nerede oluşuyorsa orada olamlıdır.

        String searchProductItemName=wishListElements.searchProduct.get(RandumNumber).getText();
//wishListElements class ında belirlenen searchProduct ın random indexli textini String olarak ver.

        wishListElements.searchResultWishList.get(RandumNumber).click();
//wishListElements class ında yeri belirlenen  searchResultWishList ın random indexli olana tıkla

        wishListElements.wishListBtn.click();
//wishListElements class ında yeri belirlenen wishList Butonuna tıkla

        Tools.ListContainsString(wishListElements.tableNames,searchProductItemName);
//wishListElements class ında yeri belirlenen tableNames Listinın elemanları arasında
//ilk tıklanan elemanın adı geçiyor mu kontrol et.




    }
}

// bunun ilk aşamasını yapmadan 2. ve 3. aşamasını yapmaya gecmelisin...
//3. ders 24. dakika html report başlıyor.