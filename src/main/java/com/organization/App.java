package com.organization;

import java.time.LocalDate; // Importa la clase LocalDate para manejar fechas.
import java.time.LocalDateTime; // Importa LocalDateTime para manejar fecha y hora combinadas.
import java.time.LocalTime; // Importa LocalTime para manejar solo la hora.
import java.time.format.DateTimeFormatter; // Importa DateTimeFormatter para aplicar formatos a las fechas y horas.
import java.time.ZonedDateTime; // Importa ZonedDateTime para manejar fechas con zonas horarias.
import java.time.ZoneId; // Importa ZoneId para especificar zonas horarias.

/**
 * Clase principal de la aplicación.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Clases fechas y tiempos!");
        // Ejemplo clases de fechas y tiempos en Java 🎉

        // Crear un objeto de tipo LocalDate que representa una fecha 📅
        LocalDate fechaHoy = LocalDate.now(); // Obtiene la fecha actual (solo año, mes, día).
        
        // Crear un objeto de tipo LocalTime que representa una hora 🕐
        LocalTime horaActual = LocalTime.now(); // Obtiene la hora actual (solo hora, minuto, segundo).

        // Crear un objeto de tipo LocalDateTime que representa fecha y hora combinadas 📅🕐
        LocalDateTime fechaHoraActual = LocalDateTime.now(); // Combina la fecha y hora actuales.

        // Ejemplo de aplicación de la vida real: Registrar la fecha y hora de una transacción bancaria 💰
        LocalDateTime fechaTransaccion = LocalDateTime.now(); // Fecha y hora exacta de una transacción.
        // Uso de fechaTransaccion para mostrar la fecha y hora de la transacción en la consola.
        System.out.println("Fecha y hora de la transacción: " + fechaTransaccion + "\n");

        // Formatear la fecha usando DateTimeFormatter 📅
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Define un formato personalizado.
        String fechaFormateada = fechaHoy.format(formatoFecha); // Aplica el formato personalizado a la fecha actual.

        // Formatear la hora usando DateTimeFormatter 🕐
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss"); // Define un formato para la hora.
        String horaFormateada = horaActual.format(formatoHora); // Aplica el formato personalizado a la hora actual.

        // Ejemplo de manejo de zonas horarias 🌍
        ZonedDateTime fechaConZonaHoraria = ZonedDateTime.now(ZoneId.of("America/Bogota")); // Fecha y hora actual con zona horaria de Bogotá.

        // Mostrar resultados en la consola 📜
        System.out.println("Fecha actual: " + fechaHoy); // Muestra la fecha actual.
        System.out.println("Hora actual: " + horaActual); // Muestra la hora actual.
        System.out.println("Fecha y hora actuales: " + fechaHoraActual); // Muestra la fecha y hora combinadas.
        System.out.println("Fecha formateada: " + fechaFormateada); // Muestra la fecha formateada en el formato dd/MM/yyyy.
        System.out.println("Hora formateada: " + horaFormateada); // Muestra la hora formateada en el formato HH:mm:ss.
        System.out.println("Fecha y hora en Bogotá: " + fechaConZonaHoraria); // Muestra la fecha y hora con zona horaria de Bogotá.

        // Ejemplo de conversión de una cadena a LocalDate (parseo) ✍️
        String fechaEnTexto = "25/12/2024"; // Una fecha en formato de texto.
        LocalDate fechaParseada = LocalDate.parse(fechaEnTexto, formatoFecha); // Convierte la cadena a un objeto LocalDate usando el formato definido.
        System.out.println("Fecha parseada: " + fechaParseada); // Muestra la fecha convertida desde la cadena.

        // Aplicación en la vida real: Crear una cuenta bancaria y asignar fecha de apertura 🎯
        // Supongamos que la cuenta se abrió el 1 de enero de 2023
        LocalDate fechaAperturaCuenta = LocalDate.of(2023, 1, 1); // Fecha de apertura de la cuenta.
        System.out.println("Fecha de apertura de la cuenta: " + fechaAperturaCuenta); // Muestra la fecha de apertura de la cuenta.

        // Supongamos que el cliente nació el 15 de abril de 1990
        LocalDate fechaNacimientoCliente = LocalDate.of(1990, 4, 15); // Fecha de nacimiento del cliente.
        System.out.println("Fecha de nacimiento del cliente: " + fechaNacimientoCliente); // Muestra la fecha de nacimiento del cliente.

        // Mostrar la diferencia entre la fecha de apertura y la fecha de nacimiento del cliente 📅
        System.out.println("Años de diferencia entre apertura de cuenta y nacimiento: " +
                (fechaAperturaCuenta.getYear() - fechaNacimientoCliente.getYear())); // Muestra los años de diferencia.
    }
}
