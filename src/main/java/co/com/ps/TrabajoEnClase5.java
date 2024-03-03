package co.com.ps;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrabajoEnClase5 {

    public static void main(String[] args) {


        List<String> listapalabras = Arrays.asList("Java", "Stream", "Ejemplo", "Programación", "Funcional");
        List<String> listaFiltro = new ArrayList<>();
        for (String filtro : listapalabras) {
            if (filtro.length()>5){
                listaFiltro.add(filtro);
            }

        }
        System.out.println(listaFiltro);

        }

}