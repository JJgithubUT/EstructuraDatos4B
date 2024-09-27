public class App {
    // El método factorial se define aquí, fuera del método main.
    private int factorial(int num) {
        int fact = 1;
        if(num!=0) {
            for(int i = num; i>0; i--) {
                fact *= i;
            }
        }
        return fact;
    }

    private int factorialRcs(int num) {
        if(num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }

    public static void main(String[] args) throws Exception {
        App app = new App(); // Crear una instancia de App para llamar al método factorial.
        int resultado = app.factorial(6); // Llamar a factorial.
        int resultadoRcs = app.factorialRcs(6);
        System.out.println("五のファクトリアルは: " + resultado);
        System.out.println("五のファトリアルはレクルシビダルで" + resultadoRcs);

    }
}
