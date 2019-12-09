@featureTest
Feature: Comprobar el correcto funcionamiento de la modificación de horarios

	@Scenario1
  Scenario: Al modificar el horario de un médico, se modifica dicho horario de la base de datos
    Given Se registra un medico
    When Se registra el horario del medico
    Then El horario cambia en la base de datos
    And Se elimina el medico
    And Se elimina el nuevo horario
    
