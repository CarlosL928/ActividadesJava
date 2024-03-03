package co.com.ps;

import co.com.ps.TrabajoEnClase2;

public class MainTrabajo2 {
    public static void main(String[] args) {

        TrabajoEnClase2 trabajo = new TrabajoEnClase2();


        trabajo.getNombre();
        trabajo.setNombre("Michi");
        trabajo.getColor();
        trabajo.setColor("Gris");
        trabajo.getRaza();
        trabajo.setRaza("Comun europeo");
        trabajo.getPeso();
        trabajo.setPeso(3);



        System.out.println("Nombre " + trabajo.getNombre());
        System.out.println("Color " + trabajo.getColor());
        System.out.println( "Raza " + trabajo.getRaza());
        System.out.println("Peso " + trabajo.getPeso() + " Kg");




    }
}
