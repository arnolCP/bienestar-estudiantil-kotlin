fun main() {
    val nombres = mutableListOf<String>()
    val edades = mutableListOf<Int>()
    val nivelesEstres = mutableListOf<String>()

    var opcion: Int = 0

    while (opcion != 3) {
        println("\n=== MENÚ: BIENESTAR ESTUDIANTIL ===")
        println("1. Registrar estudiante (nombre, edad y estrés)")
        println("2. Ver estudiantes registrados")
        println("3. Ver Resumen Final y Salir")
        print("Elige una opción (1-3): ")

        opcion = readln().toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                println("\n--- 1. REGISTRAR ESTUDIANTE ---")
                print("Ingresa el nombre: ")
                val nombre = readln()

                print("Ingresa la edad: ")
                val edad = readln().toIntOrNull() ?: 0

                print("¿Cómo te sientes hoy? (Bajo / Medio / Alto): ")
                val estres = readln()

                nombres.add(nombre)
                edades.add(edad)
                nivelesEstres.add(estres)

                println("¡Estudiante registrado! Volviendo al menú principal...")
            }
            2 -> {
                println("\n--- 2. ESTUDIANTES REGISTRADOS ---")
                if (nombres.isEmpty()) {
                    println("Aún no hay estudiantes registrados.")
                } else {
                    for (i in nombres.indices) {
                        println("${i + 1}. ${nombres[i]} - ${edades[i]} años - Estrés: ${nivelesEstres[i]}")
                    }
                }
            }
            3 -> {
                println("\nSaliendo del menú y generando reporte...")
            }
            else -> {
                println("\nOpción incorrecta. Por favor ingresa un número del 1 al 3.")
            }
        }
    }

    println("\n==========================================")
    println("   RESUMEN FINAL DEL SISTEMA")
    println("==========================================")
    if (nombres.isEmpty()) {
        println("No se registró ningún estudiante.")
    } else {
        for (i in nombres.indices) {
            println("Estudiante ${i + 1}: ${nombres[i]}")
            println("Edad: ${edades[i]} años")
            println("Nivel de estrés reportado: ${nivelesEstres[i]}")
            println("------------------------------------------")
        }
        println("Total de estudiantes registrados: ${nombres.size}")
    }
    println("==========================================")
}