/* 
    Vamos a crear una instancia de un objeto para la entrada de datos estandar y la salida de datos
*/
// libreria scanner
import java.util.Scanner;
class EntradaTexto{
    //metodo principal
    public static void main(String[] args) {
        //instanciar el objeto 
        Scanner entrada = new 
        Scanner(System.in);
        String nombre;
        int edad;
        //entrada
        System.out.println("Escribe tu nombre: ");
        nombre = System.console().readLine();
        
        System.out.println("Hola "+ nombre + "bienvenido a programar muy feo");
        
        System.out.println("Escribe tu edad: ");
            edad = entrada.nextInt();
    }
}