import java.util.Scanner;
//ya vimos el concepto de clase

package 05Clases;
class Figura {
    //Atributos
    float radio, diametro, lado, altura, base;

    Scanner entrada = new Scanner(System.in)

    //Menu
    public static menu() {
        int opcion = 0;

        do{
            System.out.println("Menu de las figuritas");
            System.out.println("1.- Calcular el circulo");
            System.out.println("2.- Calcular el cuadrado");
            System.out.println("3.- Calcular el triángulo");
            System.out.println("4.- Calcular el rectángulo");
            System.out.println("5.- Calcular el trapecio");
            System.out.println("6.- Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    calcularcirculo();
                    break;
                case 2:
                    calcularcuadrado();
                    break;
                case 3:
                    calculartriángulo();
                    break;
                case 4:
                    calcularrectángulo();
                    break;
                case 5:
                    calculartrapecio();
                    break;
                case 6:
                    System.out.println("Saliendo....");
                    break;
            
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 6);
    }
    public void calcularcirculo() {
        System.out.println("Ingresa la medida del radio:");
        radio = entrada.nextFloat();
        float area = (float) (Math.PI * radio * radio);
        System.out.println("El area del circulo es:"+area);
    }
    public void calcularcuadrado() {
        System.out.println("Ingresa la medida del lado:");
        lado = entrada.nextFloat();
        float area = lado * lado;
        System.out.println("El area del cuadrado es:"+area);
    }
    public void calculartriángulo() {
        System.out.println("Ingresa la medida del la base:");
        base = entrada.nextFloat();
        System.out.println("Ingresa la medida del la altura:");
        altura = entrada.nextFloat();
        float area = (base * altura) / 2;
        System.out.println("El area del triángulo es:"+area);
    }
    public void calcularrectángulo() {
        System.out.println("Ingresa la medida de la base:");
        lado = entrada.nextFloat();
        System.out.println("Ingresa la medida de la altura:");
        float area = base * altura;
        System.out.println("El area del rectángulo es:"+area);
    }
}
