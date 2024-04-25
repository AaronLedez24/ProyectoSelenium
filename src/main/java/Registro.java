import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Registro {

    WebDriver driver;
    String url = "https://www.demoblaze.com/index.html";

    public Registro() {
        System.setProperty("webdriver.edge.driver", "A:\\Users\\ledez\\IntelliJ IDEA\\Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    public void RegistroExitoso() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String signup = "signin2";
        String CapoUser = "sign-username";
        String CapoPass = "sign-password";
        String user = "juaanmamama";
        String pass = "123";
        String signupButton = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]";

        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(signup)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CapoUser)).sendKeys(user);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CapoPass)).sendKeys(pass);
        driver.findElement(By.xpath(signupButton)).click();

        Thread.sleep(2000);
        driver.quit(); //Cerrar el navegador
    }

    public void UsuarioExistente() throws InterruptedException{
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String signup = "signin2";
        String CapoUser = "sign-username";
        String CapoPass = "sign-password";
        String user = "juaanmamama";
        String pass = "123";
        String signupButton = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]";

        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(signup)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CapoUser)).sendKeys(user);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CapoPass)).sendKeys(pass);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.xpath(signupButton)).click();

        Thread.sleep(2000);
        driver.quit(); //Cerrar el navegador

    }

    public void TextosVacios () throws InterruptedException{
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String signup = "signin2";
        String CapoUser = "sign-username";
        String CapoPass = "sign-password";
        String user = "";
        String pass = "";
        String signupButton = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]";

        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(signup)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CapoUser)).sendKeys(user);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CapoPass)).sendKeys(pass);
        driver.findElement(By.xpath(signupButton)).click();

        Thread.sleep(2000);
        driver.quit(); //Cerrar el navegador
    }

    public void SalirRegistro() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String signup = "signin2";
        String BotonSalir = "//*[@id=\"signInModal\"]/div/div/div[1]/button";

        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(signup)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.xpath(BotonSalir)).click();

        Thread.sleep(2000);
        driver.quit(); //Cerrar el navegador
    }

}
