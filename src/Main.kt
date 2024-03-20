fun main () {
    var opcion: Int
    val controlador = Controlador()
    var mostrarMenu = true
    do {
        if (mostrarMenu) {
            println("¡Bienvenido al sistema de Mudanzas!.")
            println("Seleccione una Opcion.")
            println("1. Registrar solicitud de mudanza.")
            println("2. Registrar repartidor.")
            println("3. Registrar Cliente")
            println("4. Mostrar Solicitudes.")
            println("5. Mostrar Repartidores")
            println("6. Mostrar Clientes Asociados")
            println("7. Salir del Sistema.")

            println("Selecciona una opcion")
        }
        mostrarMenu = false
        opcion = readln().toInt()
        when (opcion) {
            1 -> {
                println("Ha seleccionado Registrar una Solicitud.")
                if (controlador.listaRepartidores.isEmpty()) {
                    println("¡No hay Repartidores en el Sistema, registre y asocie uno a una Mudanza para realizar la operación!.")
                    controlador.registrarRepartidor()
                }
                println("Registrando Solicitud.")
                controlador.registrarSolicitud()
                mostrarMenu = true
            }
            2 -> {
                println("Ha seleccionado registrar un repartidor.")
                controlador.registrarRepartidor()
                mostrarMenu = true
            }
            3-> {
                println("Ha Seleccionado registrar un Cliente.")
                controlador.registrarCliente()
                mostrarMenu = true
            }
            4->{
                println("Mostrando Solicitudes Activas:")
                controlador.mostrarSolicitudes()
                mostrarMenu = true
            }
            5->{
                println("Mostrando Repartidores:")
                controlador.mostrarRepartidores()
                mostrarMenu = true
            }
            6->{
                println("Mostrando Clientes Asociados:")
                controlador.mostrarClientes()
                mostrarMenu = true
            }
            else -> println("¡Opción no válida!.")
        }
    } while (opcion != 7)
}