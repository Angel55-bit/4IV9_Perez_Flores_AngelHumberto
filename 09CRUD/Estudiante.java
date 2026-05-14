public class Estudiante {
    private int id; 
    private String nombre;

    //realizo el contructor
    public Estudiante(int id, String nombre, int edad, double promedio){
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
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
