package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class authenticationPage {

    WebDriver driver;

    public authenticationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Registro de formulario ELEMENTOS
    @FindBy(linkText = "¿No tiene una cuenta? Cree una aquí")
    public WebElement btnRegister;
    @FindBy(xpath = "//*[@id=\"field-firstname\"]")
    public WebElement txtFirstName;
    @FindBy(xpath = "//*[@id=\"field-lastname\"]")
    public WebElement txtLastName;
    @FindBy(xpath = "//*[@id=\"field-email\"]")
    public WebElement txtEmail;
    @FindBy(xpath = "//*[@id=\"field-password\"]")
    public WebElement txtPassword;
    @FindBy(xpath = "//*[@id=\"field-birthday\"]")
    public WebElement txtBirthday;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/div/div[8]/div[1]/span/label/input")
    public WebElement txtCheck1;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/div/div[10]/div[1]/span/label/input")
    public WebElement txtCheck2;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/footer/button")
    public WebElement btnGuardar;
    @FindBy(linkText = "Ruben Chuquivilca")
    public WebElement btnDatos;

    //REGISTRO DE  USUARIOS METODOS
    public void clickRegister(){
        btnRegister.click();
    }
    public void registerFirstName(String firstName){
        txtFirstName.sendKeys(firstName);
    }
    public void registerLastName(String lastName){
        txtLastName.sendKeys(lastName);
    }
    public void registerEmail(String email){
        txtEmail.sendKeys(email);
    }
    public void registerPassword(String password){
        txtPassword.sendKeys(password);
    }
    public void registerBirthday(String birthday){
        txtBirthday.sendKeys(birthday);
    }
    public void registerCheck1(String check1){
        txtCheck1.sendKeys(check1);
    }
    public void registerCheck2(String check2){
        txtCheck2.sendKeys(check2);
    }
    public void btnGuardar(){
        btnGuardar.click();
    }
    public void btnDatos(){
        btnDatos.click();
    }

    //LOGIN ELEMENTOS
    @FindBy(linkText = "Iniciar sesión")
    public WebElement setLogin;

    @FindBy(xpath = "//*[@id=\"submit-login\"]")
    public WebElement setBtnLogin;

    @FindBy(name = "email")
    public WebElement userEmail;

    @FindBy(name = "password")
    public WebElement userPassword;

    //LOGIN METODOS
    public void clickLogin(){
        setLogin.click();
    }

    public void ingresoUser(String email){
        userEmail.sendKeys(email);
    }
    public void ingresoPassword(String password){
        userPassword.sendKeys(password);
    }
    public void setBtnLogin(){
        setBtnLogin.click();
    }
}
