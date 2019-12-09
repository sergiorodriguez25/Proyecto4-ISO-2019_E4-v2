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

<title>Horario M�dico</title>

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
		<a class="navbar-brand" href="/gestor">THE GOOD HEALTH</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExampleDefault"
			aria-controls="navbarsExampleDefault" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="#" tabindex="-1"
					aria-disabled="true">Asignar Horario</a></li>
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
									<h4>Formulario de Asignaci�n de Horario M�dico</h4>
									<p>Para asignar el horario del m�dico seleccione los d�as
										que va a trabajar y la hora inicio y hora fin de su jornada
										laboral.</p>
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
												<h5>Asignar horario al m�dico</h5>
												Para asignar el horario del m�dico usted debe seleccionar
												los d�as que va a trabajar y la hora inicio y hora fin de su
												jornada laboral.
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
						<label for="diasSemana">Seleccione los d�as que va a
							trabajar</label>
						<div class="container center">
							<div class="col-md-6 mb-3 text-left">
								<div class="form-check">
									<input class="form-check-input" type="checkbox" value=""
										id="lunes"> <label class="form-check-label"
										for="lunesLabel"> Lunes </label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="checkbox" value=""
										id="martes"> <label class="form-check-label"
										for="martesLabel"> Martes </label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="checkbox" value=""
										id="miercoles"> <label class="form-check-label"
										for="miercolesLabel"> Mi�rcoles </label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="checkbox" value=""
										id="jueves"> <label class="form-check-label"
										for="juevesLabel"> Jueves </label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="checkbox" value=""
										id="viernes"> <label class="form-check-label"
										for="viernesLabel"> Viernes </label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="checkbox" value=""
										id="sabado"> <label class="form-check-label"
										for="sabadoLabel"> S�bado </label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="checkbox" value=""
										id="domingo"> <label class="form-check-label"
										for="domingoLabel"> Domingo </label>
								</div>
							</div>
							<label id="labelDiaMal"></label>
						</div>

						<br></br> <label for="horas">Seleccione el horario laboral</label>
						<div class="col-md-6 mb-3">
							<div class="input-group">
								<input name="horaIni" id="horaInicio" type="text" required
									class="form-control" placeholder="Hora de Inicio 00:00">
								<input name="horaFin" id="horaFin" type="text" required
									class="form-control" placeholder="Hora de Fin 00:00">
							</div>
							<label id="labelHoraMal"></label> <br></br>

							<hr class="mb-4">
							<a id="confirmarMedico" class="btn btn-primary btn-large"
								type="submit">Confirmar</a> <a href="/gestor"
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
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

	<script type="text/javascript">
		jQuery(document).ready(function($) {

			var jsoDNI = JSON.parse(sessionStorage.MedicoHorario);
			var dni = jsoDNI.DNI;

			// 							$('DNIMedico').html(dni);
			/*
			 * Control para que no acceda a trav�s de la url a alguna p�gina que no sea el home
			 * Hay que ponerlo en todos los jsp que se hagan pr�ximamente
			 */
			// 							var referrer = document.referrer;
			// 							if (referrer != 'http://localhost:8080/citas'
			// 									&& referrer != 'https://sgc-e4.herokuapp.com/citas') {
			// 								var forma = document.forms[0];
			// 								forma.action = "/error";
			// 								forma.submit();
			// 							}
			var jsoDNI = JSON.parse(sessionStorage.MedicoHorario);
			var dni = jsoDNI.DNI;

		});

		function comprobarValidezDatos() {
			var cuenta = 0;
			document.getElementById("labelDiaMal").style.display = 'none';
			document.getElementById("labelHoraMal").style.display = 'none';
			cuenta = comprobarDia() + cuenta;
			cuenta = comprobarValidezHora(document.getElementById("horaInicio").value)
					+ cuenta;
			cuenta = comprobarValidezHora(document.getElementById("horaFin").value)
					+ cuenta;
			console.log(cuenta);
			return cuenta;
		}

		function comprobarDia() {
			if ($('#lunes').is(':checked') == false
					&& $('#martes').is(':checked') == false
					&& $('#miercoles').is(':checked') == false
					&& $('#jueves').is(':checked') == false
					&& $('#viernes').is(':checked') == false
					&& $('#sabado').is(':checked') == false
					&& $('#domingo').is(':checked') == false) {
				document.getElementById("labelDiaMal").style.display = 'inline';
				$('#labelDiaMal').html("Debe seleccionar al menos un dia");
				$('#labelDiaMal').css("color", "red");
				return 1;
			}
			return 0;
		}

		function comprobarValidezHora(hora) {

			if (hora == '') {
				document.getElementById("labelHoraMal").style.display = 'inline';
				$('#labelHoraMal').html(
						"La hora no es v�lida, debe estar en formato 00:00");
				$('#labelHoraMal').css("color", "red");
				return 1;
			}

			if (hora.length != 5) {
				console.log("hora mala");
				document.getElementById("labelHoraMal").style.display = 'inline';
				$('#labelHoraMal').html(
						"La hora no es v�lida, debe estar en formato 00:00");
				$('#labelHoraMal').css("color", "red");
				return 1;
			}

			for (i = 0; i < hora.length; i++) {
				switch (i) {
				case 0:
					if (hora.charAt(i) != "0" && hora.charAt(i) != "1"
							&& hora.charAt(i) != "2") {
						console.log("hora mala se pasa del dos");
						document.getElementById("labelHoraMal").style.display = 'inline';
						$('#labelHoraMal')
								.html(
										"La hora no es v�lida, debe estar en formato 00:00");
						$('#labelHoraMal').css("color", "red");
						return 1;
					}
					break;
				case 1:
					if (hora.charAt(i) != "0" && hora.charAt(i) != "1"
							&& hora.charAt(i) != "2" && hora.charAt(i) != "3"
							&& hora.charAt(i) != "4" && hora.charAt(i) != "5"
							&& hora.charAt(i) != "6" && hora.charAt(i) != "7"
							&& hora.charAt(i) != "8" && hora.charAt(i) != "9") {
						console.log("hora mala 1 se pasa del dos");
						document.getElementById("labelHoraMal").style.display = 'inline';
						$('#labelHoraMal')
								.html(
										"La hora no es v�lida, debe estar en formato 00:00");
						$('#labelHoraMal').css("color", "red");
						return 1;
					}
					break;
				case 2:
					if (hora.charAt(i) != ":") {
						console.log("hora mala no hay dos puntso");
						document.getElementById("labelHoraMal").style.display = 'inline';
						$('#labelHoraMal')
								.html(
										"La hora no es v�lida, debe estar en formato 00:00");
						$('#labelHoraMal').css("color", "red");
						return 1;
					}
					break;
				case 3:
					if (hora.charAt(i) != "0" && hora.charAt(i) != "1"
							&& hora.charAt(i) != "2" && hora.charAt(i) != "3"
							&& hora.charAt(i) != "4" && hora.charAt(i) != "5") {
						console.log("hora mala 3 se pasa del dos");
						document.getElementById("labelHoraMal").style.display = 'inline';
						$('#labelHoraMal')
								.html(
										"La hora no es v�lida, debe estar en formato 00:00");
						$('#labelHoraMal').css("color", "red");
						return 1;
					}
					break;
				case 4:
					if (hora.charAt(i) != "0" && hora.charAt(i) != "1"
							&& hora.charAt(i) != "2" && hora.charAt(i) != "3"
							&& hora.charAt(i) != "4" && hora.charAt(i) != "5"
							&& hora.charAt(i) != "6" && hora.charAt(i) != "7"
							&& hora.charAt(i) != "8" && hora.charAt(i) != "9") {
						console.log("hora mala 4 se pasa del dos");
						document.getElementById("labelHoraMal").style.display = 'inline';
						$('#labelHoraMal')
								.html(
										"La hora no es v�lida, debe estar en formato 00:00");
						$('#labelHoraMal').css("color", "red");
						return 1;
					}
					break;
				}

			}
			return 0;

		}

		$(document)
				.ready(
						function() {
							$('#confirmarMedico')
									.click(
											function(event) {
												if (comprobarValidezDatos() == 0) {
													var diasSelecc = new Array();
													var i = 0;
													if ($('#lunes').is(
															':checked')) {
														diasSelecc[i] = 'Lunes';
														i++;
													}
													if ($('#martes').is(
															':checked')) {
														diasSelecc[i] = 'Martes';
														i++;
													}
													if ($('#miercoles').is(
															':checked')) {
														diasSelecc[i] = 'Mi�rcoles';
														i++;
													}
													if ($('#jueves').is(
															':checked')) {
														diasSelecc[i] = 'Jueves';
														i++;
													}
													if ($('#viernes').is(
															':checked')) {
														diasSelecc[i] = 'Viernes';
														i++;
													}
													if ($('#sabado').is(
															':checked')) {
														diasSelecc[i] = 'S�bado';
														i++;
													}
													if ($('#domingo').is(
															':checked')) {
														diasSelecc[i] = 'Domingo';
														i++;
													}
													console.log(diasSelecc);

													var horaInicio = (document
															.getElementById("horaInicio").value);
													var horaFin = (document
															.getElementById("horaFin").value);
													console.log(horaInicio);
													console.log(horaFin);

													enviarDatosModificacionHorario(diasSelecc,
															horaInicio, horaFin);
												}
											});
						});

		function enviarDatosModificacionHorario(dias, horaI, horaF) {
			var jsoMed = JSON.parse(sessionStorage.MedicoHorario);
			var jsodias = JSON.stringify(dias);
			var jsoGestor = JSON.parse(sessionStorage.usuario);
			var centro = jsoGestor.resultado.gestor.centro;
			var data = {
				DNI : jsoMed.Medico[0].DNI,
				especialidad : jsoMed.Medico[0].especialidad,
				dias : jsodias,
				horaInicio : horaI,
				horaFin : horaF,
				centro : centro,
				tipo : "enviarDatosModificacionHorario"
			};
			var url = "/formularioModificarHorario";
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
				success : HorarioModificadoOK,
				error : HorarioModificadoError
			});
		}

		function HorarioModificadoOK(respuesta) {
			console.log("Horario modificado OK");
			swal({
				title : "Horario Modificado",
				icon : "success",
			}).then(function() {
				window.location.href = "/gestor";
			});
		}

		function HorarioModificadoError(e) {
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
	</script>
</body>
</html>