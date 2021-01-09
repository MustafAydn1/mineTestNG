package M1W2D2_G8_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _5_facebookUyeOl_DataProvider {

    @Test(dataProvider="facebookUyelikAl")

    public  void facebookUyeOl(String isim,String soyisim,String CepTel,String sifre,String Gun,String Ay,String Yıl) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.cssSelector("a[id^='u'][id$='_2']")).click();
        Thread.sleep(500);
        WebElement isim1=driver.findElement(By.cssSelector("div._5dbb>input[id^='u'][id$='b']"));
        isim1.sendKeys(isim);
        Thread.sleep(500);

        driver.findElement(By.name("lastname")).sendKeys(soyisim);
        Thread.sleep(500);

        driver.findElement(By.name("reg_email__")).sendKeys(CepTel);
        Thread.sleep(500);

        driver.findElement(By.name("reg_passwd__")).sendKeys(sifre);

        WebElement gun=driver.findElement(By.name("birthday_day"));
        Select sayi= new Select(gun);
        sayi.selectByValue(Gun);
        Thread.sleep(500);

        Select months=new Select(driver.findElement(By.name("birthday_month")));
        months.selectByVisibleText(Ay);
        Thread.sleep(500);

        Select year=new Select(driver.findElement(By.name("birthday_year")));
        year.selectByVisibleText(Yıl);
        Thread.sleep(500);

        driver.findElement(By.cssSelector("input[value='2']")).click();
        Thread.sleep(500);

        driver.findElement(By.name("websubmit")).click();



    }

    @DataProvider
    public Object [][] facebookUyelikAl(){

        Object[][] bilgiler ={
                {"Ahmet","Yılmaz","+90 539 000 0011","1qazxsw21234","25","Oca","1990"},
                {"Mehmet","Gökcen","+90 539 000 0022","12345678qwe","25","Eyl","1999"},
                {"Betul","Demir","+90 539 000 0033","12345678qwe123","25","Mar","1997"},
                {"İskender","Karabulut","+90 539 000 0044","12345678qwe","25","Nis","2001"}

                };

        return bilgiler;
    }


}
