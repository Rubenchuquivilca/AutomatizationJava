Feature: Product - Store

  Scenario: Realizar el login - Store
  Given estoy en la pagina de la tienda
  When doy click en la opcion iniciar session
  And doy click en el link text cree una cuenta aqui
  And lleno los campos del formulario para el registro
  And doy click en el boton guardar
  Then deberia visualizar mi usuario logeado en la pantalla