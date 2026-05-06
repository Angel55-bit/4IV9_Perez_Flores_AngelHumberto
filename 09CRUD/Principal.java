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
                //Registrar al alumno
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
                    //Editar la informacion del alumno
                    int idEdit = entrada.nextInt();
                    for (Estudiante e : lista){
                        if (e.getId() == idEdit){
                            entrada.nextLine();
                            System.out.print("Nuevo nombre: ");
                            e.setNombre(entrada.nextLine());
                            System.out.print("Nueva edad: ");
                            e.setEdad(entrada.nextInt());
                            System.out.println("Datos actualizados con exito");
                        }
                    }

                    break;

                case 3:
                    //Eliminar a un alumno
                    System.out.print("Id del estudiante a eliminar: ");
                    int idElim = entrada.nextInt();
                    lista.removeIf(est -> est.getId() == idElim);
                    System.out.println("Si existia, ha sido eliminado eres libre");

                    break;

                case 4:
                    //Buscar a un alumno
                    System.out.print("Id que se va a buscar: ");
                    int idBusq = entrada.nextInt();
                    for (Estudiante e : lista){
                        if (e.getId() == idBusq){
                            System.out.println("Estudiante encontrado");
                            e.MostrarEstudiante();
                        }
                    }

                    break;

                case 5:
                    //Mostrar la lista completa de todos los exclavos
                    System.out.println("-Lista de alumnos-");
                    for (Estudiante e : lista){
                        e.MostrarEstudiante();
                        System.out.println("----------------");
                    }

                    break;

                case 6:
                    System.out.println("Saliendo del programa");
            
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        }while (opcion != 6);            
    }
}
