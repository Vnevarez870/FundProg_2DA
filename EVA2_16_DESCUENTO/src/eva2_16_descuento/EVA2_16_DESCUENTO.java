/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_16_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
     int edad;
     boolean estudiante;  
    
     System.out.println("intoduce  tu edad");
    edad = captu.nextInt();
   
    captu.nextLine();
    
      
     System.out.println("Eres estudiante? (si = true, no = false:");
     estudiante = captu.nextBoolean();
      
      
     if ((edad < 18 )|| (edad > 60) || (estudiante == true)){
     System.out.println("Tiene descuento");
     }else{
         System.out.println("No tiene descuento");
         
     }
       
     
    
}
    }
   


