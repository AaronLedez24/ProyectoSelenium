import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class DeleteShoppingCart {
    WebDriver driver;
    String url = "https://www.demoblaze.com/index.html";

    public DeleteShoppingCart() {
        System.setProperty("webdriver.edge.driver", "A:\\Users\\ledez\\IntelliJ IDEA\\Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    public void DeleteCart() throws InterruptedException{

        String cart = "cartur";
        String addcart = "a.btn.btn-success.btn-lg";
        String home = "a.nav-link[href='index.html']";
        String p1 = "a[href*='prod.html?idp_=1'].hrefch";
        String p2 = "a[href*='prod.html?idp_=2'].hrefch";
        String p3 = "a[href*='prod.html?idp_=3'].hrefch";

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


        WebElement delete = driver.findElement(By.xpath("//a[contains(@onclick, 'deleteItem')]"));
        delete.click();
        Thread.sleep(1000);

    }

    public void EliminarPorductos () throws InterruptedException{
        String cart = "cartur";
        String addcart = "a.btn.btn-success.btn-lg";
        String home = "a.nav-link[href='index.html']";
        String p1 = "a[href*='prod.html?idp_=1'].hrefch";
        String p2 = "a[href*='prod.html?idp_=2'].hrefch";
        String p3 = "a[href*='prod.html?idp_=3'].hrefch";

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


        driver.findElement(By.cssSelector(home)).click();
        Thread.sleep(1000);

        //Aqui se verifica el producto
        driver.findElement(By.cssSelector(p2)).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(addcart)).click();
        Thread.sleep(1000);

        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        Thread.sleep(1000);

        driver.findElement(By.id(cart)).click();
        Thread.sleep(1000);


        WebElement delete = driver.findElement(By.xpath("//a[contains(@onclick, 'deleteItem')]"));
        delete.click();
        Thread.sleep(1000);

    }


}
