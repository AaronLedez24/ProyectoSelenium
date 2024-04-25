import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Contact {
    WebDriver driver;
    String url = "https://www.demoblaze.com/index.html";

    public Contact() {
        System.setProperty("webdriver.edge.driver", "A:\\Users\\ledez\\IntelliJ IDEA\\Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    public void ContactoExitoso() throws InterruptedException {
        String exitmsg = "//*[@id=\"exampleModal\"]/div/div/div[1]/button/span";
        String contactus = "//*[@id=\"navbarExample\"]/ul/li[2]/a";
        String contactemail = "recipient-email";
        String contactname = "recipient-name";
        String contactmsg = "message-text";
        String sendmsg = "//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]";

        driver.get("https://www.demoblaze.com/index.html");

        driver.manage().window().maximize();

        // Caso 2 Contactanos: Vaciar campos
        //Caso 2 Contactanos: Vaciar campos
        Thread.sleep(1000);
        driver.findElement(By.xpath(contactus)).click();

        Thread.sleep(1000);
        driver.findElement(By.id(contactemail)).sendKeys("mail@gmail.com");

        Thread.sleep(1000);

        driver.findElement(By.id(contactname)).sendKeys("Lauren Sinclair");

        Thread.sleep(1000);
        driver.findElement(By.id(contactmsg)).sendKeys("ñañaña");

        Thread.sleep(1000);
        driver.findElement(By.xpath(exitmsg)).click();
        driver.findElement(By.xpath(exitmsg)).click();
    }

    public void ContactoFallido() throws InterruptedException {
        String contactus = "//*[@id=\"navbarExample\"]/ul/li[2]/a";
        String contactemail = "recipient-email";
        String contactname = "recipient-name";
        String contactmsg = "message-text";
        String sendmsg = "//*[@id=\"exampleModal\"]/div/div/div[1]/button";

        driver.get("https://www.demoblaze.com/index.html");

        driver.manage().window().maximize();

        // Caso 1 Contactanos: proceso exitoso
        Thread.sleep(1000);
        driver.findElement(By.xpath(contactus)).click();

        Thread.sleep(1000);
        driver.findElement(By.id(contactemail)).sendKeys("mail@gmail.com");

        Thread.sleep(1000);
        driver.findElement(By.id(contactname)).sendKeys("Kieran White");

        Thread.sleep(1000);
        driver.findElement(By.id(contactmsg)).sendKeys("My phone isn't turning on");

        Thread.sleep(1000);
        driver.findElement(By.xpath(sendmsg)).click();


    }

}
