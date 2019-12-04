<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<link rel="canonical"
	href="https://getbootstrap.com/docs/3.4/examples/signin/">

<title>Pedir Cita</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<link rel="stylesheet" href="datePicker/css/bootstrap-datepicker.css">
<script src="datePicker/js/bootstrap-datepicker.min.js"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.js"></script>

<script src="datePicker/locales/bootstrap-datepicker.es.min.js"></script>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker3.min.css">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="../../assets/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="signin.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- Custom styles for this template -->
<link href="starter-template.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
		<a class="navbar-brand" href="#">THE GOOD HEALTH</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExampleDefault"
			aria-controls="navbarsExampleDefault" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="#" tabindex="-1"
					aria-disabled="true">Mis citas</a></li>
				<li class="nav-item active"><a class="nav-link" href="#">Modificar
						cita <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="dropdown01"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Cuenta</a>
					<div class="dropdown-menu" aria-labelledby="dropdown01">
						<a class="dropdown-item" href="#">Mi Perfil</a> <a
							class="dropdown-item" data-toggle="modal"
							data-target="#informacion">Informaci�n</a> <a
							class="dropdown-item" href="/">Cerrar sesi�n</a>
					</div></li>
			</ul>
		</div>
	</nav>



	<main role="main" class="container">
		<div class="span">
			<div></div>
			<div class="container center">
				<div class="hero-unit">
					<br></br> <br></br>
					<div></div>
					<div></div>
					<div class="row align-items-center">
						<div class="col-md-8">
							<div class="card">
								<div class="card-body">
									<h4>Formulario de Modificaci�n</h4>
									<p>Para modificar una cita, cambie los campos que
										encontrar� a continuaci�n, despu�s pulse en el bot�n de
										Modificar cita.</p>
								</div>
								<div class="modal fade" id="informacion" tabindex="-1"
									role="dialog" aria-labelledby="exampleModalLongTitle"
									aria-hidden="true">
									<div class="modal-dialog" role="document">
										<div class="modal-content">
											<div class="modal-header">
												<h5 class="modal-title" id="exampleModalLongTitle">Informaci�n</h5>
												<button type="button" class="close" data-dismiss="modal"
													aria-label="Close">
													<span aria-hidden="true">&times;</span>
												</button>
											</div>
											<div class="modal-body">
												En esta vista usted puede:
												<h5></h5>
												<h5>Modificar cita</h5>
												Para modificar una cita, cambie los campos que encontrar� a
												continuaci�n, despu�s pulse en el bot�n de Modificar cita.
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-secondary"
													data-dismiss="modal">Close</button>
											</div>
										</div>
									</div>
								</div>
							</div>

						</div>
						<div class="col-md-1"></div>
					</div>
					<br></br>
				</div>
			</div>
			<div class="container center">
				<div class="jumbotron jumbotron-fluid">
					<div align='center'>
						<div class="col-md-6 mb-3">
							<label id="tituloespecialidad"><b>Especialidad</b></label>
							<div>
								<label id="especialidad"></label>
							</div>
						</div>
						<br></br>

						<div class="col-md-6 mb-3">
							<label for="fecha_ini">D�a</label> <input type="text"
								id="fecha_ini" class="form-control">
							<div class="invalid-feedback">Informaci�n necesaria.</div>
							<label id="fecha"></label>
						</div>
						<br></br>

						<div class="col-md-6 mb-3">
							<label for="hora">Hora</label> <select
								class="form-control form-control-lg align:center" id="hora">

							</select> <label id="noHayHora"></label>
						</div>

						<br></br>

						<hr class="mb-4">
						<a id="modificarcita" class="btn btn-primary btn-large"
							type="submit">Modificar cita</a> <a id="volverAtras"
							class="btn btn-primary btn-large" type="submit">Volver atr�s</a>
						</form>
					</div>
				</div>
			</div>
		</div>
		</div>
		<br></br>
	</main>
	<!-- /.container -->

	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.8/angular.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.min.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

	<script type="text/javascript">
		jQuery(document)
				.ready(
						function($) {
							/*
							 * Control para que no acceda a traves de la url a alguna pagina que no sea el home
							 * Hay que ponerlo en todos los jsp que se hagan proximamente
							 */
							var referrer = document.referrer;
							if (referrer != 'http://localhost:8080/citas'
									&& referrer != 'https://sgc-e4.herokuapp.com/citas'
									&& referrer != 'http://sgc-e4.herokuapp.com/citas'
									&& referrer != 'sgc-e4.herokuapp.com/citas'
									&& referrer != 'http://localhost:8080/citasGestor'
									&& referrer != 'https://sgc-e4.herokuapp.com/citasGestor'
									&& referrer != 'http://sgc-e4.herokuapp.com/citasGestor'
									&& referrer != 'sgc-e4.herokuapp.com/citasGestor'
									&& referrer != 'http://localhost:8080/medicoGestor'
									&& referrer != 'https://sgc-e4.herokuapp.com/medicoGestor'
									&& referrer != 'http://sgc-e4.herokuapp.com/medicoGestor'
									&& referrer != 'sgc-e4.herokuapp.com/medicoGestor'
									&& referrer != 'http://localhost:8080/citasGestor'
									&& referrer != 'https://sgc-e4.herokuapp.com/citasGestor'
									&& referrer != 'http://localhost:8080/medicoGestor'
									&& referrer != 'https://sgc-e4.herokuapp.com/medicoGestor') {
								var forma = document.forms[0];
								forma.action = "/error";
								forma.submit();
							}
							if (referrer == 'http://localhost:8080/medicoGestor'
									|| referrer != 'https://sgc-e4.herokuapp.com/medicoGestor') {
								document.getElementById("tituloespecialidad").innerHTML = "";
							}
							var jsoModif = JSON.parse(sessionStorage.modificar);
							var espec = jsoModif.citaModificar[0].especialidad;
							var diaAModificar = jsoModif.citaModificar[0].dia;
							var horaAModificar = jsoModif.citaModificar[0].hora;
							var dniMedico = jsoModif.citaModificar[0].dniMedico;
							console.log(diaAModificar);

							var weekday = new Array(7);
							weekday[0] = "Domingo";
							weekday[1] = "Lunes";
							weekday[2] = "Martes";
							weekday[3] = "Mi�rcoles";
							weekday[4] = "Jueves";
							weekday[5] = "Viernes";
							weekday[6] = "S�bado";
							var dateParts = diaAModificar.split("/");
							var dateObject = new Date(+dateParts[2],
									dateParts[1] - 1, +dateParts[0]);
							var diaSemana = weekday[dateObject.getDay()];

							$('#especialidad').html(espec);
							$('#fecha_ini')
									.datepicker('setDate', diaAModificar);
							$('#hora').html(horaAModificar);
							solicitarHorarioMedico(dniMedico);

							var jsoHorario = JSON.parse(sessionStorage.horario);
							var horario = jsoHorario.horarioMedico.horario;
							var numHoras = 0;
							for (var j = 0; j < horario.length; j++) {
								if (diaSemana == horario[j][0]) {
									numHoras++;
								}
							}
							console.log(numHoras);
							var horasDisponibles = new Array(numHoras);
							var k = 0;
							for (var i = 0; i < horario.length; i++) {
								if (diaSemana == horario[i][0]) {
									horasDisponibles[k] = horario[i][1];
									console.log(horasDisponibles[k]);
									k++;
								}
							}
							var dniMedico = jsoHorario.horarioMedico.DNI;
							getHorasCitasDiaSeleccionado(diaAModificar,
									dniMedico);
							var jsoHorasOcu = JSON
									.parse(sessionStorage.horasOcupadas);
							var horasOcupadas = jsoHorasOcu.horas;

							var horasOcupadasSinActual = new Array(
									horasOcupadas.length - 1);
							var contador = 0;
							for (var l = 0; l < horasOcupadas.length; l++) {
								if (horasOcupadas[l] != horaAModificar) {
									horasOcupadasSinActual[contador] = horasOcupadas[l];
									contador++;
								}
							}

							if (horasOcupadas.length != 0) {
								var horasDefinitivo = horasDisponibles
										.filter(function(e) {
											return horasOcupadasSinActual
													.indexOf(e) == -1
										});
								sessionStorage.horas = JSON
										.stringify(horasDefinitivo);
							} else {
								sessionStorage.horas = JSON
										.stringify(horasDisponibles);
							}

							if (horasDisponibles.length != 0) {
								document.getElementById("hora").disabled = false;
								$('#noHayHora').html("");
								rellenarHoras();
							} else {
								$('#hora').html("");
								document.getElementById("hora").disabled = true;
								if ($("#fecha_ini").datepicker("getDate") != null) {

									$('#noHayHora')
											.html(
													"No hay horas disponibles para este d�a, seleccione otro.");
									$('#noHayHora').css("color", "red");
								}
							}

						});

		jQuery(document)
				.ready(
						function($) {
							$('#volverAtras')
									.click(
											function(event) {
												event.preventDefault();
												var referrer = document.referrer;
												if (referrer == 'http://localhost:8080/citasGestor'
														|| referrer == 'https://sgc-e4.herokuapp.com/citasGestor') {
													location.href = "/citasGestor";
												} else if (referrer == 'http://localhost:8080/medicoGestor'
														|| referrer == 'https://sgc-e4.herokuapp.com/medicoGestor') {
													location.href = "/medicoGestor";
												} else
													location.href = "/citas";
											});
						});

		function getHorasCitasDiaSeleccionado(fecha, dniMedico) {
			var data = {
				dniMedico : dniMedico,
				fecha : fecha,
				tipo : "getCitasDiaMedico"
			};
			var url = "/formularioModificar";
			var type = "POST";
			var success;
			var async = false;
			var xhrFields;
			var headers = {
				'Content-Type' : 'application/json'
			};

			data = JSON.stringify(data);
			console.log(data);
			$.ajax({
				type : type,
				url : url,
				data : data,
				async : async,
				headers : headers,
				xhrFields : {
					withCredentials : true
				},
				success : getCitasOK,
				error : getCitasError
			});
		}

		function getCitasOK(respuesta) {
			console.log(respuesta);
			var jsoHorasOcu = JSON.parse(respuesta);
			sessionStorage.horasOcupadas = JSON.stringify(jsoHorasOcu);
		}

		function getCitasError(e) {
			console.log(e)
		}

		$(document)
				.ready(
						function() {
							$('#modificarcita')
									.click(
											function(event) {
												if (!(comprobarFecha(document
														.getElementById("fecha_ini").value) + comprobarHora(document
														.getElementById("hora").value)) != 0) {
													event.preventDefault();
													enviarDatos();
												}
											});
						});

		$(document)
				.ready(
						function() {
							$("#fecha_ini")
									.change(
											function() {
												$('#fecha').html("");
												var jsoHorario = JSON
														.parse(sessionStorage.horario);
												var horario = jsoHorario.horarioMedico.horario;
												var numHoras = 0;

												var weekday = new Array(7);
												weekday[0] = "Domingo";
												weekday[1] = "Lunes";
												weekday[2] = "Martes";
												weekday[3] = "Mi�rcoles";
												weekday[4] = "Jueves";
												weekday[5] = "Viernes";
												weekday[6] = "S�bado";
												var dateParts = $('#fecha_ini')
														.val().split("/");
												var dateObject = new Date(
														+dateParts[2],
														dateParts[1] - 1,
														+dateParts[0]);
												var diaSemana = weekday[dateObject
														.getDay()];

												console.log(diaSemana);
												for (var j = 0; j < horario.length; j++) {
													if (diaSemana === horario[j][0]) {
														numHoras++;
													}
												}
												console.log(numHoras);
												var horasDisponibles = new Array(
														numHoras);
												var k = 0;
												for (var i = 0; i < horario.length; i++) {
													if (diaSemana === horario[i][0]) {
														horasDisponibles[k] = horario[i][1];
														console
																.log(horasDisponibles[k]);
														k++;
													}
												}
												sessionStorage.horas = JSON
														.stringify(horasDisponibles);
												if (horasDisponibles.length != 0) {
													document
															.getElementById("hora").disabled = false;
													$('#noHayHora').html("");
													rellenarHoras();
												} else {
													$('#hora').html("");
													document
															.getElementById("hora").disabled = true;
													if ($("#fecha_ini")
															.datepicker(
																	"getDate") != null) {
														$('#noHayHora')
																.html(
																		"No hay horas disponibles para este d�a, seleccione otro.");
														$('#noHayHora').css(
																"color", "red");
													}
												}
											});
						});

		function rellenarHoras() {
			$('#hora').empty();
			var jsoModif = JSON.parse(sessionStorage.modificar);
			var dniM = jsoModif.citaModificar[0].dniMedico;
			solicitarHorarioMedico(dniM);
			var jsoHoras = JSON.parse(sessionStorage.horas);
			var select = document.getElementById("hora");
			var horaM = jsoModif.citaModificar[0].hora;
			for (var i = 0; i < jsoHoras.length; i++) {
				var option = document.createElement('option');
				option.text = option.value = jsoHoras[i];
				select.add(option, 0);
			}
			$("#hora").val(horaM);
		}

		function solicitarHorarioMedico(dniMedico) {
			var data = {
				dniMedico : dniMedico,
				tipo : "solicitar"
			};
			var url = "/formularioCitas";
			var type = "POST";
			var success;
			var xhrFields;
			var async = false;
			var headers = {
				'Content-Type' : 'application/json'
			};

			data = JSON.stringify(data);
			console.log(data);
			$.ajax({
				type : type,
				url : url,
				data : data,
				headers : headers,
				async : async,
				xhrFields : {
					withCredentials : true
				},
				success : solicitarOK,
				error : solicitarError
			});
		}

		function solicitarOK(respuesta) {
			console.log(respuesta);
			var jsoHorarioM = JSON.parse(respuesta);
			console.log(jsoHorarioM);
			console.log(jsoHorarioM.horarioMedico.horario);
			var arrayHorario = jsoHorarioM.horarioMedico.horario;
			document.getElementById("fecha_ini").disabled = false;
			sessionStorage.horario = JSON.stringify(jsoHorarioM);
		}

		function solicitarError(error) {
			console.log(error);
		}

		function enviarDatos() {
			var jsoUser = JSON.parse(sessionStorage.usuario);
			var jsoModif = JSON.parse(sessionStorage.modificar);

			var dniMed = jsoModif.citaModificar[0].dniMedico;
			var antDia = jsoModif.citaModificar[0].dia;
			var antHora = jsoModif.citaModificar[0].hora;
			var dniPac;
			var referrer = document.referrer;
			if (referrer == "http://localhost:8080/citasGestor"
					|| referrer == "https://sgc-e4.herokuapp.com/citasGestor") {
				var jsoEdit = JSON.parse(sessionStorage.PacienteEdit);
				dniPac = jsoEdit.Paciente[0].DNI;
			} else if (referrer == "http://localhost:8080/medicoGestor"
					|| referrer == "https://sgc-e4.herokuapp.com/medicoGestor")
				dniPac = jsoModif.citaModificar[0].dniPaciente;
			else
				dniPac = jsoUser.resultado.usuario.dni;
			var data = {
				dniPaciente : dniPac,
				dniMedico : dniMed,
				nuevoDia : $('#fecha_ini').val(),
				nuevaHora : $('#hora').val(),
				antiguoDia : antDia,
				antiguaHora : antHora,
				tipo : "solicitar"
			};
			var url = "/formularioModificar";
			var type = "POST";
			var success;
			var xhrFields;
			var headers = {
				'Content-Type' : 'application/json'
			};

			data = JSON.stringify(data);
			console.log(data);
			$.ajax({
				type : type,
				url : url,
				data : data,
				headers : headers,
				xhrFields : {
					withCredentials : true
				},
				success : ModificarCitaOK,
				error : ModificarCitaError
			});
		}

		function ModificarCitaOK(respuesta) {
			console.log("Cita OK");
			swal({
				title : "Solicitud Recibida",
				text : "Has modificado la cita",
				icon : "success",
			})
					.then(
							function() {
								var referrer = document.referrer;
								if (referrer == "http://localhost:8080/citasGestor"
										|| referrer == "https://sgc-e4.herokuapp.com/citasGestor")
									window.location.href = "/citasGestor";
								else if (referrer == "http://localhost:8080/medicoGestor"
										|| referrer == "https://sgc-e4.herokuapp.com/medicoGestor")
									window.location.href = "/medicoGestor";
								else
									window.location.href = "/citas";
							});
		}

		function ModificarCitaError(e) {
			console.log(e);
		}

		function comprobarHora(texto) {
			document.getElementById("noHayHora").style.display = 'none';
			if (texto == '') {
				document.getElementById("noHayHora").style.display = 'inline';
				$('#noHayHora')
						.html("Tiene que escoger una hora para su cita.");
				$('#noHayHora').css("color", "red");
				return 1;
			}
			return 0;
		}

		function comprobarFecha(texto) {
			document.getElementById("fecha").style.display = 'none';
			if (texto == '') {
				document.getElementById("fecha").style.display = 'inline';
				$('#fecha').html("Tiene que escoger un d�a para su cita.");
				$('#fecha').css("color", "red");
				return 1;
			}
			return 0;
		}

		$('#fecha_ini').datepicker({
			format : "dd/mm/yyyy",
			startDate : 'd',
			endDate : "31/12/2020",
			todayBtn : "linked",
			language : "es",
			todayHighlight : true
		});
	</script>
</body>
</html>