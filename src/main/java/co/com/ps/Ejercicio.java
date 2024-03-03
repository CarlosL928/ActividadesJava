package co.com.ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <=10) {
            System.out.println(contador);
            contador++;
            //contador = +2; asi se suma si es mas de 1
        }
        System.out.println("===============================================");

       contador = 0;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <=5);

        System.out.println("===============================================");

        for (int i=1; i<=8; i++) {
            System.out.println(i);
        }
        System.out.println("for array===============================================");

        int [] arreglo = {1,2,3,6,5};

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);

        }

        System.out.println("LIST===============================================");


        List<String> miLista;
//    miLista= List.of("Hola1","Hola2","Hola3"); => Lista Inmutable
        miLista = new ArrayList<>();
        miLista.add("Hola1");
        miLista.add("Hola2");
        miLista.add("Hola3");
        miLista.add("Hola4");

        System.out.println("FOR Each______________________________");

        for(String itemList:miLista){
            System.out.println(itemList);
        }

        System.out.println("FOR Each______________________________");
        miLista.stream().forEach(System.out::println);
        Scanner scanner = new Scanner(System.in);

    for (int i =0; i<=2;i++){

           System.out.println("Digite un nombre");
           miLista.add(scanner.next());
       }
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        miLista.forEach(System.out::println);
        numeros.stream().filter(numero -> numero % 2==1).forEach(System.out::println);

    }
}
