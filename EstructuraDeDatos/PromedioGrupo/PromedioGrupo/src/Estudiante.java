public class Estudiante {
    private String matricula;
    private String nombre;
    private double estructuras;
    private double evaluación;
    private double ingles;
    private double promedio_estudiante;

    // constructor
    public Estudiante(String m, String n) {
        // El objetivo es construir e inicializar el objeto
        this.matricula = m;
        this.nombre = n;
    }

    // Getters y setters de las variables
    // get metodo constructor
    // y set un metodo constructor

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstructuras() {
        return estructuras;
    }

    public void setEstructuras(double estructuras) {
        this.estructuras = estructuras;
    }

    public double getEvaluación() {
        return evaluación;
    }

    public void setEvaluación(double evaluación) {
        this.evaluación = evaluación;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public double getPromedio_estudiante() {
        return promedio_estudiante;
    }

    public void setPromedio_estudiante(double promedio_estudiante) {
        this.promedio_estudiante = promedio_estudiante;
    }

    @Override
    public String toString() {
        return "Estudiante [matricula=" + matricula + ", nombre=" + nombre + ", promedio_estudiante="
                + promedio_estudiante + "]";
    }

    

}
