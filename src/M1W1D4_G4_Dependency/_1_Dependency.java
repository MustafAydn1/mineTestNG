package M1W1D4_G4_Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _1_Dependency {



      @Test(groups = {"Car"})
      public   void startCar(){

        System.out.println("Car startCar");
      // Assert.fail();

//Assert.fail(); aktif iken -->> Car startCar yazısı çıkar.ama test fail verir.parkCar çalışır.
// driveCar ve stopCar için ise  Test Ignored yazızı cıkar. Yani Test görmezden gelindi.
// çunkü dependsOnMethod ile bağımlı oldugu için onları hiç açmadı bile..


    }
    // bu testin çalışması, startCar ın hatasız çalışmasına bağımlı
    @Test (dependsOnMethods = {"startCar"},groups="Car") // Sadece bu çalışınca tek bagımlı oldugu için  startCAr da calısır.
    public  void driveCar(){

        System.out.println("Car driveCar");
    }
    // bu testin çalışması, driveCar ın hatasız çalışmasına bağımlı
    @Test (dependsOnMethods = {"driveCar"})// Sadece bu çalışınca ustte iki bagımlı oldugu için calışmaz
    public   void stopCar(){

        System.out.println("Car stopCAr");

    }

    @Test  (dependsOnMethods = {"stopCar","driveCar"},alwaysRun=true)//alwaysRun = true bağımlılıkları var ama hata çıkarsa da yine çalıştır
    public   void parkCar(){

        System.out.println("Car parkCar");

    }
}

//dependency:: dıpendinsii:: bağımlılık