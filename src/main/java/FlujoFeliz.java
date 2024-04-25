import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class FlujoFeliz {
    WebDriver driver;
    String url = "https://www.demoblaze.com/index.html";

    public FlujoFeliz() {
        System.setProperty("webdriver.edge.driver", "A:\\Users\\ledez\\IntelliJ IDEA\\Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    public void Flujo() throws InterruptedException{

        String login = "login2";
        String CampoUser = "loginusername";
        String CampoPass = "loginpassword";
        String user = "imjustatester";
        String pass = "123";
        String loginButton = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]";
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

        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(login)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CampoUser)).sendKeys(user);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CampoPass)).sendKeys(pass);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.xpath(loginButton)).click();
        Thread.sleep(2000);

        //Aqui se añade el producto 1
        driver.findElement(By.cssSelector(p1)).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(addcart)).click();
        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(home)).click();
        Thread.sleep(1000);

        //Aqui se añade el producto 2
        driver.findElement(By.cssSelector(p2)).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(addcart)).click();
        Thread.sleep(1000);

        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        Thread.sleep(1000);

        //Aqui se añade el producto 3
        driver.findElement(By.cssSelector(home)).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(p3)).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(addcart)).click();
        Thread.sleep(1000);

        alert.accept();
        Thread.sleep(1000);

        driver.findElement(By.id(cart)).click();
        Thread.sleep(1000);


        //Aqui se elimina 1 producto
        WebElement delete = driver.findElement(By.xpath("//a[contains(@onclick, 'deleteItem')]"));
        delete.click();
        Thread.sleep(1000);

        //Aqui se procede a pagar el producto
        driver.findElement(By.cssSelector(PO)).click();
        Thread.sleep(1000);

        //Aqui se llenan los campos de la compra
        driver.findElement(By.id(name)).sendKeys("Jordi");
        Thread.sleep(1000);
        driver.findElement(By.id(country)).sendKeys("Espana");
        Thread.sleep(1000);
        driver.findElement(By.id(city)).sendKeys("Madrid");
        Thread.sleep(1000);
        driver.findElement(By.id(card)).sendKeys("84293523623");
        Thread.sleep(1000);
        driver.findElement(By.id(month)).sendKeys("06");
        Thread.sleep(1000);
        driver.findElement(By.id(year)).sendKeys("2035");
        Thread.sleep(2000);


        WebElement P = driver.findElement(By.xpath("//button[contains(@onclick, 'purchaseOrder')]"));
        P.click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(ok)).click();
        Thread.sleep(1000);

        System.out.println("Flujo Feliz Exitoso");
        Thread.sleep(1000);
        driver.quit(); //Cerrar el navegador
    }
}
