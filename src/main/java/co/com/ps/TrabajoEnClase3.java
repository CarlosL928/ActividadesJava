/*package co.com.ps;

public class TrabajoEnClase3 {
    public static void main(String[] args);{

        String [] arregloEstudiantes= new String[3];
        int[] numeros = {1,2,3};

        arregloEstudiantes
    }

}*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TrabajoEnClase3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        List<String> listEst =new ArrayList<>();
        System.out.println("Escriba el nombre de tres Estudiantes");


        for (int i =0; i<=2;i++){

            System.out.println("Digite un nombre");
            listEst.add(scanner.next());
        }
        System.out.println("Los Estudiantes ingresados son: ");
        listEst.forEach(System.out::println);

    }
}

