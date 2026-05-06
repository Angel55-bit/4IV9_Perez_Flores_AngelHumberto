public class gato extends animal {
    
    private int num_vidas;

    public Gato(){

    }
    //quiero acceder a los atributos de la clase padre
    public gato(String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
        //como puedo obtenerlo ocupo la palabra reservada super
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }
}
