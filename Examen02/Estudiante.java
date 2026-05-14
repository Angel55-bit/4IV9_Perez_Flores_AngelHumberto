public class Estudiante extends Persona {
    private int id;
    private double promedio;

    public Estudiante(){

    }

    public Estudiante(String nombre, int edad, int id, double promedio){
        super(nombre, edad);
        this.id = id;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double getPromedio() {
        return promedio;
    }

    public void mostrarEstudiante() {
        System.out.println("Id: " + id + "Nombre: " + getNombre() + "Edad: " + getEdad() + "Promedio: " + promedio);
    }
}
