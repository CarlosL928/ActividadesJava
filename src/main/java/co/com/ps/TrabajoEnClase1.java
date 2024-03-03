package co.com.ps;

import java.util.Scanner;

public class TrabajoEnClase1 {
    public static void main(String[] args) {

        int numero1, numero2, numero3, total;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scanner.next();

        System.out.println("Hola " + nombre + " Bienvenido");
        System.out.println("Digite tres numeros para conocer su promedio");

        System.out.println("Digite un numero");
        numero1 = scanner.nextInt();

        System.out.println("Digite un segundo numero");
        numero2 = scanner.nextInt();

        System.out.println("Digite un tercer numero");
        numero3 = scanner.nextInt();

        total=(numero1+numero2+numero3);

        System.out.println("El promedio es: "+ (total/3));
        //System.out.println(total/3);

        scanner.close();
    }
}
