@featureTest
Feature: Comprobar que se buscan los usuarios correctamente por su DNI en la lista 

  @Scenario1
  Scenario: Se introduce el dni del usuario y existe
  	Given Se registra el usuario
    And Estoy en la pagina de gestor
    When Busco el dni de un usuario que existe
    Then Se muestra el usuario en la lista
    And Se elimina el usuario
    
  @Scenario2
  Scenario: Se introduce el dni del usuario y no existe
		Given Estoy en la pagina de gestor
    When Busco el dni de un usuario que no existe
    Then La lista esta vacia
 
  