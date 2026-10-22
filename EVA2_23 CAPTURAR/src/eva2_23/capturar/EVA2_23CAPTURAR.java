/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23.capturar;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_23CAPTURAR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //SOLICITAR LAS CALIFICACIONES DE UN GRUPO Y PROMEDIO 
      int califa = 0, cant;
      double promedio ;
      
      Scanner captu = new  Scanner (System.in);
      System.out.println("cuantas calificaciones vas a capturar ?");
      cant= captu.nextInt();
      captu.nextLine();
      for(int i = 0; i < cant ; i ++){
         System.out.println("captura la calificacion: ?");
         califa = califa +  captu.nextInt(); //ACUMULADOR 
         captu.nextLine();
         System.out.println("acumulado = " + califa);
      }
         promedio = califa / (cant * 1.0) ; //COMO VA ENTERO SE PONE *1.0 PARA QUE NO NUMEROS DECIMALES
         System.out.println("Promedio = " + promedio );
         
         
         
      
         
      
         
      
   }
   
}
