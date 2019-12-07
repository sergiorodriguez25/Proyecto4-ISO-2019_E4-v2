@featureTest
Feature: Comprobar que se buscan los usuarios correctamente en la lista 

  @Scenario1
  Scenario: Se introduce el dni del usuario y existe
  	Given Se registra el usuario
    And Estoy en la pagina de gestor
    When Busco el dni de un usuario que existe
    Then Se muestra el usuario en la lista
    And Se elimina el usuario
    
  @Scenario2
  Scenario: Se introduce el dni del usuario y no existe
  	Given Se registra el usuario
    And Estoy en la pagina de gestor
    When Busco el dni de un usuario que no existe
    Then Se muestra un label de usuario no encontrado
    And Se elimina el usuario
 
   @Scenario3
  Scenario: Se introduce el nombre del usuario y existe
    Given Se registra el usuario
    And Estoy en la pagina de gestor
    When Busco el nombre de un usuario que existe
    Then Se muestra el usuario en la lista
    And Se elimina el usuario
 
   @Scenario4
  Scenario: Se introduce el nombre del usuario y existe
    Given Se registra el usuario
    And Estoy en la pagina de gestor
    When Busco el nombre de un usuario que no existe
    Then Se muestra un label de usuario no encontrado
    And Se elimina el usuario
    