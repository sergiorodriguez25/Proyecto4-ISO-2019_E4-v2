package com.tgs.tgh.stepDefinition;

import static org.junit.Assert.assertEquals;

import com.tgs.tgh.dao.PacienteDAO;
import com.tgs.tgh.model.Paciente;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ModificacionMedicosSteps {

    @When("^Se modifican los medicos$")
    public void se_modifica_los_medicos() throws Throwable {
	PacienteDAO.modificarCentro(Recursos.getPaciente().getDNI(), "Nuevo Centro");
    }

    @Then("^Se cambian los medicos en la base de datos$")
    public void se_cambian_los_medicos_en_la_base_de_datos() throws Throwable {
	Paciente paciente = PacienteDAO.esPaciente(Recursos.getUsuario());
	assertEquals(paciente.getCentroMedico(), "Nuevo Centro");
    }
}
