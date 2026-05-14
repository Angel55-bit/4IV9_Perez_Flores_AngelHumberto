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
                    int numCuartos;
                    do{
                        System.out.println("¿Cuantos cuartos tiene el inmueble? (Mayor a 1 y menor a 5): ");
                        numCuartos = entrada.nextInt();
                        if (numCuartos <= 1 || numCuartos >= 5){
                            System.out.println("Numero no valido. Intente de nuevo");
                        }
                    }while (numCuartos <= 1 || numCuartos >= 5);

                    double totalGeneral = 0;
                    String desglose = "";

                    for (int i = 1; i <= numCuartos; i++) {
                        System.out.println("\nDatos del Cuarto #" + i);
                        System.out.print("Largo (metros): ");
                        double largo = entrada.nextDouble();
                        System.out.print("Ancho (metros): ");
                        double ancho = entrada.nextDouble();
                        
                        System.out.println("Elija el tipo de piso: 1. Porcelanato, 2. Marmoleado, 3. Acrilico");
                        int tipoPiso = entrada.nextInt();
                        
                        double area = largo * ancho;
                        double costoCuarto = 0;
                        String nombrePiso = "";

                        if (tipoPiso == 1) {
                            costoCuarto = area * precioPorcelanato;
                            nombrePiso = "Porcelanato";
                        } else if (tipoPiso == 2) {
                            costoCuarto = area * precioMarmoleado;
                            nombrePiso = "Marmoleado";
                        } else {
                            costoCuarto = area * precioAcrilico;
                            nombrePiso = "Acrilico";
                        }

                        totalGeneral += costoCuarto;
                        desglose += "Cuarto " + i + ": " + nombrePiso + " - Costo: $" + String.format("%.2f", costoCuarto) + "\n";
                    }

                    System.out.println("\n--- RESUMEN DE PRESUPUESTO ---");
                    System.out.println("Cliente: " + nombre + " " + apellidoP + " " + apellidoM);
                    System.out.println("Direccion: " + direccion);
                    System.out.println(desglose);
                    System.out.println("Subtotal: $" + String.format("%.2f", totalGeneral));

                    System.out.print("¿Desea realizar la compra? (s/n): ");
                    char confirmar = entrada.next().charAt(0);

                    if (confirmar == 's' || confirmar == 'S') {
                        double descuento = totalGeneral * 0.0795;
                        double subtotalConDescuento = totalGeneral - descuento;
                        double iva = subtotalConDescuento * 0.16;
                        double totalFinal = subtotalConDescuento + iva;

                        System.out.println("\n--- TICKET DE VENTA ---");
                        System.out.println("Descuento (7.95%): -$" + String.format("%.2f", descuento));
                        System.out.println("IVA (16%): $" + String.format("%.2f", iva));
                        System.out.println("TOTAL FINAL: $" + String.format("%.2f", totalFinal));
                    } else {
                        System.out.println("Compra no realizada.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
            
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
            System.out.println("\n¿Deseas volver al menu principal? (s/n)");
            letrarepetir = entrada.next().charAt(0);

        }while (letrarepetir == 's' || letrarepetir == 'S' && opcion != 4);
    }
}