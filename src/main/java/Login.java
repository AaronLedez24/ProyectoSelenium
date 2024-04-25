import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Login {
    WebDriver driver;
    String url = "https://www.demoblaze.com/index.html";

    public Login() {
        System.setProperty("webdriver.edge.driver", "A:\\Users\\ledez\\IntelliJ IDEA\\Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    public void loginValido() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String login = "login2";
        String CampoUser = "loginusername";
        String CampoPass = "loginpassword";
        String user = "imjustatester";
        String pass = "123";
        String loginButton = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]";
        String home = "a.nav-link[href='index.html']";

        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(login)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CampoUser)).sendKeys(user);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CampoPass)).sendKeys(pass);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.xpath(loginButton)).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(home)).click();
        Thread.sleep(1000);


    }

    public void LoginInvalido() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String login = "login2";
        String CampoUser = "loginusername";
        String CampoPass = "loginpassword";
        String user = "holhohl";
        String pass = "48474883";
        String loginButton = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]";

        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(login)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CampoUser)).sendKeys(user);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CampoPass)).sendKeys(pass);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.xpath(loginButton)).click();

        Thread.sleep(2000);
        driver.quit(); //Cerrar el navegador

    }

    public void ContraseñaInvalida() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String login = "login2";
        String CampoUser = "loginusername";
        String CampoPass = "loginpassword";
        String user = "imjustatester";
        String pass = "5678";
        String loginButton = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]";

        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(login)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CampoUser)).sendKeys(user);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CampoPass)).sendKeys(pass);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.xpath(loginButton)).click();

        Thread.sleep(2000);
        driver.quit(); //Cerrar el navegador

    }

    public void CambiarContraseña() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String login = "login2";
        String CampoUser = "loginusername";
        String CampoPass = "loginpassword";
        String user = "imjustatester";
        String pass = "5678";
        String cambiarContraseña = "cambiarContraseña";

        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(login)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CampoUser)).sendKeys(user);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(CampoPass)).sendKeys(pass);
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(cambiarContraseña)).click();

        Thread.sleep(2000);
        driver.quit(); //Cerrar el navegador

    }
    public void TextosVacios() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String login = "login2";
        String loginButton = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]";

        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.id(login)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.xpath(loginButton)).click();

        Thread.sleep(2000);
        driver.quit(); //Cerrar el navegador

    }

    public void SalirLogin() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String login = "login2";
        String BotonCerrar = "//*[@id=\"logInModal\"]/div/div/div[1]/button";


        driver .findElement(By.id(login)).click();
        Thread.sleep(1000);// Esperar 1 segundo
        driver.findElement(By.xpath(BotonCerrar)).click();

        Thread.sleep(2000);
        driver.quit(); //Cerrar el navegador

    }


}

