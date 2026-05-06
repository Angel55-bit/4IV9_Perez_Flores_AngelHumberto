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
            System.out.print("Selecciona una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa Id: ");
                    int id = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingresa Nombre: ");
                    String nom = entrada.nextLine();
                    System.out.print("Ingresa edad: ");
                    int edad = entrada.nextInt();
                    System.out.print("Ingresa Promedio: ");
                    double promedio = entrada.nextDouble();

                    lista.add(new Estudiante(id, nom, edad, promedio))
                    System.out.println("Estudiante guardado"); 
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;
            
                default:
                    break;
            }
        }
    }
}
