import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    Scanner sc = new Scanner(System.in);
    ManejodeArchivos mArch = new ManejodeArchivos();

    public static void main(String[] args){
        new Principal().menuPrincipal();
    }

    public void menuPrincipal() {
        int op;
        do{
            System.out.println("\n---Menu Principal---");
            System.out.println("1.-Gestionar a los Estudiantes");
            System.out.println("2.-Gestionar a los Profesores");
            System.out.println("3.-Salir");
            op = sc.nextInt();
            if (op == 1) crudEstudiantes ();
            if (op == 2) crudProfesores();
        } while (op != 3);
    }

    public void crudEstudiantes(){
        ArrayList<Estudiantes> lista = mArch.leer("alumnos.dat");
        int op;
        do {
            System.out.println("\n---Menu Principal---");
            System.out.println("1.-Resgistrar");
            System.out.println("2.-Mostrar");
            System.out.println("3.-Editar");
            System.out.println("4.-Eliminar");
            System.out.println("5.-Volver");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Nombre: ");
                    String n = sc.next();
                    System.out.println("Edad: ");
                    int edad = sc.nextInt();
                    System.out.println("Promedio: ");
                    double promedio = sc.nextDouble();
                    lista.add(new Estudiante(n, edad, id, promedio));
                    mArch.guardar(lista, "alumnos.dat");

                    break;

                case 2:
                    for(Estudiante e : lista) e.mostrarEstudiante();

                    break;

                case 3:
                    System.out.print("Id que se va a editar: ");
                    int idEdit = sc.nextInt();
                    for(Estudiante e : lista){
                        if(e.getId() == idEdit){
                            System.out.print("Nuevo Nombre: ");
                            e.setNombre(sc.next());
                            System.out.print("Nuevo Promedio: ");
                            e.setPromedio(sc.nextDouble());
                            mArch.guardar(lista, "alumnos.dat");
                        }
                    }
            
                default:
                    break;
            }
        }
    }
}
