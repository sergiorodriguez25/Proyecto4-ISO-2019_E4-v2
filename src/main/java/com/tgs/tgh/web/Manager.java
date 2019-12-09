package com.tgs.tgh.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.tgs.tgh.dao.CitaDAO;
import com.tgs.tgh.dao.EspecialidadDAO;
import com.tgs.tgh.dao.GestorDAO;
import com.tgs.tgh.dao.GrupoMedicoDAO;
import com.tgs.tgh.dao.HorarioMedicoDAO;
import com.tgs.tgh.dao.MedicoDAO;
import com.tgs.tgh.dao.PacienteDAO;
import com.tgs.tgh.dao.UsuarioDAO;
import com.tgs.tgh.model.Cita;
import com.tgs.tgh.model.Gestor;
import com.tgs.tgh.model.GrupoMedico;
import com.tgs.tgh.model.HorarioMedico;
import com.tgs.tgh.model.Medico;
import com.tgs.tgh.model.Paciente;
import com.tgs.tgh.model.Usuario;

import gherkin.deps.com.google.gson.JsonObject;

@Component
public class Manager {
	private ConcurrentHashMap<String, Usuario> usuarios;

	@Autowired
	private UsuarioDAO usuDao;

	
	private Manager() {
		this.usuarios = new ConcurrentHashMap<String, Usuario>();
	}

	private static class ManagerHolder {
		static Manager singleton = new Manager();
	}

	@Bean
	public static Manager get() {
		return ManagerHolder.singleton;
	}

	public boolean comprobarSiExisteDNI(String dni) {
		boolean comprobar = UsuarioDAO.comprobarDNI(dni);
		return comprobar;
	}

	public JSONObject login(String dni, String pwd) throws Exception {
		Usuario usuario = UsuarioDAO.login(dni, pwd);
		if (usuario == null || dni.length() == 0 || pwd.length() == 0)
			return new JSONObject().put("usuario", "invalido");
		System.out.println(usuario.getDNI());
		JSONObject respuesta = new JSONObject();
		JSONObject jsoUsu = new JSONObject();
		jsoUsu.put("dni", usuario.getDNI());
		jsoUsu.put("apellidos", usuario.getApellidos());
		jsoUsu.put("nombre", usuario.getNombre());
		jsoUsu.put("domicilio", usuario.getDomicilio());
		jsoUsu.put("email", usuario.getEmail());
		jsoUsu.put("nacimiento", usuario.getFechaNac());
		jsoUsu.put("poblacion", usuario.getPoblacion());
		jsoUsu.put("telefono", usuario.getTelefono());
		jsoUsu.put("password", usuario.getPassword());
		jsoUsu.put("cp", usuario.getCodigoPostal());
		respuesta.put("usuario", jsoUsu);

		Paciente paciente = PacienteDAO.esPaciente(usuario);
		if (paciente != null) {
			JSONObject jsoPac = new JSONObject();
			jsoPac.put("centro", paciente.getCentroMedico());
			respuesta.put("paciente", jsoPac);
			respuesta.put("tipoUsuario", "Paciente");
		}
		Medico medico = MedicoDAO.esMedico(usuario);
		if (medico != null) {
			JSONObject jsoMed = new JSONObject();
			jsoMed.put("especialidad", medico.getEspecialidad());
			jsoMed.put("centro", medico.getCentroMedico());
			respuesta.put("medico", jsoMed);
			respuesta.remove("tipoUsuario");
			respuesta.put("tipoUsuario", "Medico");
		}
		Gestor gestor = GestorDAO.esGestor(usuario);
		if (gestor != null) {
			JSONObject jsoGes = new JSONObject();
			jsoGes.put("centro", gestor.getCentroMedico());
			respuesta.put("gestor", jsoGes);
			respuesta.remove("tipoUsuario");
			respuesta.put("tipoUsuario", "Gestor");
		}
		GrupoMedico grupo = getGrupoMedico(dni);
		JSONObject jsoGrupo = new JSONObject();
		jsoGrupo.put("listaMedicos", grupo.getListaMedicos());
		respuesta.put("grupoMedico", jsoGrupo);

		return respuesta;
	}

	public JSONObject registro(String dni, String pwd, String nombre, String apellidos, String nacimiento,
			String domicilio, String poblacion, String cp, String telefono, String email) {
		Usuario usuario = new Usuario(dni, pwd, nombre, apellidos, nacimiento, domicilio, poblacion, cp, telefono,
				email);
		UsuarioDAO.registro(usuario);
		PacienteDAO.registro(dni, "Sin asignar");
		JSONObject respuesta = new JSONObject();
		JSONObject jsoUsu = new JSONObject();
		jsoUsu.put("dni", usuario.getDNI());
		jsoUsu.put("apellidos", usuario.getApellidos());
		jsoUsu.put("nombre", usuario.getNombre());
		jsoUsu.put("domicilio", usuario.getDomicilio());
		jsoUsu.put("email", usuario.getEmail());
		jsoUsu.put("nacimiento", usuario.getFechaNac());
		jsoUsu.put("poblacion", usuario.getPoblacion());
		jsoUsu.put("telefono", usuario.getTelefono());
		jsoUsu.put("password", usuario.getPassword());
		jsoUsu.put("cp", usuario.getCodigoPostal());

		JSONObject jsoPac = new JSONObject();
		jsoPac.put("centro", "Sin asignar");

		respuesta.put("usuario", jsoUsu);
		respuesta.put("paciente", jsoPac);

		return respuesta;
	}

	public void eliminarUsuario(Usuario usuario) throws Exception {
		UsuarioDAO.eliminar(usuario);
	}

	public void eliminarPaciente(Paciente paciente) throws Exception {
		PacienteDAO.eliminar(paciente);
	}

	public void eliminarMedico(Medico medico) throws Exception {
		MedicoDAO.eliminar(medico);
	}

	public JSONArray getCitas(String dni) throws Throwable {
		List<Cita> citas = CitaDAO.getCitas(dni);
		JSONArray arrayCitas = new JSONArray();
		System.out.println(arrayCitas);
		for (int i = 0; i < citas.size(); i++) {
			String dniM = citas.get(i).getDniMedico();
			Usuario usu = UsuarioDAO.getUsuario(dniM);
			Medico medico = MedicoDAO.esMedico(usu);
			System.out.println(medico);
			Cita cita = citas.get(i);
			JSONObject jsoCita = new JSONObject();
			jsoCita.put("especialidad", medico.getEspecialidad());
			jsoCita.put("nombreApe", medico.getNombre() + " " + medico.getApellidos());
			jsoCita.put("dia", cita.getDia());
			jsoCita.put("hora", cita.getHora());
			jsoCita.put("centro", medico.getCentroMedico());
			arrayCitas.put(i, jsoCita);
		}
		return arrayCitas;
	}

	public void introducirCita(String dniPaciente, String dniMedico, String dia, String hora) {
		CitaDAO.introducirCita(new Cita(dniPaciente, dniMedico, dia, hora));
	}

	public void modificarCita(Cita cita, String nuevoDia, String nuevaHora) throws Exception {
		CitaDAO.modificarCita(cita, nuevoDia, nuevaHora);
	}

	public void eliminarCita(Cita cita) throws Exception {
		CitaDAO.eliminarCita(cita);
	}

	public GrupoMedico getGrupoMedico(String dniPaciente) throws Exception {
		ArrayList<String> grupos = GrupoMedicoDAO.getGrupoMedico(dniPaciente);
		GrupoMedico grupo = new GrupoMedico(dniPaciente, new ArrayList<Medico>());
		for (String dniMedico : grupos) {
			Usuario usuario = UsuarioDAO.getUsuario(dniMedico);
			grupo.getListaMedicos().add(MedicoDAO.esMedico(usuario));
		}

		return grupo;

	}
	
	public void eliminarGrupoMedico(String dniPaciente) throws Exception {
		ArrayList<String> grupo = GrupoMedicoDAO.getGrupoMedico(dniPaciente);
		GrupoMedicoDAO.deleteGrupoMedico(dniPaciente, grupo);
	}

	public JSONObject getHorarioCitas(String dniMedico) {
		HorarioMedico hm = HorarioMedicoDAO.getHorarioMedico(dniMedico);

		JSONObject jsoHM = new JSONObject();
		jsoHM.put("DNI", hm.getDni());
		jsoHM.put("horario", hm.getHorario());
		JSONObject resultado = new JSONObject();
		resultado.put("horarioMedico", jsoHM);
		return resultado;
	}

	public void eliminarHoraMedico(String dia, String hora, String dniMedico) {
		HorarioMedicoDAO.eliminarHoraMedico(dia, hora, dniMedico);
	}

	public void anadirHoraMedico(String dia, String hora, String dniMedico) {
		HorarioMedicoDAO.anadirHoraMedico(dia, hora, dniMedico);
	}

	public JSONArray getCitasMedico(String dni) throws Throwable {
		List<Cita> citas = CitaDAO.getCitasMedicoDAO(dni);
		JSONArray arrayCitas = new JSONArray();
		for (int i = 0; i < citas.size(); i++) {
			Cita cita = citas.get(i);
			Usuario usuario = UsuarioDAO.getUsuario(cita.getDniPaciente());
			JSONObject jsoCita = new JSONObject();
			jsoCita.put("hora", cita.getHora());
			jsoCita.put("dia", cita.getDia());
			jsoCita.put("DNIPaciente", cita.getDniPaciente());
			jsoCita.put("nombreApe", usuario.getNombre() + " " + usuario.getApellidos());
			arrayCitas.put(i, jsoCita);
		}
		return arrayCitas;
	}

	public JSONObject getCitasDiaMedico(String dniMedico, String fecha) {
		ArrayList<String> lista = new ArrayList<String>();
		lista = CitaDAO.getCitasDiaMedico(dniMedico, fecha);
		JSONObject jsoHoras = new JSONObject();
		jsoHoras.put("horas", lista);
		return jsoHoras;
	}

	public JSONObject getTodosUsuario() throws Exception {
		ArrayList<Usuario> lista = GestorDAO.getTodosUsuarios();
		ArrayList<Paciente> listaPac = new ArrayList<Paciente>();
		ArrayList<Medico> listaMed = new ArrayList<Medico>();
		JSONObject jsoallPac = new JSONObject();
		JSONObject jsoallMed = new JSONObject();
		JSONObject jsoresultado = new JSONObject();
		for (int i = 0; i < lista.size(); i++) {
			Usuario usu = lista.get(i);
			Paciente paciente = PacienteDAO.esPaciente(usu);
			listaPac.add(paciente);
			Medico medico = MedicoDAO.esMedico(usu);
			if (medico != null)
				listaMed.add(medico);
		}
		jsoallPac.put("Pacientes", listaPac);
		jsoallMed.put("Medicos", listaMed);
		jsoresultado.put("Pacientes", listaPac);
		jsoresultado.put("Medicos", listaMed);
		return jsoresultado;
	}

	public JSONObject getMedicosCentro(String centroMedico) throws Exception {
		ArrayList<String[]> dniMedicos = GestorDAO.getMedicosCentro(centroMedico);
		JSONObject respuesta = new JSONObject();
		ArrayList<Medico> listaMed = new ArrayList<Medico>();
		Usuario usuarioMedico;
		Medico medico;
		for (int i = 0; i < dniMedicos.size(); i++) {
			usuarioMedico = UsuarioDAO.getUsuario(dniMedicos.get(i)[0]);
			medico = new Medico(usuarioMedico.getDNI(), usuarioMedico.getPassword(), usuarioMedico.getNombre(),
					usuarioMedico.getApellidos(), usuarioMedico.getFechaNac(), usuarioMedico.getDomicilio(),
					usuarioMedico.getPoblacion(), usuarioMedico.getCodigoPostal(), usuarioMedico.getTelefono(),
					usuarioMedico.getEmail(), dniMedicos.get(i)[1], centroMedico);
			listaMed.add(medico);
		}
		respuesta.put("Medicos", listaMed);
		return respuesta;
	}

	public void anadirCentroYGrupoMedico(String dniPaciente, String centro, String[] grupoMedico) {
		PacienteDAO.modificarCentro(dniPaciente, centro);
		GrupoMedicoDAO.insertGrupoMedico(dniPaciente, new ArrayList<String>(Arrays.asList(grupoMedico)));
	}

	public static JSONObject getEspecialidades() {
		ArrayList<String[]> lista = EspecialidadDAO.getEspecialidades();
		JSONObject jsoEspecialidades = new JSONObject();
		jsoEspecialidades.put("Especialidades", lista);
		return jsoEspecialidades;
	}
	
	public void modificarCalendarioMedico(String dniMedico, String especialidad, String horaIni, String horaFin, String[] diasElegidos, String centroMedico) {
		String duracion = EspecialidadDAO.getDuracion(especialidad);
		int duracionInt = Integer.parseInt(duracion);
		
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date dateIni = new Date();
		Date dateFin = new Date();
		try {
			dateIni = format.parse(horaIni);
			System.out.println(dateIni);
			dateFin = format.parse(horaFin);
			System.out.println(dateFin);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendarFin = GregorianCalendar.getInstance();
		calendarFin.setTime(dateFin);
		int hourFin = calendarFin.get(Calendar.HOUR_OF_DAY);
		int minFin = calendarFin.get(Calendar.MINUTE);
		System.out.println(hourFin + " " + minFin);
		Calendar calendarPonerPrimeraHora = GregorianCalendar.getInstance();
		calendarPonerPrimeraHora.setTime(dateIni);
		int hourFirst = calendarPonerPrimeraHora.get(Calendar.HOUR_OF_DAY);
		int minFirst = calendarPonerPrimeraHora.get(Calendar.MINUTE);
		String primeraHora = montarHoras(hourFirst, minFirst);
		System.out.println(primeraHora);
		for (int i = 0; i < diasElegidos.length; i++)
			HorarioMedicoDAO.anadirHoraMedico(diasElegidos[i], primeraHora, dniMedico);
		int hour = 0;
		int min = 0;
		while (hour < hourFin || min < minFin) {

			Calendar calendar = GregorianCalendar.getInstance();
			calendar.setTime(dateIni);
			calendar.add(Calendar.MINUTE, duracionInt);
			Date fechaSalida = calendar.getTime();
			calendar.setTime(fechaSalida);
			hour = calendar.get(Calendar.HOUR_OF_DAY);
			min = calendar.get(Calendar.MINUTE);
			String nuevaHora = montarHoras(hour, min);
			System.out.println(nuevaHora);
			try {
				dateIni = format.parse(nuevaHora);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			for (int j = 0; j < diasElegidos.length; j++)
				HorarioMedicoDAO.anadirHoraMedico(diasElegidos[j], nuevaHora, dniMedico);
		}
	}

	public JSONObject guardarNuevoMedico(String dni, String especialidad, String horaIni, String horaFin,
			String[] diasElegidos, String centroMedico) {

		MedicoDAO.registro(dni, especialidad, centroMedico);
		String duracion = EspecialidadDAO.getDuracion(especialidad);
		int duracionInt = Integer.parseInt(duracion);

		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date dateIni = new Date();
		Date dateFin = new Date();
		try {
			dateIni = format.parse(horaIni);
			System.out.println(dateIni);
			dateFin = format.parse(horaFin);
			System.out.println(dateFin);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendarFin = GregorianCalendar.getInstance();
		calendarFin.setTime(dateFin);
		int hourFin = calendarFin.get(Calendar.HOUR_OF_DAY);
		int minFin = calendarFin.get(Calendar.MINUTE);
		System.out.println(hourFin + " " + minFin);
		Calendar calendarPonerPrimeraHora = GregorianCalendar.getInstance();
		calendarPonerPrimeraHora.setTime(dateIni);
		int hourFirst = calendarPonerPrimeraHora.get(Calendar.HOUR_OF_DAY);
		int minFirst = calendarPonerPrimeraHora.get(Calendar.MINUTE);
		String primeraHora = montarHoras(hourFirst, minFirst);
		System.out.println(primeraHora);
		for (int i = 0; i < diasElegidos.length; i++)
			HorarioMedicoDAO.anadirHoraMedico(diasElegidos[i], primeraHora, dni);
		int hour = 0;
		int min = 0;
		while (hour < hourFin || min < minFin) {

			Calendar calendar = GregorianCalendar.getInstance();
			calendar.setTime(dateIni);
			calendar.add(Calendar.MINUTE, duracionInt);
			Date fechaSalida = calendar.getTime();
			calendar.setTime(fechaSalida);
			hour = calendar.get(Calendar.HOUR_OF_DAY);
			min = calendar.get(Calendar.MINUTE);
			String nuevaHora = montarHoras(hour, min);
			System.out.println(nuevaHora);
			try {
				dateIni = format.parse(nuevaHora);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			for (int j = 0; j < diasElegidos.length; j++)
				HorarioMedicoDAO.anadirHoraMedico(diasElegidos[j], nuevaHora, dni);
		}

		JSONObject jsoEspecialidades = new JSONObject();
		jsoEspecialidades.put("Insertar", "OK");
		return jsoEspecialidades;
	}

	public static String montarHoras(int hour, int min) {
		StringBuilder sb = new StringBuilder();
		if (hour < 10) {
			sb.append(0).append(hour);
		} else {
			sb.append(hour);
		}
		sb.append(":");
		if (min < 10) {
			sb.append(0).append(min);
		} else {
			sb.append(min);
		}
		return sb.toString();
	}

	public static void guardarNuevoGestor(String dniNuevoGestor, String centro) {
		GestorDAO.insertar(dniNuevoGestor, centro);

	}

	public static JSONObject getCitasPorFecha(String fecha) {
		ArrayList<Cita> lista = CitaDAO.getCitasPorFecha(fecha);
		JSONObject jsoResultado = new JSONObject();
		ArrayList<JSONObject> list = new ArrayList<JSONObject>();
		for(int i=0; i<lista.size(); i++) {
			Cita cita = lista.get(i);
			String dniMedico = cita.getDniMedico();
			String dniPaciente = cita.getDniPaciente();
			Usuario usuMed = new Usuario();
			Usuario usuPac = new Usuario();
			try {
				usuMed = UsuarioDAO.getUsuario(dniMedico);
				usuPac = UsuarioDAO.getUsuario(dniPaciente);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			JSONObject jsoCita = new JSONObject();
			jsoCita.put("dia", lista.get(i).getDia());
			jsoCita.put("hora", lista.get(i).getHora());
			jsoCita.put("dniMedico", usuMed.getDNI());
			jsoCita.put("nombreMedico", usuMed.getNombre());
			jsoCita.put("apellidosMedico", usuMed.getApellidos());
			jsoCita.put("dniPaciente", usuPac.getDNI());
			jsoCita.put("nombrePaciente", usuPac.getNombre());
			jsoCita.put("apellidosPaciente", usuPac.getApellidos());
			list.add(jsoCita);
		}
		JSONObject jso = new JSONObject();
		jso.put("Citas", list);
		
		return jso;
	}

}
