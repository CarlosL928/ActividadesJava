package co.com.ps;

import java.util.Scanner;

public class trabajoEnClase4 {
    public static void main(String [] args) {

        Scanner escanner = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int numero = escanner.nextInt();
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else
            System.out.println("El numero es cero");





        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del producto");

        double precio= scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite la categoria seleccionada:");
        System.out.println("Electronica");
        System.out.println("Ropa");
        System.out.println("Alimentos");
        String tipo = scanner.nextLine().toLowerCase();


        double descuento = 0;

        if (tipo.equals("electronica")) {
            descuento =0.90;
            
        }else if (tipo.equals("ropa")) {
            descuento = 0.95;
        } else if (tipo.equals("alimentos")) {
            descuento =0.98;
        }else {
            System.out.println("Seleccione una opción válida.");
        }

        double total = precio * descuento;
        System.out.println( "El precio con descuento es: $" + total);


    };
}



