import java.util.Scanner;

public class Ejercicios {
    //vamos a hacer una calculadora rapida
    //la calculadora debe de tener un menu
    Scanner entrada = new Scanner(System.in);
    public void menu(){
        //las instrucciones

        System.out.println("Bienvenido a la calculadora");
        System.out.println("Elige la opcion deseada");
        System.out.println("1.-Sumar");
        System.out.println("2.-Restar");
        System.out.println("3.-Multiplicar");
        System.out.println("4.-Salir");

        int opcion = 0;
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicar();
                break;
            case 4;
                System.out.println("Saliendo.....");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
    public void suma(){
        double num1 = 0.00, num2 = 0.00, resultado = 0.00;
        System.out.println("Ingresa el número que deseas sumar");
        num1 = entrada.nextDouble();
        System.out.println("Ingresa el número que deseas sumar");
        num2 = entrada.nextDouble();
            resultado = num1 + num2;
            System.out.println("La suma es: "+resultado);
    }
    public void resta(){
        double num1 = 0.00, num2 = 0.00, resultado = 0.00;
        System.out.println("Ingresa el número que deseas restar");
        num1 = entrada.nextDouble();
        System.out.println("Ingresa el número que deseas restar");
        num2 = entrada.nextDouble();
            resultado = num1 - num2;
            System.out.println("La resta es:"+resultado);
    }
    public void multiplicación() {
        double num1 = 0.00, num2 = 0.00, resultado = 0.00;
        System.out.println("Ingresa el número que deseas multiplicar");
        num1 = entrada.nextDouble();
        System.out.println("Ingresa el número que deseas multiplicar");
        num2 = entrada.nextDouble();
            resultado = num1 * num2;
            System.out.println("La multiplicación es: "+resultado);
    }
    public static void main(String[] args) {
    }
}