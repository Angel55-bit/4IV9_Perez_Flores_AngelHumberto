import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Estudiante> lista = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n-- Bienvenido al registro de estudiantes");
            System.out.println("1.-Registrar al estudiante");
            System.out.println("2.-Editar información del estudiante");
            System.out.println("3.-Eliminar al estudiante");
            System.out.println("4.-Buscar al estudiante");
            System.out.println("5.-Mostrar la lista de todos los alumnos");
            System.out.println("6.-Salir");
            opcion = entrada.nextInt();
        }
    }
}
