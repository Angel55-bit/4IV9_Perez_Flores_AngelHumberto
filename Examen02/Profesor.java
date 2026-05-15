public class Profesor {
    private String numProfesor;
    private String materia;

    public Profesor() {

    }

    public Profesor(String nombre, int edad, String numProfesor, String materia) {
        super(nombre, edad);
        this.numProfesor = numProfesor;
        this.materia = materia;
    }

    public String getnumProfesor() {
        return numProfesor;
    }

    public void setnumProfesor(String numProfesor) {
        this.numProfesor;
    }

    public String getmateria() {
        return materia;
    }

    public void setmateria(String materia) {
        this.materia = materia;
    }

    public void mostrarProfesor() {
        System.out.println("Numero de Profesor: " + numProfesor + "Nombre: " + getNombre() + "Edad: " + getEdad() + "Materia: " + materia);
        
    }
}
