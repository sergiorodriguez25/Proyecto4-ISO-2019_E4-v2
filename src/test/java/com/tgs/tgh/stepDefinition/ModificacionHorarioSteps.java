package com.tgs.tgh.stepDefinition;
import static org.junit.Assert.assertEquals;

import com.tgs.tgh.dao.HorarioMedicoDAO;
import com.tgs.tgh.model.HorarioMedico;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ModificacionHorarioSteps {


	

	@When("^Se modifica el horario del medico$")
	public void se_modifica_el_horario_medico() throws Throwable {
		HorarioMedicoDAO.eliminarHoraMedico("Lunes", "10:00", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.eliminarHoraMedico("Lunes", "10:15", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.eliminarHoraMedico("Lunes", "10:30", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.eliminarHoraMedico("Lunes", "10:45", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.eliminarHoraMedico("Lunes", "11:00", Recursos.getUsuario().getDNI());
		
		HorarioMedicoDAO.anadirHoraMedico("Martes", "10:00", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.anadirHoraMedico("Lunes", "10:15", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.anadirHoraMedico("Lunes", "10:30", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.anadirHoraMedico("Lunes", "10:45", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.anadirHoraMedico("Lunes", "11:00", Recursos.getUsuario().getDNI());
	}
	
	@Then("^El horario ha cambiado en la base de datos$")
	public void el_horario_del_medico_ha_cambiado_en_la_base_de_datos() throws Throwable {
		HorarioMedico hm = HorarioMedicoDAO.getHorarioMedico(Recursos.getUsuario().getDNI());
		assertEquals(hm.getHorario().get(0)[0], "Martes");
		assertEquals(hm.getHorario().get(0)[1], "10:00");
		assertEquals(hm.getHorario().get(1)[0], "Lunes");
		assertEquals(hm.getHorario().get(1)[1], "10:15");
		assertEquals(hm.getHorario().get(2)[0], "Lunes");
		assertEquals(hm.getHorario().get(2)[1], "10:30");
		assertEquals(hm.getHorario().get(3)[0], "Lunes");
		assertEquals(hm.getHorario().get(3)[1], "10:45");
		assertEquals(hm.getHorario().get(4)[0], "Lunes");
		assertEquals(hm.getHorario().get(4)[1], "11:00");
	}
	
	@And("^Se elimina el nuevo horario del medico$")
	public void se_elimina_el_horario_del_nuevo_medico() throws Throwable {
		HorarioMedicoDAO.eliminarHoraMedico("Martes", "10:00", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.eliminarHoraMedico("Lunes", "10:15", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.eliminarHoraMedico("Lunes", "10:30", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.eliminarHoraMedico("Lunes", "10:45", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.eliminarHoraMedico("Lunes", "11:00", Recursos.getUsuario().getDNI());
	}
	
}
