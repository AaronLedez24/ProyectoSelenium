import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bienvenido");




        //FLUJO FELIZ DE LA PAGINA

        FlujoFeliz flujoFeliz = new FlujoFeliz();
        flujoFeliz.Flujo();

        //CASOS DE PRUEBAS DE LA PAGINA

        //Login login = new Login();
        //login.loginValido();
        //login.LoginInvalido();
        //login.ContraseñaInvalida();
        //login.CambiarContraseña();
        //login.TextosVacios();
        //login.SalirLogin();

        //Registro registro = new Registro();
        //registro.RegistroExitoso();
        //registro.UsuarioExistente();
        //registro.TextosVacios();
        //registro.SalirRegistro();

        //ShoppingCart shoppingCart = new ShoppingCart();
        //shoppingCart.AñadirProducto();
        //shoppingCart.VerificarCarrito();

        //DeleteShoppingCart deleteShoppingCart = new DeleteShoppingCart();
        //deleteShoppingCart.DeleteCart();
        //deleteShoppingCart.EliminarPorductos();

        //PlaceOrder placeOrder = new PlaceOrder();
        //placeOrder.PagoExitoso();
        //placeOrder.PagoFallido();

        //Purchase purchase = new Purchase();
        //purchase.CompraMultiple();
        //purchase.CompraUnica();

        //Contact contact = new Contact();
        //contact.ContactoExitoso();
        //contact.ContactoFallido();







    }
}