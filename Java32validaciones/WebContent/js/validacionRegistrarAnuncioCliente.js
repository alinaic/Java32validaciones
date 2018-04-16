function validarFormularioRegistroAnuncioCliente() {
	alert("se ejecuta la funcion");
	var enviarForm = true;

	// obtener lo escrito por el usuario
	var campoTitulo = document.getElementsByName("campoTitulo")[0];
	var titulo = campoTitulo.value;
	alert("voy a validar: " + titulo);

	var campoPrecio = document.getElementsByName("campoPrecio")[0];
	var precio = campoPrecio.value;
	alert("voy a validar: " + precio);

	var campoDescripcion = document.getElementsByName("campoDescripcion")[0];
	var descripcion = campoDescripcion.value;
	alert("voy a validar: " + descripcion);

	// comprobar que sea correcto
	// las expresiones regulares son vitales para realizar validaciones
	// ^ desde el principio
	// $ hasta el fin
	// [a-z] letras de la a a la z
	// {3,10} de 3 a 10 elementos
	// /s espacio en blanco
	// i = mayusculas minusculas
	// אטלעשסü tildes

	var expresionCampoNombre = /^[a-zאטלעשסü/s]{3,10}$/i;
	if (expresionCampoNombre.test(titulo)) {
		alert("titulo ok");
	} else {
		alert("titulo incorrecto");
		enviarForm = false;
	}

	var expresionPrecio = /^[0-9]{1,8}[.,]?[0-9]{0,2}$/;
	if (expresionPrecio.test(precio)) {
		alert("precio ok");
	} else {
		alert("precio incorrecto");
		enviarForm = false;
	}

	var expresionDescripcion = /^[a-zאטלעשסü\s]{10,150}$/i;
	if (expresionDescripcion.test(descripcion)) {
		alert("descripcion ok");
	} else {
		alert("descripcion incorrecto");
		enviarForm = false;
	}
	// devolver true si todo esta bien
	// devolver false si todo esta mal
	return enviarForm;

}// end funciones
