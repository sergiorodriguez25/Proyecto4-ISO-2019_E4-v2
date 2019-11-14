package com.tgs.tgh.stepDefinition;

import static org.junit.Assert.assertEquals;

import org.json.JSONArray;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tgs.tgh.web.Manager;

import cucumber.api.java.en.Then;

public class AnadirCitaSteps {
	
	ChromeDriver driver = WebDriver.webDriver;

	@Then("^La cita existe en la base de datos$")
	public void la_cita_existe_en_la_base_de_datos() throws Throwable {
		JSONArray citas = Manager.get().getCitas(Recursos.getPaciente().getDNI());
		assertEquals(citas.getJSONObject(0).getString("nombreApe"), "Medico Prueba");
	}

}
