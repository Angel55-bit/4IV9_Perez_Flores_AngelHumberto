public class Estudiante {
    private int id; 
    private double promedio;

    public Estudiante(){
    }

    //realizo el contructor
    public Estudiante(int id, String nombre, int edad, double promedio){
        super(nombre, edad);
        this.id = id;
        this.promedio = promedio;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
     
    public double getPromedio(){
        return promedio;
    }

    public void setPromedio(double promedio){
        this.promedio = promedio;
    }

    public void mostrarEstudiante(){
        System.out.println("Id: " + getId() + "\n" + "Nombre: " + getNombre() + "\n" + "edad: " + getEdad() + "\n" + "Promedio: " + getPromedio());
    }
}
