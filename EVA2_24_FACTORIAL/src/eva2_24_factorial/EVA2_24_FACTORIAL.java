/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_24_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nume = 0,facto = 1;
  
      
      Scanner captu = new  Scanner (System.in);
      System.out.println("factorial a capturar ?");
      facto= captu.nextInt();
      captu.nextLine();
      
     
    //PARA QUE = 5X4X3X2X1 =120
      for(int i =nume; i >= 1;  i --){
      //OPERACION 
      facto = facto * i;
      }
      
     System.out.println("factorial de: "  + nume + " = " + facto );
      
     
      
      for(int i =1; i <= nume;  i ++){
      //OPERACION 
      facto = facto * i;
      }
      
     System.out.println("factorial de: "  + nume + " = " + facto );
     
     
     
     
     
      
    }
    
}
