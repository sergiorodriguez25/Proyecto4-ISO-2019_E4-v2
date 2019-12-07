@featureTest
Feature: Comprobar el correcto de modificar el horario de un médico

  @Scenario1
  Scenario: Al recibir los datos del nuevo horario de un medico, se borra el antiguo y se introduce el nuevo en la base de datos
    Given Se registra un medico
    And Se registra el horario del medico
    When Se modifica el horario del medico
    Then El horario ha cambiado en la base de datos
    And Se elimina el nuevo horario del medico
  	And Se elimina el medico
  	And Se elimina el usuario