import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        int opcion;

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

                    listaEstudiantes.add(new Estudiante(id, nom, edad, promedio));
                    System.out.println("Estudiante guardado"); 
                    break;

                case 2:
                    //Editar la informacion del alumno
                    System.out.print("Ingresa el Id del estudiante a modificar");
                    int idEdit = entrada.nextInt();
                    for (Estudiante e : listaEstudiantes){
                        if (e.getId() == idEdit){
                            System.out.print("Nuevo Nombre: ");
                            e.setNombre(entrada.next());
                            System.out.print("Nuevo promedio: ");
                            e.setPromedio(entrada.nextDouble());
                            System.out.println("Datos actualizados");
                        }
                    }

                    break;

                case 3:
                    //Eliminar a un alumno
                    System.out.print("Id del estudiante a eliminar: ");
                    int idElim = entrada.nextInt();
                    listaEstudiantes.removeIf(e -> e.getId() == idElim);
                    System.out.println("Si existia, ha sido eliminado eres libre");

                    break;

                case 4:
                    //Buscar a un alumno
                    System.out.print("Id que se va a buscar: ");
                    int idBusq = entrada.nextInt();
                    for (Estudiante e : listaEstudiantes){
                        if (e.getId() == idBusq){
                            System.out.println("Estudiante encontrado");
                            e.mostrarEstudiante();
                        }
                    }

                    break;

                case 5:
                    //Mostrar la lista completa de todos los exclavos
                    System.out.println("-Lista de alumnos-");
                    for (Estudiante e : listaEstudiantes){
                        e.mostrarEstudiante();
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
