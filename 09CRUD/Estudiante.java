public class Estudiante {
    private int id; 
    private String nombre;
    private int edad; 
    private double promedio;

    //realizo el contructor
    public Estudiante(int id, String nombre, int edad, double promedio){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
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

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
     
    public double getPromedio(){
        return promedio;
    }

    public void setPromedio(double promedio){
        this.promedio = promedio;
    }
}
