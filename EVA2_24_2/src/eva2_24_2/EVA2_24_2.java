/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_24_2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     int inicio,fin;
  
      //PRACTICA 1 
      Scanner captu = new  Scanner (System.in);
      System.out.println("numero por multiplicar ?");
      inicio = captu.nextInt();
      captu.nextLine();
     
      
      for(int i =1 ; i <=10 ;  i ++){
      System.out.println(inicio + "x" + i +"=" + (inicio * i));
     
      }
      {
     
      }    
      
   }
   
}
