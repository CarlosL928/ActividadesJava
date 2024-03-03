package co.com.ps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero =10;
        double fraccion =19.10;
        boolean esVerdad=false;
        char caracter = 'h';


        Integer numeroWrapper=10;
        Double fraccionWrapper=19.10;
        Boolean esVerdadWrapper=true;
        Character caracterWrapper='o';
        //Scanner scanner;
        //scanner= new Scanner(System.in);//le asigne un objeto de tipo scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre= scanner.next();

        System.out.println(nombre +" Bienvenido a Java 1");

        System.out.println("Digite su edad");
        int edad = scanner.nextInt();

        System.out.println(nombre+" y su edad es "+edad);

        scanner.close();




    }

}