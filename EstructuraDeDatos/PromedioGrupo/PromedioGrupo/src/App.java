import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {

    /* Programa que calcula el promedio de un grupo
        * El tamaño del grupo es N
        * Las calificaciones se leen y se almacenan en un arreglo de tamaño N
    */

    public static Estudiante[] estudiantes; // arreglo de un Tipo de Dato Abstracto(TDA)

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada; // El tamaño del arreglo

    public static void leerEstudiantes() throws IOException {
        for (int i = 0; i < estudiantes.length; i++) {
            String matricula, nombre;
            
            System.out.println("--------------");
            System.out.println("Información del estudiante [" + (i+0) + "]");
            System.out.println("Matricula: ");
            entrada = br.readLine();
            matricula = entrada;
            System.out.println("Nombre: ");
            entrada = br.readLine();
            nombre = entrada;
            Estudiante e = new Estudiante(matricula, nombre);
            System.out.println("Escribe calificacion de Estructuras: ");
            entrada = br.readLine();
            e.setEstructuras(Double.parseDouble(entrada));
            System.out.println("Escribe calificacion de Evaluacion: ");
            entrada = br.readLine();
            e.setEvaluacion(Double.parseDouble(entrada));
            System.out.println("Escribe calificacion de Inglés: ");
            entrada = br.readLine();
            e.setIngles(Double.parseDouble(entrada));
            e.setPromedio_estudiante();
            estudiantes[i] = e;   
        }
    }

    public static void imprimirEstudiantes() {
        for ( Estudiante e : estudiantes) {
            System.out.println(e.toString());
        }
    }

    public static double calcularPromedioGrupo() {
        double suma = 0;
        for ( Estudiante e : estudiantes ) {
            suma += e.getPromedio_estudiante();
        }
        return suma / estudiantes.length;
    }

    public static void main(String[] args) throws IOException {

        int N;
        
        // Para lectura de datos
        
        double[] calificaciones; // arreglo de calificaciones // arreglo de un Tipo de Dato Primitivo
        double suma = 0; // para sumar calificaciones
        double promedio; // promedio del grupo

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("Escribe el tamaño del grupo: ");
        entrada = br.readLine();
        N = Integer.parseInt(entrada);

        // Construyendo arreglo de estudiantes
        estudiantes = new Estudiante[N];

        // lectura de la información de los estudiantes 
        leerEstudiantes();

        // 
        imprimirEstudiantes();

        // calcular promedio del grupo
        promedio = calcularPromedioGrupo();

        /*
        // Imprimir el contenido del arreglo estudiantes
        // System.out.println(estudiantes);

        // calificaciones = new double[N];
        
        // leer calificaciones
        // for ( int i = 0; i < calificaciones.length; i++ ) {
        //     System.out.println("Escriba la calificación del alumno " + (i+1) + ": ");
        //     entrada = br.readLine();
        //     calificaciones[i] = Double.parseDouble(entrada);
        //     suma += calificaciones[i];
        // }

        // promedio = suma / N;

        // System.out.println("Las calificaciones del grupo son: ");

        // for (int i = 0; i < calificaciones.length; i++) {
        //     System.out.println(calificaciones[i]);
        // }
        */

        System.out.println("\nEl promedio del grupo es: " + promedio + "\n");

    }
}
