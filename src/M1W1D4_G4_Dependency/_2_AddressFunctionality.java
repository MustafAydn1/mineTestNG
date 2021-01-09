package M1W1D4_G4_Dependency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.MetodDriver;
import utils.Tools;

import java.util.List;
    /*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son eklenen adresi siliniz.

     */


public class _2_AddressFunctionality extends MetodDriver {





    @Test
    void  AddAddress() throws InterruptedException {
        WebElement adrssBook=driver.findElement(By.linkText("Address Book"));
        adrssBook.click();

        WebElement newAdres=driver.findElement(By.linkText("New Address"));
        newAdres.click();


        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Mustafa");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Aydin");

        WebElement company=driver.findElement(By.id("input-company"));
        company.sendKeys("Techno Study");


        WebElement Address1=driver.findElement(By.id("input-address-1"));
        Address1.sendKeys("Anadolu");

        WebElement Address2=driver.findElement(By.id("input-address-2"));
        Address2.sendKeys("Hicret Beldem");

        WebElement city=driver.findElement(By.id("input-city"));
        city.sendKeys("Paris");


        WebElement postCode=driver.findElement(By.id("input-postcode"));
        postCode.sendKeys("12345");


        WebElement selectcountry =driver.findElement(By.id("input-country"));

        Tools.selecByIndex(selectcountry);


        By stateOptions=By.cssSelector("select#input-zone>*");

        WebDriverWait bekle=new WebDriverWait(driver,10);
        bekle.until(ExpectedConditions.numberOfElementsToBeMoreThan(stateOptions,1));


        Thread.sleep(3000);

        WebElement selectstate=driver.findElement(By.id("input-zone"));
        Tools.selecByIndex(selectstate);


        WebElement contiuneBtn=driver.findElement(By.cssSelector(".btn.btn-primary"));
        contiuneBtn.click();


        Tools.successMessageValidation(driver); // burayı aşamıyordum.


    }

    @Test (dependsOnMethods ={"AddAddress"} )
    void EditAdress(){

        WebElement AdressBook=driver.findElement(By.linkText("Address Book"));
        AdressBook.click();

        //Bütün edit butonları alındı Ve...
        List<WebElement> editList=driver.findElements(By.linkText("Edit"));
        editList.get(editList.size()-1).click();   // En sonuncuya tıklandı...

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys("Ali");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys("veli");

        WebElement contiuneBtn=driver.findElement(By.cssSelector(".btn.btn-primary"));
        contiuneBtn.click();





    }

    @Test (dependsOnMethods = {"EditAdress"})
    void DeleteAdress(){
        WebElement AdressBook=driver.findElement(By.linkText("Address Book"));
        AdressBook.click();
//Bütün delete butonları alındı Ve...
        List<WebElement> deleteList=driver.findElements(By.linkText("Delete"));
        deleteList.get(deleteList.size()-1).click(); //En son Delete ye tıklandı.

        Tools.successMessageValidation(driver);



    }

}


























/*
 WebElement country =driver.findElement(By.id("input-country"));
        Select countries= new Select(country);
        countries.selectByVisibleText("France, Metropolitan");
 */