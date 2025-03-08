package service;

import model.Persona;

public class PersonaService {

    // Método para mostrar nombre, apellido, edad y género de las personas
    public static void mostrarNombreGenero(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellido() +
                    ", Edad: " + persona.getEdad() + ", Género: " + persona.getGenero());
        }
    }

    // Método para calcular el promedio de edades y redondearlo a un número entero
    public static double calcularPromedioEdades(Persona[] personas) {
        int sumaEdades = 0;
        for (Persona persona : personas) {
            sumaEdades += persona.getEdad();
        }
        // Calcular el promedio y redondearlo a un número entero
        double promedio = sumaEdades / (double) personas.length;
        return Math.round(promedio); // Redondeamos al número entero más cercano
    }

    // Método para contar la cantidad de personas de un género específico
    public static int contarGenero(Persona[] personas, String generoBuscado) {
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase(generoBuscado)) {
                contador++;
            }
        }
        return contador;
    }
}
