class Controlador {
    private val listaClientes = mutableListOf<Cliente>()
    val listaRepartidores = mutableListOf<Repartidor>()
    private val listaSolicitudes = mutableListOf<Solicitudes>()
    fun registrarSolicitud() {
        val valorPorMueble = 150
        println("Ingrese el Nombre del Cliente:")
        val clienteSolicitud = readln()
        println("Ingrese un ID para la Mudanza:")
        val idSolicitud = readln().toInt()
        println("Asigne los Repartidores a la Mudanza:")
        val repartidor = readln()
        println("Ingrese la Dirección de Destino:")
        val direccionDestino = readln()
        println("Ingrese la Fecha de Mudanza(00/00/00/):")
        val fechaDeMudanza = readln()
        println("Ingrese el Total de Muebles:")
        val totalMuebles = readln().toInt()
        val costeMudanza = totalMuebles * valorPorMueble.toDouble()
        println("El total del Coste de la Mudanza es de: $costeMudanza MXN")
        val nuevaSolicitud = Solicitudes( clienteSolicitud, idSolicitud, repartidor, direccionDestino, fechaDeMudanza, totalMuebles, costeMudanza, valorPorMueble
        )
        listaSolicitudes.add(nuevaSolicitud)
        println("¡Solicitud Registrada Exitosamente.!")
    }
    fun registrarCliente() {
        println("Ingresar el Nombre(s) del Cliente: ")
        val nombreCliente = readln()
        println("Ingrese el Primer Apellido: ")
        val primerApellido = readln()
        println("Ingrese el Segundo Apellido: ")
        val segundoApellido = readln()
        println("Ingrese Su Direccion: ")
        val direccion = readln()
        println("Ingrese su Número Telefonico: ")
        val telefono = readln()
        val nuevoCliente = Cliente(
            nombreCliente, primerApellido, segundoApellido, direccion, telefono
        )
        listaClientes.add(nuevoCliente)
        println("¡Cliente Registrado Exitosamente!.")
    }
    fun registrarRepartidor() {
        println("Ingrese el Nombre(s) del Repartidor: ")
        val nombre = readln()
        println("Ingrese el Primer Apellido: ")
        val primerApellido = readln()
        println("Ingrese el Segundo Apellido: ")
        val segundoApellido = readln()
        println("Ingrese su Número Telefonico: ")
        val telefono = readln()
        println("Ingrese su RFC: ")
        val rfc = readln()
        println("Ingrese su Cargo en la Empresa: ")
        val cargo = readln()
        println("Ingrese su ID: ")
        val id = readln().toDouble()
        val nuevoRepartidor = Repartidor(nombre, primerApellido, segundoApellido, telefono, rfc, cargo, id)
        listaRepartidores.add(nuevoRepartidor)
        println("¡Repartidor Registrado Exitosamente!.")
    }
    fun mostrarSolicitudes() {
        if (listaSolicitudes.isEmpty()) {
            println("¡No hay Solicitudes Realizadas!.")
        } else {
            println("Lista de Solicitudes Activas:")
            listaSolicitudes.forEach { solicitud ->
                println("Nombre del Cliente de la Solicitud:      ${solicitud.clienteSolicitud}")
                println("ID de la Solicitud:                      ${solicitud.idSolicitud}")
                println("Nombre del Repartidor:                   ${solicitud.repartidor}")
                println("Nombre del Destino:                      ${solicitud.direccionDestino}")
                println("Fecha en que se Realizara la Mudanza:    ${solicitud.fechaDeMudanza}")
                println("Total de Objetos a Mover en el Inmueble: ${solicitud.totalMuebles}")
                println("Coste total de la Mudanza:               ${solicitud.costeMudanza}")
            }
        }
    }
    fun mostrarRepartidores() {
        if (listaRepartidores.isEmpty()) {
            println("¡No hay repartidores en el Sistema!.")
        } else {
            println("Lista de Repartidores:")
            listaRepartidores.forEach { repartidor ->
                println("Nombre del Repartidor:         ${repartidor.nombre}")
                println("Primer Nombre:                 ${repartidor.primerNombre}")
                println("Segundo Nombre:                ${repartidor.segundoNombre}")
                println("Telefono del Repartidor:       ${repartidor.telefono}")
                println("RFC del Repartidor:            ${repartidor.rfc}")
                println("Cargo del Repartidor:          ${repartidor.cargo}")
                println("ID de Repartidor:              ${repartidor.id}")
            }
        }
    }
    fun mostrarClientes() {
        if (listaClientes.isEmpty()) {
            println("¡No hay Clientes en el Sistema!.")
        } else {
            println("Lista de Clientes Asociados:")
            listaClientes.forEach { cliente ->
                println("Nombre del Cliente:                     ${cliente.nombreCliente}")
                println("Primer Apellido del Cliente:            ${cliente.primerApellido}")
                println("Segundo Apellido del Cliente:           ${cliente.segundoApellido}")
                println("Direccion del Cliente:                  ${cliente.direccion}")
                println("Telefono del Cliente:                   ${cliente.telefono}")
            }
        }
    }
}