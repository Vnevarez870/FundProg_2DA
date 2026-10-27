/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_3;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_24_3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     Scanner captu = new Scanner (System.in);
     int numero ;
     
     System.out.println("numero para imprimir el patron " );
     numero = captu.nextInt();
     for(int i = 1 ; i <= numero; i++){
     
        for (int j=1; j <= i ; j++){
    
        
        
        System.out.println("*");
     }
     System.out.println();
     }
   }
   
}
