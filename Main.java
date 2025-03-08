import model.Persona;
import service.PersonaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo de personas
        Persona[] personas = new Persona[10];

        // Nombres y apellidos inventados para las personas (5 masculinos y 5 femeninos)
        String[] nombresMasculinos = {"Juan", "Carlos", "Pedro", "Luis", "Andrés"};
        String[] nombresFemeninos = {"Ana", "Lucía", "Carla", "María", "Elena"};
        String[] apellidosMasculinos = {"Pérez", "García", "Martínez", "Lopez", "Fernández"};
        String[] apellidosFemeninos = {"Rodríguez", "Hernández", "Sánchez", "Jiménez", "Mendoza"};
        String[] generos = {"Masculino", "Masculino", "Masculino", "Masculino", "Masculino",
                "Femenino", "Femenino", "Femenino", "Femenino", "Femenino"};

        // Edades ajustadas para que el promedio sea exactamente 25
        int[] edades = {24, 25, 25, 26, 25, 25, 25, 24, 25, 25};

        // Crear y asignar las personas con los datos inventados
        for (int i = 0; i < 5; i++) {
            personas[i] = new Persona(nombresMasculinos[i], apellidosMasculinos[i], generos[i], edades[i]);
        }

        for (int i = 5; i < 10; i++) {
            personas[i] = new Persona(nombresFemeninos[i - 5], apellidosFemeninos[i - 5], generos[i], edades[i]);
        }

        // Mostrar el nombre, apellido y género de las personas
        PersonaService.mostrarNombreGenero(personas);

        // Mostrar el promedio de edades
        System.out.println("Promedio de edades: " + PersonaService.calcularPromedioEdades(personas));

        // Mostrar la cantidad de personas masculinas y femeninas
        System.out.println("Cantidad de personas masculinas: " + PersonaService.contarGenero(personas, "Masculino"));
        System.out.println("Cantidad de personas femeninas: " + PersonaService.contarGenero(personas, "Femenino"));
    }
}
