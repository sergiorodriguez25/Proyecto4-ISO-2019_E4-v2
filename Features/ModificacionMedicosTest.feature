@featureTest
Feature: Comprobar el correcto funcionamiento al modificar los medicos de un usuario

  @Scenario1
  Scenario: Al recibir los datos de los nuevos medicos de un paciente se modifica en la base de datos
    Given Se registra el usuario
    When Se modifican los medicos
    Then Se cambian los medicos en la base de datos
    And Se elimina el usuario