/*
Vamos a realizar 14 programas dentro de un menu gigante para poner a prueba sus conocimientos de algoritmia
1.- Desarrollar un programa para calcular el bono de un  descuento por edad
2.- Convertir numeros decimales a binarios
3.- Convertir temperaturas entre los 3 principales grados C -> F y K
4.- Realizar un programa para contar numero de positivos y negativos de una serie de numeros
5.- Desarrollar una tienda para agregar productos y precios
6.- Desarrollar un programa para calcular el area y perimetro de 5 diferentes figuras
7.- Desarrollar una tabla
8.- Desarrollar un programa para calcular el factorial con recursividad
9.- Vamos a hacer dibujitos wiii
10.- Desarrollar una figura hueca
11.- Realizar algunos patrones
12.- Realizar un diamante
13.- Desarrollar una calculadora basica + - * /
*/

import java.util.Scanner;

class EstructuraDatos{ 
    public static void main(String[] args) {
       
        //aqui van las variables
        int opcion;
        Scanner entrada = new Scanner(System.in);
        char letrarepetir;
        //aqui van los objetos

        //aqui va el menu
        do {
        System.out.println("1.- Calcular descuento por edad");
        System.out.println("2.- Convertir a numeros binarios");
        System.out.println("3.- Conversion de temperaturas");
        System.out.println("4.- Contar numeros negativos y positivos");
        System.out.println("5.- Tiendita");
        System.out.println("6.-");
        System.out.println("7.-");
        System.out.println("8.-");
        System.out.println("9.-");
        System.out.println("10.-");
        System.out.println("11.-");
        System.out.println("12.-");
        System.out.println("13.-");
        System.out.println("14.- Salir ");

        opcion = entrada.nextInt();

        //ahora tenemos que evaluar la entrada

        switch (opcion){

            case 1:
                int edad;
                double precio, descuento = 0, total;

                System.out.println("Ingresa tu edad:");
                edad = entrada.nextInt();

                System.out.println("Ingresa el precio del producto:");
                precio = entrada.nextDouble();

                if(edad >= 60){
                    descuento = precio * 0.30;
                }
                else if(edad >= 18){
                    descuento = precio * 0.10;
                }
                else{
                    descuento = precio * 0.05;
                }

                total = precio - descuento;

                System.out.println("Descuento: " + descuento);
                System.out.println("Total a pagar: " + total);
                break;
            case 2:
                //convertir un numero decimal a binario
                System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                int numbinario;
                String guardarbinario ="";
                numbinario = entrada.nextInt();

                if(numbinario > 0){
                    //realizamos el mod 2
                    while(numbinario > 0){
                        if(numbinario%2 == 0){
                        guardarbinario = "0" + guardarbinario;
                        }
                        else {
                            guardarbinario = "1" + guardarbinario;
                        }
                        numbinario = (int)numbinario/2;
                    }
                }else if(numbinario == 0){
                    guardarbinario = "0";
                }else {
                    guardarbinario = "no se puede convertir ese numero, solo acepta positivos";
                }
                System.out.println("El numero convertido a binario es: "  + guardarbinario);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Bienvenido a esta hermosa tiendita linda y kawaii");
                System.out.println("Por favor ingrese cuantos elementos va a comprar");
                int elementosproductos = 0;
                elementosproductos = entrada.nextInt();
                if(elementosproductos > 0){
                    for(int i = 1; i<=
                        elementosproductos; i++){
                            System.out.println("Ingresa el nombre del producto");
                            String nombreproducto ="";
                            nombreproducto = entrada.next();
                            System.out.println("Ingresa el precio");
                            float precio = 0.0;
                            precio = entrada.nextFloat();
                            float resultado;
                            System.out.println("Ingresa la cantidad de producto");
                            int cantidad = 0;
                            precio = entrada.nextInt();
                            resultado = precio + cantidad;
                            float compra;
                            compra = resultado + compra;

                        }
                        System.out.println("El total de la compra es: " + compra");
                
                }else{
                    System.out.println("Ingrese solo cantidades positivos");
                    }
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            default:
                break;
            }
            System.out.println("Deseas repetir el programa escribe s o S para si");
            letrarepetir = entrada.next().charAt
            (0);
        }while (letrarepetir == 's' || letrarepetir == 'S');
   
    }
}