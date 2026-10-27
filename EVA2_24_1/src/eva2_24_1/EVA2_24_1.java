/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_1;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_24_1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int inicio,fin;
  
      //PRACTICA 1 
      Scanner captu = new  Scanner (System.in);
      System.out.println("numero de inicio ?");
      inicio = captu.nextInt();
      captu.nextLine();
      
      System.out.println("numero final  ?");
      fin = captu.nextInt();
      captu.nextLine();
      
     
    //PRACTICA 1 
      for(int i =inicio; i <= fin;  i ++){
      
      
      System.out.println(i +"-");
          }
      
      
      
      
      
      
      
      
      
      
   }
   
}
