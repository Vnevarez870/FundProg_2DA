/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS2 {

    /**
     * @param args the command line arguments
     */
  
    
    
    public static void main(String[] args) {
    Scanner captu = new Scanner (System.in);
     int promedio;
     String equipo;  
    System.out.println("cual es tu promedio");
    promedio = captu.nextInt();
      
      System.out.println("Estas en un quipo Respresentativo?");
      equipo = captu.nextLine();
      
      //CONDICIONES PARA LA BECA
      if((promedio >= 95) || equipo.equals("S")){
      System.out.println("BECA CONSEDIDA");     
    }else{
    
    System.out.println("BECA CONSEDIDA");
    
}
    
}
}
