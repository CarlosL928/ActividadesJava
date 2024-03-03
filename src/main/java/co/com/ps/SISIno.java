package co.com.ps;

import java.util.Scanner;

public class SISIno {

    public static void main(String [] args) {
        int edad =31;

        if (edad>=30) {
            System.out.println("No Puede Entrar");
        }else {
            System.out.println("Si Puede Entrar");
        }

     int diaDeLaSemana=2;

     String elDiaDeLaSemana=switch (diaDeLaSemana){
         case 1-> "Lunes";
         case 2-> "Martes";
         case 3-> "Miercoles";
         case 4-> "Jueves";
         default -> "No valido";
     };
        System.out.println(elDiaDeLaSemana);


    }


}
