import java.io.*;
import java.util.ArrayList;

public class ManejodeArchivos {
    public void guardar(ArrayList lista, String nombre) {
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombre));
            salida.writeObject(lista);
            salida.close();
        }catch (IOException e) {
            System.out.println("Erros al guardar: " + e.getMessage());
        }
    }
    
    public ArrayList leer(String nombre){
        ArrayList lista = new ArrayList();
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombre));
            lista = (ArrayList) entrada.readObject();
            entrada.close();
        }catch (Exception e){

        }
        return lista;
    }
}
