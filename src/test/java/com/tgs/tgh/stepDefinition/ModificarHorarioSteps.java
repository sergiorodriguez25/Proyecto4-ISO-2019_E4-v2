package com.tgs.tgh.stepDefinition;

import com.tgs.tgh.dao.HorarioMedicoDAO;
import com.tgs.tgh.web.Manager;

import cucumber.api.java.en.Then;

public class ModificarHorarioSteps {
	@Then("^El horario cambia en la base de datos$")
	public void el_horario_cambia_en_la_base_de_datos() throws Throwable {
	    	String[] dias = new String[1];
	    	dias[0] = "Martes";
		Manager.get().modificarCalendarioMedico(Recursos.getMedico().getDNI(), Recursos.getMedico().getEspecialidad(), "10:00", "11:00", dias, Recursos.getMedico().getCentroMedico());
	}

	@Then("^Se elimina el nuevo horario$")
	public void se_elimina_el_nuevo_horario() throws Throwable {
		HorarioMedicoDAO.eliminarHoraMedico("Martes", "10:00", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.eliminarHoraMedico("Martes", "10:15", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.eliminarHoraMedico("Martes", "10:30", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.eliminarHoraMedico("Martes", "10:45", Recursos.getUsuario().getDNI());
		HorarioMedicoDAO.eliminarHoraMedico("Martes", "11:00", Recursos.getUsuario().getDNI());
	}
}
