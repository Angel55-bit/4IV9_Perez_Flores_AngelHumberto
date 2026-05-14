public class Persona {
    private String nombre;
    private int edad;

    public Persona(){
    }
    public Persona(String nom, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int edad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}
