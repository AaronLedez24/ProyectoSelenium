import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class PlaceOrder {
    WebDriver driver;
    String url = "https://www.demoblaze.com/index.html";

    public PlaceOrder() {
        System.setProperty("webdriver.edge.driver", "A:\\Users\\ledez\\IntelliJ IDEA\\Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    public void PagoExitoso() throws InterruptedException {

        String cart = "cartur";
        String addcart = "a.btn.btn-success.btn-lg";
        String home = "a.nav-link[href='index.html']";
        String p1 = "a[href*='prod.html?idp_=1'].hrefch";
        String p2 = "a[href*='prod.html?idp_=2'].hrefch";
        String p3 = "a[href*='prod.html?idp_=3'].hrefch";
        String PO = "button.btn.btn-success";
        String name = "name";
        String country = "country";
        String city = "city";
        String card = "card";
        String month = "month";
        String year = "year";
        String ok = "button.confirm.btn.btn-lg.btn-primary";

        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Aqui se añade el producto
        driver.findElement(By.cssSelector(p1)).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(addcart)).click();
        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1000);

        driver.findElement(By.id(cart)).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(PO)).click();
        Thread.sleep(1000);

        driver.findElement(By.id(name)).sendKeys("JordiENP");
        driver.findElement(By.id(country)).sendKeys("Espana");
        driver.findElement(By.id(city)).sendKeys("Madrid");
        driver.findElement(By.id(card)).sendKeys("84293523623");
        driver.findElement(By.id(month)).sendKeys("06");
        driver.findElement(By.id(year)).sendKeys("2035");
        Thread.sleep(2000);


        WebElement P = driver.findElement(By.xpath("//button[contains(@onclick, 'purchaseOrder')]"));
        P.click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(ok)).click();
        Thread.sleep(1000);
    }

    public void PagoFallido() throws InterruptedException {

        String cart = "cartur";
        String addcart = "a.btn.btn-success.btn-lg";
        String home = "a.nav-link[href='index.html']";
        String p1 = "a[href*='prod.html?idp_=1'].hrefch";
        String p2 = "a[href*='prod.html?idp_=2'].hrefch";
        String p3 = "a[href*='prod.html?idp_=3'].hrefch";
        String PO = "button.btn.btn-success";
        String name = "name";
        String country = "country";
        String city = "city";
        String card = "card";
        String month = "month";
        String year = "year";
        String ok = "button.confirm.btn.btn-lg.btn-primary";

        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Aqui se añade el producto
        driver.findElement(By.cssSelector(p1)).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(addcart)).click();
        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1000);

        driver.findElement(By.id(cart)).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(PO)).click();
        Thread.sleep(1000);

        driver.findElement(By.id(name)).sendKeys("");
        driver.findElement(By.id(country)).sendKeys("Espana");
        driver.findElement(By.id(city)).sendKeys("Madrid");
        driver.findElement(By.id(card)).sendKeys("84293523623");
        driver.findElement(By.id(month)).sendKeys("");
        driver.findElement(By.id(year)).sendKeys("2035");
        Thread.sleep(2000);


        WebElement P = driver.findElement(By.xpath("//button[contains(@onclick, 'purchaseOrder')]"));
        P.click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(ok)).click();
        Thread.sleep(1000);
    }

}
