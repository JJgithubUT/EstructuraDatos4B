public class App {
    public static void main(String[] args) throws Exception {

        int tamanio_arreglo1 = 2;

        // Inicializar un nuevo arreglo
        int[] array1 = new int[tamanio_arreglo1];

        // Llenar el arreglo
        for ( int i = 0; i < tamanio_arreglo1; i++) {
            array1[i] = i + 1;
        }

        // Imprimir el contenido del arreglo
        for (int dato : array1) {
            System.out.println("Contenido del arreglo: " + dato);
        }

        // Declarando un arreglo (sin construirlo)
        int[] array2;
        int pesos = 10;
        array2 = new int[pesos]; // construcción o inicialización
        array2[0] = 250;
        System.out.println("array2[0] = " + array2[0]);
        
        // nombre es un array
        String nombre;
        char letra;
        nombre = "Panfil Perez";
        letra = nombre.charAt(6);
        System.out.println("La letra es: " + letra);

    }
}
