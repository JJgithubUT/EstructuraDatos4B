import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {

    /* Programa que calcula el promedio de un grupo
        * El tamaño del grupo es N
        * Las calificaciones se leen y se almacenan en un arreglo de tamaño N
    */

    public static void main(String[] args) throws IOException {

        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada; // El tamaño del arreglo
        // Para lectura de datos
        double[] calificaciones; // arreglo de calificaciones
        double suma = 0; // para sumar calificaciones
        double promedio; // promedio del grupo

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("Escribe el tamaño del grupo: ");
        entrada = br.readLine();
        N = Integer.parseInt(entrada);

        calificaciones = new double[N];

        for ( int i = 0; i < calificaciones.length; i++ ) {
            System.out.println("Escriba la calificación del alumno " + (i+1) + ": ");
            entrada = br.readLine();
            calificaciones[i] = Double.parseDouble(entrada);
            suma += calificaciones[i];
        }

        promedio = suma / N;

        System.out.println("Las calificaciones del grupo son: ");

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(calificaciones[i]);
        }

        System.out.println("\nEl promedio del grupo es: " + promedio + "\n");

    }
}
