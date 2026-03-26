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
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
