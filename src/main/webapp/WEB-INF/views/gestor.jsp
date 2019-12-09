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

<title>Gestor</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

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
				<li class="nav-item active"><a class="nav-link" href="#">Funcionalidades<span
						class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/calendarioGlobal" tabindex="-1" aria-disabled="true">Calendario
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
			<div class="hero-unit">
				<br></br> </br> </br>
				<div class="row">
					<div class="col-md-8">

						<div class="card">
							<div class="card-body">
								<h4>Gestor del centro m�dico</h4>
								<p>
									Se encuentra en la p�gina de gesti�n del centro. Para obtener
									informaci�n sobre el uso de las diferentes funcionalidades de
									las que dispone presione el siguiente bot�n
									<button type="button" class="btn btn-primary"
										data-toggle="modal" data-target="#informacion">
										Informaci�n</button>
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
												En esta vista usted cuenta con tres tablas:
												<h5></h5>
												<h5>Usuarios externos</h5>
												En esta tabla usted podr� asignar su centro m�dico,
												convertir en m�dico y/o en gestor de su centro m�dico al
												usuario seleccionado a trav�s de los diferentes botones que
												puede observar en la tabla mencionada.
												<h5></h5>
												<h5>Pacientes del centro</h5>
												En esta tabla usted podr� convertir en m�dico y/o en gestor
												de su centro m�dico al usuario seleccionado, tambi�n podr�
												ver su calendario a trav�s de los diferentes botones que
												puede observar en la tabla mencionada.
												<h5></h5>
												<h5>M�dicos del centro</h5>
												En esta tabla usted podr� gestionar las citas(modificar o
												eliminar) del m�dico de su centro m�dico, a trav�s de los
												diferentes botones que puede observar en la tabla
												mencionada.
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
					</div>

					<div class="col-md-1"></div>
					<div class="col-md-3">
						<div class="card">
							<div class="card-body">
								<form action="getParametersURL"></form>
								<div class="text-center">
									<label id="nombreApellidos"></label>
								</div>

							</div>
						</div>
					</div>
				</div>
				<br></br>
			</div>

			<ul class="nav nav-tabs" id="pestanas">
				<li class="nav-item"><a class="nav-link active"
					data-toggle="tab" href="#menu1">Usuarios Externos</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="tab"
					href="#menu2">Pacientes Del Centro</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="tab"
					href="#menu3">M�dicos del Centro</a></li>
			</ul>

			<div class="tab-content">
				<div id="menu1" class="tab-pane fade">
					<div>
						<br></br>
					</div>
					<h3>Gesti�n de Usuarios Externos</h3>
					<strong class="d-inline-block mb-2 text-primary center">Pacientes
						externos al Centro M�dico</strong>
					<div class="row d-flex justify-content-center">
						<div class="container">
							<input type="text" id="inputUsuarios" onkeyup="buscarUsuarios()"
								placeholder="Introduzca DNI" title="DNI">
							<table id="TablaUsuarios" class="table table-bordered">
								<thead>
									<tr class="table-primary">
										<td align="center" scope="col"><b>DNI</b></td>
										<td align="center" scope="col"><b>Nombre</b></td>
										<td align="center" scope="col"><b>Centro M�dico</b></td>
									</tr>
								</thead>
							</table>
						</div>
					</div>
				</div>
				<div id="menu2" class="tab-pane fade">
					<div>
						<br></br>
					</div>
					<h3>Gesti�n de Pacientes Del Centro M�dico</h3>
					<strong class="d-inline-block mb-2 text-success">Pacientes
						del Centro M�dico</strong>
					<div class="row d-flex justify-content-center">
						<div class="container">
							<input type="text" id="inputPacientes"
								onkeyup="buscarPacientes()" placeholder="Introduzca DNI"
								title="DNI">
							<table id="TablaUsuariosCentro" class="table table-bordered">
								<thead>
									<tr class="table-primary">
										<td align="center" scope="col"><b>DNI</b></td>
										<td align="center" scope="col"><b>Nombre</b></td>
										<td align="center" scope="col"><b>Centro M�dico</b></td>
									</tr>
								</thead>
							</table>
						</div>
					</div>
				</div>
				<div id="menu3" class="tab-pane fade">
					<div>
						<br></br>
					</div>
					<h3>Gesti�n de M�dicos Del Centro</h3>
					<div class="row mb-2">
						<strong class="d-inline-block mb-2 text-primary center">M�dicos
							del Centro</strong>
						<div class="row d-flex justify-content-center">
							<div class="container">
								<input type="text" id="inputMedicos" onkeyup="buscarMedicos()"
									placeholder="Introduzca DNI" title="DNI">
								<table id="TablaMedicosCentro" class="table table-bordered">
									<thead>
										<tr class="table-primary">
											<td align="center" scope="col"><b>DNI</b></td>
											<td align="center" scope="col"><b>Nombre</b></td>
											<td align="center" scope="col"><b>Centro M�dico</b>
											<td align="center" scope="col"><b>Especialidad</b>
											<td align="center" scope="col"><b>Tel�fono</b></td>
										</tr>
									</thead>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
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
		jQuery(document)
				.ready(
						function($) {
							pedirTodosLosUsuarios();
							$('#pestanas').tab('show');
							/*
							 * Control para que no acceda a travis de la url a alguna pagina que no sea el home
							 * Hay que ponerlo en todos los jsp que se hagan proximamente
							 */
							var referrer = document.referrer;
							if (referrer != 'http://localhost:8080/'
									&& referrer != 'https://sgc-e4.herokuapp.com/'
									&& referrer != 'http://sgc-e4.herokuapp.com/'
									&& referrer != 'sgc-e4.herokuapp.com/'
									&& referrer != 'http://localhost:8080/registro'
									&& referrer != 'https://sgc-e4.herokuapp.com/registro'
									&& referrer != 'http://sgc-e4.herokuapp.com/registro'
									&& referrer != 'sgc-e4.herokuapp.com/registro'
									&& referrer != 'http://localhost:8080/citas'
									&& referrer != 'https://sgc-e4.herokuapp.com/citas'
									&& referrer != 'http://sgc-e4.herokuapp.com/citas'
									&& referrer != 'sgc-e4.herokuapp.com/citas'
									&& referrer != 'http://localhost:8080/formularioPaciente'
									&& referrer != 'https://sgc-e4.herokuapp.com/formularioPaciente'
									&& referrer != 'http://sgc-e4.herokuapp.com/formularioPaciente'
									&& referrer != 'sgc-e4.herokuapp.com/formularioPaciente'
									&& referrer != 'http://localhost:8080/citasGestor'
									&& referrer != 'https://sgc-e4.herokuapp.com/citasGestor'
									&& referrer != 'http://sgc-e4.herokuapp.com/citasGestor'
									&& referrer != 'sgc-e4.herokuapp.com/citasGestor'
									&& referrer != 'http://localhost:8080/medicoGestor'
									&& referrer != 'https://sgc-e4.herokuapp.com/medicoGestor'
									&& referrer != 'http://sgc-e4.herokuapp.com/medicoGestor'
									&& referrer != 'sgc-e4.herokuapp.com/medicoGestor'
									&& referrer != 'http://localhost:8080/formularioTrabajador'
									&& referrer != 'https://sgc-e4.herokuapp.com/formularioTrabajador'
									&& referrer != 'http://sgc-e4.herokuapp.com/formularioTrabajador'
									&& referrer != 'sgc-e4.herokuapp.com/formularioTrabajador'
									&& referrer != 'http://localhost:8080/formularioGestor'
									&& referrer != 'https://sgc-e4.herokuapp.com/formularioGestor'
									&& referrer != 'http://sgc-e4.herokuapp.com/formularioGestor'
									&& referrer != 'sgc-e4.herokuapp.com/formularioGestor'
									&& referrer != 'http://localhost:8080/calendarioGlobal'
									&& referrer != 'https://sgc-e4.herokuapp.com/calendarioGlobal'
									&& referrer != 'sgc-e4.herokuapp.com/formularioModificarHorario'
									&& referrer != 'http://localhost:8080/formularioModificarHorario'
									&& referrer != 'https://sgc-e4.herokuapp.com/formularioModificarHorario') {
								var forma = document.forms[0];
								forma.action = "/error";
								forma.submit();
							}
							//     		getParametersURL();

							ponerNombreApellidos();

						});

		function pedirTodosLosUsuarios() {
			var data = {
				tipo : "getAllUser"
			};
			var url = "/gestor";
			var type = "POST";
			var success;
			var async = false;
			var xhrFields;
			var headers = {
				'Content-Type' : 'application/json'
			};

			data = JSON.stringify(data);
			$.ajax({
				type : type,
				url : url,
				data : data,
				async : async,
				headers : headers,
				xhrFields : {
					withCredentials : true
				},
				success : UsuariosOK,
				error : UsuariosError
			});
		}
		function buscarMedicos() {
			var input, filter, table, tr, td, i, txtValue;
			input = document.getElementById("inputMedicos");
			filter = input.value.toUpperCase();
			table = document.getElementById("TablaMedicosCentro");
			tr = table.getElementsByTagName("tr");
			for (i = 0; i < tr.length; i++) {
				td = tr[i].getElementsByTagName("td")[0];
				if (td) {
					txtValue = td.textContent || td.innerText;
					if (txtValue.toUpperCase().indexOf(filter) > -1) {
						tr[i].style.display = "";
					} else {
						tr[i].style.display = "none";
					}
				}
			}
		}

		function buscarPacientes() {
			var input, filter, table, tr, td, i, txtValue;
			input = document.getElementById("inputPacientes");
			filter = input.value.toUpperCase();
			table = document.getElementById("TablaUsuariosCentro");
			tr = table.getElementsByTagName("tr");
			for (i = 0; i < tr.length; i++) {
				td = tr[i].getElementsByTagName("td")[0];
				if (td) {
					txtValue = td.textContent || td.innerText;
					if (txtValue.toUpperCase().indexOf(filter) > -1) {
						tr[i].style.display = "";
					} else {
						tr[i].style.display = "none";
					}
				}
			}
		}

		function buscarUsuarios() {
			var input, filter, table, tr, td, i, txtValue;
			input = document.getElementById("inputUsuarios");
			filter = input.value.toUpperCase();
			table = document.getElementById("TablaUsuarios");
			tr = table.getElementsByTagName("tr");
			for (i = 0; i < tr.length; i++) {
				td = tr[i].getElementsByTagName("td")[0];
				if (td) {
					txtValue = td.textContent || td.innerText;
					if (txtValue.toUpperCase().indexOf(filter) > -1) {
						tr[i].style.display = "";
					} else {
						tr[i].style.display = "none";
					}
				}
			}
		}

		function UsuariosOK(respuesta) {
			var jsoUsuarios = JSON.parse(respuesta);
			console.log(jsoUsuarios);
			console.log(jsoUsuarios.Pacientes.length);
			var jsoUser = JSON.parse(sessionStorage.usuario);
			var centroMedicoGestor = jsoUser.resultado.gestor.centro;

			for (var i = 0; i < jsoUsuarios.Pacientes.length; i++) {
				if (jsoUsuarios.Pacientes[i].centroMedico != centroMedicoGestor) {
					$("#TablaUsuarios")
							.append(
									'<tr><td align="center" style="dislay: none;">'
											+ jsoUsuarios.Pacientes[i].DNI
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ jsoUsuarios.Pacientes[i].nombre
											+ " "
											+ jsoUsuarios.Pacientes[i].apellidos
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ jsoUsuarios.Pacientes[i].centroMedico
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ '<button id=\'botonModificarCentro'
											+ i
											+ '\' class=\'btn btn-primary \' onClick="funcionModificarCentro(this)">'
											+ 'Asignar Centro'
											+ '</button> '
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ '<button id=\'botonConvertirTrabajador'
											+ i
											+ '\' class=\'btn btn-primary \' onClick="funcionConvertirMedico(this)">'
											+ 'Convertir en M�dico'
											+ '</button> '
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ '<button id=\'botonConvertirGestor'
											+ i
											+ '\' class=\'btn btn-primary \' onClick="funcionConvertirGestor(this)">'
											+ 'Convertir en Gestor'
											+ '</button> ' + '</td></tr>');
				}

				if (jsoUsuarios.Pacientes[i].centroMedico == centroMedicoGestor) {
					$("#TablaUsuariosCentro")
							.append(
									'<tr><td align="center" style="dislay: none;">'
											+ jsoUsuarios.Pacientes[i].DNI
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ jsoUsuarios.Pacientes[i].nombre
											+ " "
											+ jsoUsuarios.Pacientes[i].apellidos
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ jsoUsuarios.Pacientes[i].centroMedico
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ '<button id=\'botonConvertirTrabajadorCM'
											+ i
											+ '\' class=\'btn btn-primary \' onClick="funcionConvertirMedico(this)">'
											+ 'Convertir en M�dico'
											+ '</button> '
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ '<button id=\'botonCalendario'
											+ i
											+ '\' class=\'btn btn-primary \' onClick="funcionCalendario(this)">'
											+ 'Calendario'
											+ '</button> '
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ '<button id=\'botonConvertirGestor'
											+ i
											+ '\' class=\'btn btn-primary \' onClick="funcionConvertirGestor(this)">'
											+ 'Convertir en Gestor'
											+ '</button> '
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ '<button id=\'botonModificarCentro'
											+ i
											+ '\' class=\'btn btn-primary \' onClick="funcionCambiarMedicos(this)">'
											+ 'Cambiar Centro' + '</button> '
											+ '</td></tr>');
				}
			}

			for (var j = 0; j < jsoUsuarios.Medicos.length; j++) {
				console.log(jsoUsuarios.Medicos.length);
				console.log(jsoUsuarios.Medicos[j].DNI);
				if (jsoUsuarios.Medicos[j].centroMedico == centroMedicoGestor) {
					$("#TablaMedicosCentro")
							.append(
									'<tr><td align="center" style="dislay: none;">'
											+ jsoUsuarios.Medicos[j].DNI
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ jsoUsuarios.Medicos[j].nombre
											+ " "
											+ jsoUsuarios.Medicos[j].apellidos
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ jsoUsuarios.Medicos[j].centroMedico
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ jsoUsuarios.Medicos[j].especialidad
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ jsoUsuarios.Medicos[j].telefono
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ '<button id=\'botonGestionarCitas'
											+ j
											+ '\' class=\'btn btn-primary \' onClick="funcionGestionarCitas(this)">'
											+ 'Gestionar Citas'
											+ '</button> '
											+ '</td>'
											+ '<td align="center" style="dislay: none;">'
											+ '<button id=\'botonModificarHorarios'
											+ j
											+ '\' class=\'btn btn-primary \' onClick="funcionModificarHorarios(this)">'
											+ 'Modificar Horario'
											+ '</button> ' + '</td></tr>');

				}
			}

		}

		function funcionGestionarCitas(boton) {
			var dni = boton.parentNode.parentNode.children[0].innerHTML;
			var nombreAp = boton.parentNode.parentNode.children[1].innerHTML;
			console.log(dni);
			console.log(nombreAp);
			var jsoMedico = {
				"Medico" : [ {
					"DNI" : dni,
					"nombre" : nombreAp
				} ]
			};
			sessionStorage.MedicoEdit = JSON.stringify(jsoMedico);
			location.href = "/medicoGestor";
		}

		function funcionModificarHorarios(boton) {
			var dni = boton.parentNode.parentNode.children[0].innerHTML;
			var especialidad = boton.parentNode.parentNode.children[3].innerHTML;
			var jsoMedico = {
				"Medico" : [ {
					"DNI" : dni,
					"especialidad" : especialidad,
				} ]
			};
			sessionStorage.MedicoHorario = JSON.stringify(jsoMedico);
			location.href = "/formularioModificarHorario";
		}

		function funcionCalendario(boton) {
			var dni = boton.parentNode.parentNode.children[0].innerHTML;
			var nombreAp = boton.parentNode.parentNode.children[1].innerHTML;
			var jsoPaciente = {
				"Paciente" : [ {
					"DNI" : dni,
					"nombre" : nombreAp
				} ]
			};
			sessionStorage.PacienteEdit = JSON.stringify(jsoPaciente);
			getGrupoMedico(dni);
			location.href = "/citasGestor";
		}

		function getGrupoMedico(dni) {
			var data = {
				dni : dni,
				tipo : "getGrupoMedico"
			};
			var url = "/gestor";
			var type = "POST";
			var success;
			var async = false;
			var xhrFields;
			var headers = {
				'Content-Type' : 'application/json'
			};

			data = JSON.stringify(data);
			$.ajax({
				type : type,
				url : url,
				data : data,
				async : async,
				headers : headers,
				xhrFields : {
					withCredentials : true
				},
				success : GrupoMedicoOK,
				error : GrupoMedicoError
			});
		}

		function GrupoMedicoOK(resultado) {
			console.log(resultado);
			var jsoRes = JSON.parse(resultado);
			console.log(jsoRes);
			sessionStorage.grupoMedPaciente = JSON.stringify(jsoRes);
		}

		function GrupoMedicoError(e) {
			console.log(e);
		}

		function funcionConvertirMedico(boton) {
			var dni = boton.parentNode.parentNode.children[0].innerHTML;
			console.log(dni);
			var data = {
				"dni" : dni
			};
			var jsoDniMed = {
				"DNIMedico" : [ {
					"DNI" : dni
				} ]
			};
			sessionStorage.nuevoMedico = JSON.stringify(jsoDniMed);
			location.href = "/formularioTrabajador";
		}

		function funcionConvertirGestor(boton) {
			var dni = boton.parentNode.parentNode.children[0].innerHTML;
			console.log(dni);
			var jsoDniGes = {
				"DNIGestor" : [ {
					"DNI" : dni
				} ]
			};
			sessionStorage.nuevoGestor = JSON.stringify(jsoDniGes);
			location.href = "/formularioGestor";
		}

		function UsuariosError(e) {
			console.log(e);
		}

		function funcionCambiarMedicos(boton) {
			var dni = boton.parentNode.parentNode.children[0].innerHTML;
			sessionStorage.dniModificarCentro = boton.parentNode.parentNode.children[0].textContent;
			console.log(dni);
			var data = {
				DNI : dni,
				tipo : "eliminar"
			};
			console.log(data);
			enviarEliminarGrupoMedico(data);
			window.location.href = "/formularioPaciente";
		}

		function enviarEliminarGrupoMedico(data) {
			var url = "/grupomedico";
			var type = "POST";
			var success;
			var error;
			var xhrFields;
			var headers = {
				'Content-Type' : 'application/json'
			};

			data = JSON.stringify(data);
			$.ajax({
				type : type,
				url : url,
				data : data,
				headers : headers,
				xhrFields : {
					withCredentials : true
				}

			});
		}

		function funcionModificarCentro(boton) {
			sessionStorage.dniModificarCentro = boton.parentNode.parentNode.children[0].textContent;
			window.location.href = "/formularioPaciente";
		}

		function ponerNombreApellidos() {
			var jsoUser = JSON.parse(sessionStorage.usuario);
			console.log(jsoUser.resultado.usuario.nombre);
			$('#nombreApellidos').html(
					jsoUser.resultado.usuario.nombre + " "
							+ jsoUser.resultado.usuario.apellidos);
		}
	</script>
</body>
</html>