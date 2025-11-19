package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.authenticationPage;
import utility.BrowserDriver;

import java.util.concurrent.TimeUnit;

public class authenticationStepDefinition {

    private WebDriver driver;
    private authenticationPage AuthenticationPage;

    public authenticationStepDefinition() {
        this.driver = BrowserDriver.getDriver();
        this.AuthenticationPage = new authenticationPage(driver);
    }
    //Scenario: Registro de usuario en la web

    @Given("estoy en la pagina de la tienda")
    public void estoy_en_la_pagina_de_la_tienda() {
        String title = driver.getTitle();
        Assert.assertEquals( "My Store", title);
    }
    @When("doy click en la opcion iniciar session")
    public void doy_click_en_la_opcion_iniciar_session() {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            AuthenticationPage.clickLogin();
            /*AuthenticationPage.ingresoUser("rubenchuquivilca99@gmail.com");
            AuthenticationPage.ingresoPassword("Ruben12345@");
            AuthenticationPage.setBtnLogin();*/
    }
    @When("doy click en el link text cree una cuenta aqui")
    public void doy_click_en_el_link_text_cree_una_cuenta_aqui() {
        AuthenticationPage.clickRegister();

    }
    @When("lleno los campos del formulario para el registro")
    public void lleno_los_campos_del_formulario_para_el_registro() {
        AuthenticationPage.registerFirstName("Ruben");
        AuthenticationPage.registerLastName("Chuquivilca");
        AuthenticationPage.registerEmail("rubenchuquivilca32@gmail.com");
        AuthenticationPage.registerPassword("Ruben12345@");
        AuthenticationPage.registerBirthday("16/02/1995");
        if(!AuthenticationPage.txtCheck1.isSelected()){
            AuthenticationPage.txtCheck1.click();
            System.out.println("El checkbox1 fue marcado");
        }
        if(!AuthenticationPage.txtCheck2.isSelected()){
            AuthenticationPage.txtCheck2.click();
            System.out.println("El checkbox2 fue marcado");
        }
        AuthenticationPage.registerCheck2(driver.getTitle());
    }
    @When("doy click en el boton guardar")
    public void doy_click_en_el_boton_guardar() {
        AuthenticationPage.btnGuardar();

    }
    @Then("deberia visualizar mi usuario logeado en la pantalla")
    public void deberia_visualizar_mi_usuario_logeado_en_la_pantalla() {
        AuthenticationPage.btnDatos();
    }
}
