/* Vamos a realizar el examen que nos pidio el profe jimy :)*/

import java.util.Scanner;

class Examen {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in)
        int opcion;
        char letrarepetir;   

        //Variables para los datos del cliente
        String nombre = "", apP = "", apM = "", direccion = "";

        //Variables para los precios de los pisos
        double precioPorcelanato = 22.35;
        double precioMarmoleado = 34.27;
        double precioAcrilico = 22.92;

        do{
            System.out.println("--- MENU VENTA DE PISOS ---");
            System.out.println("1.- Ingresar datos del cliente");
            System.out.println("2.- Ver tipos de piso y precios");
            System.out.println("3.- Calcular presupuesto por cuartos");
            System.out.println("4.- Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("--- Registro de Cliente ---");
                    System.out.print("Nombre: ");
                    nombre = entrada.nextLine();
                    System.out.print("Apellido Paterno: ");
                    apellidoP = entrada.nextLine();
                    System.out.print("Apellido Materno: ");
                    apellidoM = entrada.nextLine();
                    System.out.print("Fecha de Nacimiento: ");
                    fechaNac = entrada.nextLine();
                    System.out.print("Direccion Residencial: ");
                    direccion = entrada.nextLine();
                    System.out.println("Datos guardados correctamente.");
                    break;

                case 2: 
                    System.out.println("--- Catalogo de Productos ---");
                    System.out.println("a. Porcelanato: $" + precioPorcelanato + " el metro cuadrado");
                    System.out.println("b. Marmoleado: $" + precioMarmoleado + " el metro cuadrado");
                    System.out.println("c. Acrilico: $" + precioAcrilico + " el metro cuadrado");
                    break;

                case 3:

                    break;

                case 4:
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
