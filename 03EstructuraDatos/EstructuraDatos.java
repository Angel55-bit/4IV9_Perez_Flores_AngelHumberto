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
        System.out.println("¿Que quieres hacer?");
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
                double celsius, fahrenheit, kelvin;

                System.out.println("Ingresa la temperatura en Celsius:");
                celsius = entrada.nextDouble();

                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;

                System.out.println("Fahrenheit: " + fahrenheit);
                System.out.println("Kelvin: " + kelvin);
                break;
            case 4:
                int cantidad, numero;
                int positivos = 0;
                int negativos = 0;

                System.out.println("¿Cuantos numeros deseas ingresar?");
                cantidad = entrada.nextInt();

                for (int i = 1; i <= cantidad; i++){
                    System.out.println("Ingresa el numero " + i);
                    numero = entrada.nextInt();

                    if(numero > 0){
                        positivos++;
                    }
                    else if(numero < 0){
                    negativos++;
                    }
                }
                System.out.println("Cantidad de positivos: " + positivos);
                System.out.println("Cantidad de negativos: " + negativos);

                break; 
            case 5:
                System.out.println("Bienvenido a esta hermosa tiendita linda y kawaii");
                System.out.println("Por favor ingrese cuantos elementos va a comprar");

                int elementosproductos;
                float compra = 0;

                System.out.println("¿Qué va a llevar?");
                elementosproductos = entrada.nextInt();

                if(elementosproductos > 0){
                    for(int i = 1; i<= elementosproductos; i++){

                            System.out.println("Ingresa el nombre del producto");
                            String nombreproducto = entrada.next();
                            
                            System.out.println("Ingresa el precio");
                            float precioProducto = entrada.nextFloat();

                            System.out.println("Ingresa la cantidad de producto");
                            int cantidadProducto = entrada.nextInt();

                            float resultado= precioProducto * cantidadProducto;

                            compra = compra + resultado;

                        }
                        System.out.println("El total de la compra es: " + compra);
                
                }   else   {
                        System.out.println("Ingrese solo cantidades positivos");
                        }
                    break;
                case 6:
                    int figura;

                    System.out.println("Selecciona una figura");
                    System.out.println("1.-Circulo");
                    System.out.println("2.-Triangulo");
                    System.out.println("3.-Cuadrado");
                    System.out.println("4.-Rectangulo");
                    System.out.println("5.-Pentagono");

                    figura = entrada.nextInt(); 

                    switch (figura) {
                        case 1:
                            double radio;
                            System.out.println("Ingresa el radio");
                            radio = entrada.nextDouble(); 

                            System.out.println("Area: "+ (Math.PI * radio * radio));
                            System.out.println("Perimetro: " + (2 * Math.PI * radio));

                            break;
                        case 2:
                            double b, h; 
                            System.out.println("Ingresa la base:");
                            b = entrada.nextDouble();

                            System.out.println("Ingresa la altura:");
                            h = entrada.nextDouble();

                            System.out.println("Area: "+ ((b * h)/2));
                            
                            break;
                        case 3:
                            double lado;
                            System.out.println("Ingresa el lado:");
                            lado = entrada.nextDouble(); 

                            System.out.println("Area: " + (lado * lado));
                            System.out.println("Perimetro: "+ (4 * lado));

                            break;
                        case 4:
                            double base, altura; 
                            System.out.println("Ingresa la base: ");
                            base = entrada.nextDouble();

                            System.out.println("Ingresa la altura: ");
                            altura = entrada.nextDouble();

                            System.out.println("Area: "+ (base * altura));
                            System.out.println("Perimetro: "+ (2*(base + altura)));

                            break;
                        case 5:
                            break;
                    
                        default:
                            break;
                    }
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
                        System.out.println("Gracias por usar el programa");
                        letrarepetir = 'n';
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
