package co.com.ps;
//El objeto es un gato

public class TrabajoEnClase2 {
   private String nombre;
   private String color;

   private int peso;

   private String raza;

////GET AND SET

   public String getNombre() {
      return nombre;
   }
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getColor() {
      return color;
   }
   public void setColor(String color) {
      this.color = color;
   }

   public int getPeso() {
      return peso;
   }

   public void setPeso(int peso) {
      this.peso = peso;

   }

   public String getRaza() {
      return raza;
   }

   public void setRaza(String raza) {
      this.raza = raza;
   }

   //Acciones.


   public String Aranar() {
     System.out.println("Le gusta arañar");

       return null;
   }

   public String saltar () {
      System.out.println("Esta saltando");
      return null;

   }
   String cazar;





}

