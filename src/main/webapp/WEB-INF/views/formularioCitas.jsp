<
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
		<a class="navbar-brand" href="/citas">THE GOOD HEALTH</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExampleDefault"
			aria-controls="navbarsExampleDefault" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="/citas"
					tabindex="-1" aria-disabled="true">Mis citas</a></li>
				<li class="nav-item active"><a class="nav-link" href="#">Pedir
						cita <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="dropdown01"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Cuenta</a>
					<div class="dropdown-menu" aria-labelledby="dropdown01">
						<a class="dropdown-item" href="#">Mi Perfil</a> <a
							class="dropdown-item" href="#">Informaci�n</a> <a
							class="dropdown-item" href="/">Cerrar sesi�n</a>
					</div></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Buscar"
					aria-label="Search">
				<button class="btn btn-secondary my-2 my-sm-0" type="submit">Buscar</button>
			</form>
		</div>
	</nav>



	<main role="main" class="container">
		<div class="span">
			<div></div>
			<div class="container center">
			<div class="hero-unit">
				<br></br>
				<div class="row align-items-center">
					<div class="col-md-8">
						<div class="card">
							<div class="card-body">
								<h4>Formulario de Citas</h4>
								<p>Para pedir una cita, rellene todos los campos que
									encontrar� a continuaci�n para solicitar la cita deseada,
									despu�s pulse en el bot�n de Solicitar cita.</p>
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
					<div class="col-md-6 mb-3">
						<label for="especialidad">Especialidad</label> <select
							class="form-control form-control-lg align:center" id="especialidad">
							<option>Pediatria</option>
							<option>Traumatologia</option>
							<option>Neurocirugia</option>
							<option>Alergologo</option>
						</select>
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
										<option>10:00</option>
										<option>11:00</option>
										<option>12:00</option>
										<option>13:00</option>
										<option>14:00</option>
									</select>
								</div>
							</div>
							<br></br>

							<hr class="mb-4">
							<a id="pedircita" class="btn btn-primary btn-large" type="submit">Solicitar
								cita</a> <a href="/citas" class="btn btn-default" type="submit">Volver
								atras</a>
						</form>
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
							 * Control para que no acceda a trav�s de la url a alguna p�gina que no sea el home
							 * Hay que ponerlo en todos los jsp que se hagan pr�ximamente
							 */
							var referrer = document.referrer;
							if (referrer != 'http://localhost:8080/citas'
									&& referrer != 'https://the-good-health.herokuapp.com/citas') {
								var forma = document.forms[0];
								forma.action = "/error";
								forma.submit();
							}
							$('#pedircita')
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

		function enviarDatos() {
			var jsoUser = JSON.parse(sessionStorage.usuario);
			var data = {
				dniPaciente : jsoUser.resultado.usuario.dni,
				especialidad : $('#especialidad').val(),
				dia : $('#fecha_ini').val(),
				hora : $('#hora').val(),
			};
			var url = "/formularioCitas";
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
				success : PedirCitaOK,
				error : PedirCitaError
			});
		}

		function PedirCitaOK(respuesta) {
			console.log("Cita OK");
			swal({
				title : "Bien hecho",
				text : "Has a�adido una cita",
				icon : "success",
			}).then(function() {
				window.location.href = "/citas";
			});
		}

		function PedirCitaError() {
			$('#especialidad').val("");
			$('#fecha_ini').val("");
			$('#hora').val("");
		}

		function comprobarHora(texto) {
			document.getElementById("hora").style.display = 'none';
			if (texto == '') {
				document.getElementById("hora").style.display = 'inline';
				$('#hora').html("Tiene que escojer una hora para su cita.");
				$('#hora').css("color", "red");
				return 1;
			}
			return 0;
		}

		function comprobarFecha(texto) {
			document.getElementById("fecha").style.display = 'none';
			if (texto == '') {
				document.getElementById("fecha").style.display = 'inline';
				$('#fecha').html("Tiene que escojer un d�a para su cita.");
				$('#fecha').css("color", "red");
				return 1;
			}
			return 0;
		}

		$('#fecha_ini').datepicker({
			format : "dd/mm/yyyy",
			startDate : "1/1/1900",
			endDate : "13/10/2019",
			todayBtn : "linked",
			language : "es",
			todayHighlight : true
		});
	</script>
</body>
</html>