package G27;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        webElement.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div[1]/input")).sendKeys("Erkek Eşofman Takımı");
        System.out.println("Arama Alanına Erkek Eşofman Takımı Yazıldı");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement webElement2 = driver.findElement(By.className("cyrzo7gC"));
        webElement2.click();
        System.out.println("Ara Butonuna Tıklanıldı");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        
        System.out.println("Giriş Yap Ekranına Geçiş Butonuna Basılacak");
        WebElement element5 = driver.findElement(By.xpath("//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]/p"));
        element5.click();
        System.out.println("Giriş Yap Ekranına Geçiş Butonuna Basıldı");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Eposta ve Password Alanlarına Bilgi Girişi Yapılacak");
        WebElement webElement6 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-email\"]")));
        webElement6.sendKeys("mail"); // MAIL
        System.out.println("Eposta Bilgisi Gönderildi");
        
        WebElement webElement7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-password-input\"]")));
        webElement7.sendKeys("password" + Keys.ENTER); //PASSWORD
        System.out.println("Password Bilgisi Gönderildi");
 
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        driver.findElement(By.xpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div[1]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div[1]/input")).sendKeys("Erkek Eşofman Takımı" + Keys.ENTER);
        System.out.println("Arama Alanına Erkek Eşofman Takımı Yazıldı");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ara Butonuna Tıklanıldı");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        
        
        System.out.println("Ana Ekrana Gidiliyor");
        WebElement gohome = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"logo\"]/img")));
        gohome.click();
        System.out.println("Ana Ekrana Gidildi");
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        
        
        driver.findElement(By.xpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div[1]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div[1]/input")).sendKeys("Erkek Eşofman Takımı" + Keys.ENTER);
        System.out.println("Arama Alanına Erkek Eşofman Takımı Yazıldı");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ara Butonuna Tıklanıldı");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Lescon Aratmak Icın 10 Saniye Element Tıklanabilir Olması Bekleniyor");        
        WebElement lescon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sticky-aggregations\"]/div/div[3]/div[2]/input")));
        lescon.sendKeys("Lescon");
        System.out.println("Lescon Araması Yapıldı");
       
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        System.out.println("Lescon Checkbox Tıklanması Bekleniyor");
        WebElement checkboxlescon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sticky-aggregations\"]/div/div[3]/div[3]/div/div/div/div/a/div[1]")));
        checkboxlescon.click();
        System.out.println("Lescon Checkbox Tıklandı");
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        
        System.out.println("Giysi Seçilmesi Bekleniyor");
        driver.findElement(By.xpath("//a[@href='/lescon/23b-1048-esofman-takimi-erkek-23btep001048-p-648979900?boutiqueId=61&merchantId=4615']")).click();
        System.out.println("Seçim Yapıldı");
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        System.out.println("Anladım Butonuna Basılması Bekleniyor");
        driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/aside/div/div[1]/div[3]/div/button")).click();
        System.out.println("Butona Basıldı");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        System.out.println("Beden Seçimi Yapılması Bekleniyor");
        WebElement webElement11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div/div/div/div[3]")));
        webElement11.click();
        System.out.println("Seçim Yapıldı");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        System.out.println("Sepete Ekle Butonuna Basılması Bekleniyor");
        WebElement webElement12 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div[5]/button/div[1]")));
        webElement12.click();
        System.out.println("Butona Basıldı");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sepetim Ekranına Gidilmesi Bekleniyor");
        WebElement webElement13 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"account-navigation-container\"]/div/div[2]/a/p")));
        webElement13.click();
        System.out.println("Sepetim Ekranı Açıldı");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        System.out.println("Sepeti Onayla Butonuna Basılması Bekleniyor");
        WebElement webElement14 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pb-container\"]/aside/div/div[1]/a/span")));
        webElement14.click();
        System.out.println("Butona Basıldı");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        System.out.println("Sözleşme Onay Checbox Bekleniyor");
        WebElement webElement15 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"p-layout\"]/aside/div/div[2]/section/div/label/div")));
        webElement15.click();
        System.out.println("Checkbox İşaretlendi");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        System.out.println("Sözleşme Onaylıyorum Bekleniyor");
        WebElement webElement16 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"payment-app\"]/div[3]/div/div/button")));
        webElement16.click();
        System.out.println("Onaylandı");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        System.out.println("Kaydet ve Devam Et Butonuna Basılması Bekleniyor");
        WebElement webElement17 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"p-layout\"]/aside/div/div[4]/button")));
        webElement17.click();
        System.out.println("Butona Basıldı");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        
        System.out.println("Otomasyon Tamamlandı. Sipariş Ödeme Yapma Ekranına Geldi. Teşekkürler.");
        driver.quit();


    }
}
